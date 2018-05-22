package com.codekili.geeknewskotlin.component

import com.codekili.geeknewskotlin.util.RxUtil
import io.reactivex.Flowable
import io.reactivex.disposables.Disposable
import io.reactivex.functions.Consumer
import io.reactivex.processors.FlowableProcessor
import io.reactivex.processors.PublishProcessor


/**
 * Created by Administrator on 2018/5/15 0015.
 */

class RxBus{

    companion object {
        fun getDefault():RxBus{
            return RxBusHolder.sInstance
        }
        object RxBusHolder{
            var sInstance=RxBus()
        }
    }

    var bus:FlowableProcessor<Object>

    constructor(){
        bus = PublishProcessor.create()
    }
    fun post(o:Object){
        bus.onNext(o)
    }
    fun <T> toFlowable(evenType:Class<T>):Flowable<T> {
        return bus.ofType(evenType)
    }
    // 封装默认订阅
    fun <T> toDefaultFlowable(eventType:Class<T>,act: Consumer<T>):Disposable{
        return bus.ofType(eventType).compose(RxUtil.rxSchedulerHelper()).subscribe(act)
    }

}
