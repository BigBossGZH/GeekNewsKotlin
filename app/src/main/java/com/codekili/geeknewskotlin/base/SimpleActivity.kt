package com.codekili.geeknewskotlin.base

import android.app.Activity
import android.os.Bundle
import android.support.v7.widget.Toolbar
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
        App.instance?.let {
            it.addActivity(this)
        }
        initEventAndData();
    }

    protected fun setToolBar(toolbar: Toolbar, title: String) {
        toolbar.title = title
        setSupportActionBar(toolbar)
        supportActionBar?.let {
            it.setDisplayHomeAsUpEnabled(true)
            it.setDisplayShowHomeEnabled(true)
        }
        toolbar.setNavigationOnClickListener {
            onBackPressed()
        }

    }


    protected open fun onViewCreated() {

    }

    abstract fun getLayout(): Int
    abstract fun initEventAndData()

}