package com.codekili.geeknewskotlin.app

import android.app.Activity
import android.app.Application
import android.support.v7.app.AppCompatDelegate
import com.codekili.geeknewskotlin.di.component.AppComponent

/**
 * Created by Administrator on 2018/5/22 0022.
 */
class App :Application(){
    private var allActivities: MutableSet<Activity>? = null
    companion object {
        @get:Synchronized
        var instance:App?=null
        var appComponent: AppComponent? = null
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

    }
}