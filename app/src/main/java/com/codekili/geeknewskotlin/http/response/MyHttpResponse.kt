package com.codekili.geeknewskotlin.http.response

/**
 * Created by Administrator on 2018/5/21 0021.
 */
class MyHttpResponse<T>{
    var code=0
    var message:String?=null
    var data:T?=null

}