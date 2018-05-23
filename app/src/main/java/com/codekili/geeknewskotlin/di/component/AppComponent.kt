package com.codekili.geeknewskotlin.di.component

import com.codekili.geeknewskotlin.app.App
import com.codekili.geeknewskotlin.di.module.AppModule
import com.codekili.geeknewskotlin.di.module.HttpModule
import com.codekili.geeknewskotlin.model.DataManager
import com.codekili.geeknewskotlin.model.db.RealmHelper
import com.codekili.geeknewskotlin.model.http.RetrofitHelper
import com.codekili.geeknewskotlin.model.prefs.ImplPreferencesHelper
import dagger.Component
import javax.inject.Singleton

/**
 * Created by Administrator on 2018/5/22 0022.
 */
@Singleton
@Component(modules =[AppModule::class,HttpModule::class])
interface AppComponent{
    fun getContext():App // 提供App的Context
    fun getDateManager(): DataManager //数据中心
//    fun retrofitHelper():RetrofitHelper //提供http的帮助类
//    fun realmHelper():RealmHelper //提供数据库帮助类
//    fun preferencesHelper(): ImplPreferencesHelper //提供sp帮助类

}