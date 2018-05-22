package com.codekili.geeknewskotlin.http.response

/**
 * Created by Administrator on 2018/5/21 0021.
 */
class WXHttpResponse<T>{
    var code=0
    var msg:String?=null
    var newslist:T?=null
}