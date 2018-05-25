package com.codekili.geeknewskotlin.base

import com.codekili.geeknewskotlin.component.RxBus
import io.reactivex.disposables.CompositeDisposable
import io.reactivex.disposables.Disposable
import io.reactivex.functions.Consumer

/**
 * Created by Administrator on 2018/5/10 0010.
 */
open class RxPresenter<T:BaseView>:BasePresenter<T>{
    var mView:T?=null
    var mCompositeDisposable:CompositeDisposable?=null

    protected  fun unSubscrible(){
        mCompositeDisposable?.let {
            it.clear()
        }
    }
    protected  fun addSubscribe(subscription: Disposable){
        if (mCompositeDisposable == null) {
            mCompositeDisposable = CompositeDisposable()
        }
        mCompositeDisposable!!.add(subscription)
    }
    protected fun <U> addRxBusSubscribe(eventType:Class<U> ,act: Consumer<U>){
        if (mCompositeDisposable == null) {
            mCompositeDisposable = CompositeDisposable()
        }
        mCompositeDisposable!!.add(RxBus.getDefault().toDefaultFlowable(eventType,act))
    }

    override fun attachView(view: T) {
        this.mView =view
    }

    override fun detachView() {
        this.mView=null
        unSubscrible()
    }

}