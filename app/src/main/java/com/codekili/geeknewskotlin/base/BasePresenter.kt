package com.codekili.geeknewskotlin.base

/**
 * Created by Administrator on 2018/5/10 0010.
 */
interface BasePresenter<T: BaseView> {
    fun attachView(view: T)
    fun detachView()
}