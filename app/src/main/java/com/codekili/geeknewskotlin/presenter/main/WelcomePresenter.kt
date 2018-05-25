package com.codekili.geeknewskotlin.presenter.main

import com.codekili.geeknewskotlin.base.RxPresenter
import com.codekili.geeknewskotlin.base.contract.main.WelcomeContract
import com.codekili.geeknewskotlin.model.DataManager
import com.codekili.geeknewskotlin.model.bean.WelcomeBean
import com.codekili.geeknewskotlin.util.RxUtil
import io.reactivex.Flowable
import java.util.concurrent.TimeUnit
import javax.inject.Inject

/**
 * Created by Administrator on 2018/5/24 0024.
 */
class WelcomePresenter @Inject constructor(val mDataManager: DataManager) : RxPresenter<WelcomeContract.View>(), WelcomeContract.Presenter {
    companion object {
        val RES = "1080*1776"
        val COUNT_DOWN_TIME = 2200L
    }


    override fun getWelcomeData() {
        addSubscribe(mDataManager.fetchWelcomeInfo(RES)
                .compose(RxUtil.rxSchedulerHelper<WelcomeBean>()).subscribe {
                    mView?.showcontent(it)
                    startCuntDown()
                })
    }

    fun startCuntDown() {
        addSubscribe(Flowable.timer(COUNT_DOWN_TIME, TimeUnit.MILLISECONDS)
                .compose(RxUtil.rxSchedulerHelper<Long>()).subscribe {
                    mView?.jumpToMain()
                })
    }

}