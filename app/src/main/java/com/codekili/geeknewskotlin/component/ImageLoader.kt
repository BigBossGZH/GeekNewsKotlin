package com.codekili.geeknewskotlin.component

import android.app.Activity
import android.content.Context
import android.support.v4.app.FragmentActivity
import android.widget.ImageView
import com.bumptech.glide.Glide
import com.bumptech.glide.load.resource.drawable.DrawableTransitionOptions.withCrossFade

/**
 * Created by Administrator on 2018/5/29 0029.
 */
class ImageLoader {
    companion object {
        fun load(context: Context, url: String, iv: ImageView) {

        }

        fun load(activity: Activity, url: String, iv: ImageView) {
            if (!(activity as FragmentActivity).supportFragmentManager.isDestroyed) {
                Glide.with(activity).load(url).transition(withCrossFade()).into(iv)
            }
        }
    }
}