package com.codekili.geeknewskotlin.model.bean

/**
 * Created by codeest on 16/11/27.
 */

class GoldListBean {

    var objectId: String? = null

    var createdAt: String? = null

    var title: String? = null

    var collectionCount: Int = 0

    var commentsCount: Int = 0

    var url: String? = null

    var user: GoldListUserBean? = null

    var screenshot: GoldListScreenshotBean? = null

    class GoldListUserBean {
        var username: String? = null
    }

    class GoldListScreenshotBean {
        var url: String? = null
    }
}
