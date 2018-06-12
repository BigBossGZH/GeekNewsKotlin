package com.codekili.geeknewskotlin.app

import android.app.Activity
import android.app.Application
import android.content.Context
import android.support.multidex.MultiDex
import android.support.v7.app.AppCompatDelegate
import android.util.DisplayMetrics
import android.view.WindowManager
import com.codekili.geeknewskotlin.component.InitializeService
import com.codekili.geeknewskotlin.di.component.AppComponent
import com.codekili.geeknewskotlin.di.component.DaggerAppComponent
import com.codekili.geeknewskotlin.di.module.AppModule
import com.codekili.geeknewskotlin.di.module.HttpModule
import io.realm.Realm

/**
 * Created by Administrator on 2018/5/22 0022.
 */
class App :Application(){
    private var allActivities: MutableSet<Activity>? = null
    companion object {
        @get:Synchronized
        var instance:App?=null
        var appComponent: AppComponent? = null
            get() {
                if (field == null) {
                    field = DaggerAppComponent.builder().appModule(AppModule(instance!!))
                                    .httpModule(HttpModule()).build()
                }
                return field
            }
        var SCREEN_WIDTH = -1
        var SCREEN_HEIGHT = -1
        var DIMEN_RATE = -1.0F
        var DIMEN_DPI = -1

    }
    init {
        AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_NO)

    }

    override fun onCreate() {
        super.onCreate()
         instance=this

        //初始化屏幕宽高
        getScreenSize()

        //初始化数据库
        Realm.init(applicationContext)

        //在子线程中完成其他初始化
        InitializeService.start(this)
    }

    override fun attachBaseContext(base: Context?) {
        super.attachBaseContext(base)
        MultiDex.install(base)
    }

    fun addActivity(act: Activity) {
        if (allActivities == null) {
            allActivities = HashSet()
        }
        allActivities!!.add(act)
    }

    fun removeActivity(act: Activity) {
        allActivities?.let {
            it.remove(act)
        }
    }

    fun exitApp() {
        allActivities?.let {
            synchronized(it) {
                for (act in it) {
                    act.finish()
                }
            }
        }
        android.os.Process.killProcess(android.os.Process.myPid())
        System.exit(0)
    }

    fun getScreenSize() {
        val windowManager = this.getSystemService(Context.WINDOW_SERVICE) as WindowManager
        val dm = DisplayMetrics()
        val display = windowManager.defaultDisplay
        display.getMetrics(dm)
        DIMEN_RATE = dm.density / 1.0f
        DIMEN_DPI = dm.densityDpi
        SCREEN_WIDTH = dm.widthPixels
        SCREEN_HEIGHT = dm.heightPixels
        if (SCREEN_WIDTH > SCREEN_HEIGHT) {
            val t = SCREEN_HEIGHT
            SCREEN_HEIGHT = SCREEN_WIDTH
            SCREEN_WIDTH = t
        }
    }


}