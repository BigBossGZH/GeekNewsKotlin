package com.codekili.geeknewskotlin.base

import android.annotation.SuppressLint
import android.app.Activity
import android.os.Bundle
import butterknife.Unbinder
import com.codekili.geeknewskotlin.app.App
import me.yokeyword.fragmentation.SupportActivity

/**
 * Created by Administrator on 2018/5/23 0023.
 */
abstract class SimpleActivity : SupportActivity() {
    var mContext:Activity?=null
    var mUnBinder:Unbinder?=null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(getLayout())
        mContext =this
        onViewCreated();
//        App.instance.
    }

    private fun onViewCreated() {

    }

    abstract fun getLayout(): Int


}