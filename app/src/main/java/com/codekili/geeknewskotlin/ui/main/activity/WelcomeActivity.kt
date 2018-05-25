package com.codekili.geeknewskotlin.ui.main.activity

import com.codekili.geeknewskotlin.base.BaseActivity
import com.codekili.geeknewskotlin.base.contract.main.WelcomeContract
import com.codekili.geeknewskotlin.model.bean.WelcomeBean
import com.codekili.geeknewskotlin.presenter.main.WelcomePresenter

/**
 * Created by Administrator on 2018/5/23 0023.
 */
class WelcomeActivity :BaseActivity<WelcomePresenter>(), WelcomeContract.View{
    override fun getLayout(): Int {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun initEventAndData() {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun initInject() {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun showcontent(welcomeBean: WelcomeBean) {
    }

    override fun jumpToMain() {
    }

}