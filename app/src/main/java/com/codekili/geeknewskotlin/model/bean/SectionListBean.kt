package com.codekili.geeknewskotlin.model.bean

/**
 * Created by codeest on 16/8/28.
 */

class SectionListBean {

    /**
     * description : 看别人的经历，理解自己的生活
     * id : 1
     * name : 深夜惊奇
     * thumbnail : http://pic3.zhimg.com/91125c9aebcab1c84f58ce4f8779551e.jpg
     */

    var data: List<DataBean>? = null

    class DataBean {
        var description: String? = null
        var id: Int = 0
        var name: String? = null
        var thumbnail: String? = null
    }
}
