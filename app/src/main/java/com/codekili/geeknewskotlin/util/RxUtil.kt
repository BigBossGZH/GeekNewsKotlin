package com.codekili.geeknewskotlin.util

import com.codekili.geeknewskotlin.http.exception.ApiException
import com.codekili.geeknewskotlin.http.response.GankHttpResponse
import com.codekili.geeknewskotlin.http.response.MyHttpResponse
import com.codekili.geeknewskotlin.http.response.WXHttpResponse
import io.reactivex.*
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.schedulers.Schedulers

/**
 * Created by Administrator on 2018/5/16 0016.
 */
class RxUtil {
    companion object {

        /**
         * 统一线程处理
         * @param <T>
         * @return
         */
        fun <T> rxSchedulerHelper(): FlowableTransformer<T, T> { //compose简化线程
            return FlowableTransformer {
                 it.subscribeOn(Schedulers.io())
                        .observeOn(AndroidSchedulers.mainThread())
            }
        }

        /**
         * 统一返回结果处理
         * @param <T>
         * @return
         */
        fun <T> handleResult(): FlowableTransformer<GankHttpResponse<T>, T> { //compose判断结果
            return FlowableTransformer{
                it.flatMap {
                    if (!it.error) {
                        createData(it.results)
                    } else {
                        Flowable.error(ApiException("服务器返回error"))
                    }
                }
            }
        }



        /**
         * 统一返回结果处理
         * @param <T>
         * @return
         */
        fun <T> handleWXResult():FlowableTransformer<WXHttpResponse<T>,T>{
            return FlowableTransformer {
                it.flatMap {
                    if (it.code == 200) {
                        createData(it.newslist)
                    }else{
                        Flowable.error(ApiException(it.msg,it.code))
                    }
                }
            }
        }

        /**
         * 统一返回结果处理
         * @param <T>
         * @return
         */
        fun <T> handleMyResult():FlowableTransformer<MyHttpResponse<T>,T>{
            return FlowableTransformer {
                it.flatMap {
                    if (it.code==200){
                        createData(it.data)
                    }else{
                        Flowable.error {
                            ApiException(it.message,it.code)
                        }
                    }
                }
            }
        }


        /**
         * 统一返回结果处理
         * @param <T>
         * @return
         */
        fun <T> HandleGoldResult():FlowableTransformer<GankHttpResponse<T>,T>{
            return FlowableTransformer<GankHttpResponse<T>,T>{
                it.flatMap {
                    if (it.results != null) {
                        createData(it.results)
                    }else{
                         Flowable.error(ApiException("服务器返回error"))
                    }
                }
            }
        }


        private fun <T> createData(t: T): Flowable<T> {
            return Flowable.create(FlowableOnSubscribe<T> {
                try {
                    it.onNext(t)
                    it.onComplete()
                } catch (e: Exception) {
                    it.onError(e)
                }
            }, BackpressureStrategy.BUFFER)
        }
    }
}