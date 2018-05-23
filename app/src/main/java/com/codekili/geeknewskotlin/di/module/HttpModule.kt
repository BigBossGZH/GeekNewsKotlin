package com.codekili.geeknewskotlin.di.module

import com.codekili.geeknewskotlin.app.App
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

/**
 * Created by Administrator on 2018/5/22 0022.
 */
@Module
class HttpModule {

    @Singleton
    @Provides
    fun provideNoThing(): String {
        App.appComponent
        return "nothing"
    }
}