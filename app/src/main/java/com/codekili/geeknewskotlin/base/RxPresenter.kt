package com.codekili.geeknewskotlin.base

/**
 * Created by Administrator on 2018/5/10 0010.
 */
class RxPresenter<T:BaseView>:BasePresenter<T>{
    var mView:T?=null
    var mCompositeDis
    override fun attachView(view: T) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun detachView() {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

}