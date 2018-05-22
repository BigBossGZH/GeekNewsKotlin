package com.codekili.geeknewskotlin.component

import android.app.IntentService
import android.content.Intent
import com.codekili.geeknewskotlin.app.App
import com.codekili.geeknewskotlin.widget.AppBlockCanaryContext
import com.github.moduth.blockcanary.BlockCanary
import com.orhanobut.logger.AndroidLogAdapter
import com.orhanobut.logger.Logger
import com.squareup.leakcanary.LeakCanary

/**
 * Created by Administrator on 2018/5/22 0022.
 */
class InitializeService:IntentService{
    val ACTION_INIT="initApplication"


    constructor(): super("InitializeService")

    override fun onHandleIntent(intent: Intent?) {
        intent?.let {
            val action = intent.action
            if (ACTION_INIT.equals(action)){
                initApplication()
            }
        }
    }

    private fun initApplication() {
        //初始化日志
        Logger.addLogAdapter(AndroidLogAdapter())

        //初始化内存泄漏检测
        LeakCanary.install(App.instance)

        //初始化过度绘制检测
        BlockCanary.install(applicationContext,AppBlockCanaryContext())


    }

}