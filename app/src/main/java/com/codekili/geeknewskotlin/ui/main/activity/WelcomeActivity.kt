package com.codekili.geeknewskotlin.ui.main.activity

import android.content.Intent
import com.bumptech.glide.Glide
import com.codekili.geeknewskotlin.MainActivity
import com.codekili.geeknewskotlin.R
import com.codekili.geeknewskotlin.base.BaseActivity
import com.codekili.geeknewskotlin.base.contract.main.WelcomeContract
import com.codekili.geeknewskotlin.component.ImageLoader
import com.codekili.geeknewskotlin.model.bean.WelcomeBean
import com.codekili.geeknewskotlin.presenter.main.WelcomePresenter
import kotlinx.android.synthetic.main.activity_welcome.*

/**
 * Created by Administrator on 2018/5/23 0023.
 */
class WelcomeActivity :BaseActivity<WelcomePresenter>(), WelcomeContract.View{

    override fun initInject() {
        getActivityComponent().inject(this)
    }

    override fun initEventAndData() {
        this.supportFragmentManager
    }

    override fun getLayout(): Int {
        return R.layout.activity_welcome
    }


    override fun showcontent(welcomeBean: WelcomeBean) {
        ImageLoader.load(this, welcomeBean.img, iv_welcome_bg)
        iv_welcome_bg.animate().scaleX(1.12f).scaleY(1.12f).setDuration(2000)
                .setStartDelay(100).start()
        tv_welcome_author.text = welcomeBean.text
    }

    override fun jumpToMain() {
        var intent = Intent()
        intent.setClass(this, MainActivity::class.java)
        startActivity(intent)
        finish()
        overridePendingTransition(android.R.anim.fade_in, android.R.anim.fade_out)
    }

    override fun onDestroy() {
        Glide.with(this).clear(iv_welcome_bg)
        super.onDestroy()
    }
}