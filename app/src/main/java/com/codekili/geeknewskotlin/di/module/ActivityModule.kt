package com.codekili.geeknewskotlin.di.module

import android.app.Activity
import com.codekili.geeknewskotlin.di.scope.ActivityScope
import dagger.Module
import dagger.Provides

/**
 * Created by Administrator on 2018/5/23 0023.
 */
@Module
class ActivityModule constructor(var mActivity:Activity){

    @Provides
    @ActivityScope
    fun provideActivity():Activity{
        return mActivity
    }


}