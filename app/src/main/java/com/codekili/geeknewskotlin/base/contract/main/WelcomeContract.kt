package com.codekili.geeknewskotlin.base.contract.main

import com.codekili.geeknewskotlin.base.BasePresenter
import com.codekili.geeknewskotlin.base.BaseView
import com.codekili.geeknewskotlin.model.bean.WelcomeBean

/**
 * Created by Administrator on 2018/5/24 0024.
 */
interface WelcomeContract{
    interface View :BaseView{
        fun showcontent(welcomeBean:WelcomeBean)
        fun jumpToMain()
    }
     interface Presenter :BasePresenter<View>{
         fun getWelcomeData();
     }
}