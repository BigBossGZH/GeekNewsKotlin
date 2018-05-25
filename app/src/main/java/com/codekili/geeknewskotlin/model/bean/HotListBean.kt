package com.codekili.geeknewskotlin.model.bean

/**
 * Created by codeest on 16/8/21.
 */

class HotListBean {

    /**
     * news_id : 8701066
     * url : http://news-at.zhihu.com/api/2/news/8701066
     * thumbnail : http://pic1.zhimg.com/f5169eb70e3a6823737dc55fbab051c0.jpg
     * title : 瞎扯 · 如何正确地吐槽
     */

    var recent: List<RecentBean>? = null

    class RecentBean {
        var news_id: Int = 0
        var url: String? = null
        var thumbnail: String? = null
        var title: String? = null
        var readState: Boolean = false
    }
}
