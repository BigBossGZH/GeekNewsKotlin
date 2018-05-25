package com.codekili.geeknewskotlin.component

import android.app.IntentService
import android.content.Context
import android.content.Intent
import com.codekili.geeknewskotlin.app.App
import com.codekili.geeknewskotlin.widget.AppBlockCanaryContext
import com.github.moduth.blockcanary.BlockCanary
import com.orhanobut.logger.AndroidLogAdapter
import com.orhanobut.logger.Logger
import com.squareup.leakcanary.LeakCanary
import com.tencent.smtt.sdk.QbSdk

/**
 * Created by Administrator on 2018/5/22 0022.
 */
class InitializeService:IntentService{


    constructor(): super("InitializeService")

    companion object {
        val ACTION_INIT="initApplication"

        fun start(context:Context){
            var intent = Intent(context,InitializeService::class.java)
            intent.setAction(ACTION_INIT)
            context.startService(intent)
        }
    }

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
        BlockCanary.install(applicationContext,AppBlockCanaryContext()).start()

        //初始化tbs x5 webview
        QbSdk.initX5Environment(applicationContext, object :QbSdk.PreInitCallback{
            override fun onCoreInitFinished() {

            }

            override fun onViewInitFinished(p0: Boolean) {
            }
        })

    }

}