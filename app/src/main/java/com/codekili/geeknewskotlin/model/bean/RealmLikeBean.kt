package com.codekili.geeknewskotlin.model.bean

import java.io.Serializable

import io.realm.RealmObject
import io.realm.annotations.PrimaryKey

/**
 * Created by codeest on 16/8/23.
 * 用于数据库的bean 种类包括 新闻、技术、福利
 */

open class RealmLikeBean : RealmObject(), Serializable {

    @PrimaryKey
    var id: String? = null

    var image: String? = null

    var title: String? = null

    var url: String? = null

    var type: Int = 0

    var time: Long = 0
}
