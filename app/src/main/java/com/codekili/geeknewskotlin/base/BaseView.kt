package com.codekili.geeknewskotlin.base

/**
 * Created by Administrator on 2018/5/10 0010.
 */
interface BaseView {
    fun showErrorMsg(msg: String)
    fun useNighMode(isNight: Boolean)
    fun stateError()
    fun stateEmpty()
    fun stateLoading()
    fun stateMain()

}