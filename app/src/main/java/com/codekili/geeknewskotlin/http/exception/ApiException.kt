package com.codekili.geeknewskotlin.http.exception

/**
 * Created by Administrator on 2018/5/21 0021.
 */
class ApiException : Exception {

    var code = 0

    constructor(message: String?) : super(message)

    constructor(message: String?, code: Int) : super(message) {
        this.code = code
    }

}