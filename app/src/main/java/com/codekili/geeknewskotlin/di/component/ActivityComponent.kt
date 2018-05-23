package com.codekili.geeknewskotlin.di.component

import android.app.Activity
import com.codekili.geeknewskotlin.MainActivity
import com.codekili.geeknewskotlin.di.module.ActivityModule
import com.codekili.geeknewskotlin.di.scope.ActivityScope
import com.codekili.geeknewskotlin.ui.main.activity.WelcomeActivity
import dagger.Component
import javax.inject.Singleton

/**
 * Created by Administrator on 2018/5/23 0023.
 */
@ActivityScope
@Component(dependencies= [(AppComponent::class)],modules = [ActivityModule::class])
interface ActivityComponent{
     fun getActivity(): Activity

     fun inject(welcomeActivity: WelcomeActivity)

     fun inject(mainActivity: MainActivity)


}