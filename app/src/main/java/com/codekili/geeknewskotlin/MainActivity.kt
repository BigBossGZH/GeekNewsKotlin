package com.codekili.geeknewskotlin

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
       // throw IllegalArgumentException("aaaa")
//        Thread(Runnable {
////            Toast()
//        }).start()
    }
    fun Toast(s:String="aaaa"){
        Toast.makeText(this,s,Toast.LENGTH_SHORT).show()
    }
}
