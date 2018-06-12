package com.codekili.geeknewskotlin.util

import android.support.design.widget.Snackbar
import android.view.View

/**
 * Created by Administrator on 2018/5/23 0023.
 */
class SnackbarUtil{
    companion object {
        //-1 Snackbar.LENGTH_SHORT 默认为Snackbar.LENGTH_LONG
        fun show(view: View, msg:String,duration:Int=Snackbar.LENGTH_LONG) {
            Snackbar.make(view,msg,Snackbar.LENGTH_LONG).show()
        }

    }
}