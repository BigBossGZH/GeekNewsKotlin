package com.codekili.geeknewskotlin.model.bean

/**
 * Created by codeest on 16/12/22.
 */

class NodeBean {


    /**
     * id : 300
     * name : programmer
     * url : http://www.v2ex.com/go/programmer
     * title : 程序员
     * title_alternative : Programmer
     * topics : 14214
     * stars : 2806
     * header : While code monkeys are not eating bananas, they're coding.
     * footer : null
     * created : 1293396163
     * avatar_normal : //cdn.v2ex.co/navatar/94f6/d7e0/300_mini.png?m=1482295939
     * avatar_normal : //cdn.v2ex.co/navatar/94f6/d7e0/300_normal.png?m=1482295939
     * avatar_large : //cdn.v2ex.co/navatar/94f6/d7e0/300_large.png?m=1482295939
     */

    var title: String? = null
    var topics: Int = 0
    var stars: Int = 0
    var header: String? = null
    private var avatar_normal: String? = null

    fun getavatar_normal(): String? {
        return avatar_normal
    }

    fun setavatar_normal(avatar_normal: String) {
        this.avatar_normal = avatar_normal
    }
}
