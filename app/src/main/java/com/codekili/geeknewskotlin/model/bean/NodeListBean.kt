package com.codekili.geeknewskotlin.model.bean

import android.os.Parcel
import android.os.Parcelable

/**
 * Created by codeest on 16/12/22.
 */

class NodeListBean : Parcelable {

    /**
     * id : 328643
     * title : django 的视图函数执行是同步的还是异步的？
     * url : http://www.v2ex.com/t/328643
     * content : 比如两个用户同时访问一个 url ， django 后台会调用相应的视图函数处理。那么这个处理过程是先完成第一个用户的 request-response 周期后再执行第二个用户的请求呢？还是同时执行两个用户的 request 请求？
     * content_rendered : 比如两个用户同时访问一个 url ， django 后台会调用相应的视图函数处理。那么这个处理过程是先完成第一个用户的 request-response 周期后再执行第二个用户的请求呢？还是同时执行两个用户的 request 请求？
     * replies : 4
     * member : {"id":206547,"username":"chuanqirenwu","tagline":"None","avatar_normal":"//cdn.v2ex.co/gravatar/a1ceb1d16d738ce96a1f8dff4c2ed803?s=24&d=retro","avatar_normal":"//cdn.v2ex.co/gravatar/a1ceb1d16d738ce96a1f8dff4c2ed803?s=48&d=retro","avatar_large":"//cdn.v2ex.co/gravatar/a1ceb1d16d738ce96a1f8dff4c2ed803?s=73&d=retro"}
     * node : {"id":90,"name":"python","title":"Python","title_alternative":"Python","url":"http://www.v2ex.com/go/python","topics":6163,"avatar_normal":"//cdn.v2ex.co/navatar/8613/985e/90_mini.png?m=1481194344","avatar_normal":"//cdn.v2ex.co/navatar/8613/985e/90_normal.png?m=1481194344","avatar_large":"//cdn.v2ex.co/navatar/8613/985e/90_large.png?m=1481194344"}
     * created : 1482132218
     * last_modified : 1482132218
     * last_touched : 1482078362
     */

    var id: String? = null
    var title: String? = null
    var content_rendered: String? = null
    var replies: Int = 0
    var member: MemberBean? = null
    var node: NodeBean? = null
    var created: Int = 0
    var last_modified: Int = 0

    class MemberBean : Parcelable {
        /**
         * id : 206547
         * username : chuanqirenwu
         * tagline : None
         * avatar_normal : //cdn.v2ex.co/gravatar/a1ceb1d16d738ce96a1f8dff4c2ed803?s=24&d=retro
         * avatar_normal : //cdn.v2ex.co/gravatar/a1ceb1d16d738ce96a1f8dff4c2ed803?s=48&d=retro
         * avatar_large : //cdn.v2ex.co/gravatar/a1ceb1d16d738ce96a1f8dff4c2ed803?s=73&d=retro
         */

        var username: String? = null
        private var avatar_normal: String? = null

        fun getavatar_normal(): String? {
            return avatar_normal
        }

        fun setavatar_normal(avatar_normal: String) {
            this.avatar_normal = avatar_normal
        }

        override fun describeContents(): Int {
            return 0
        }

        override fun writeToParcel(dest: Parcel, flags: Int) {
            dest.writeString(this.username)
            dest.writeString(this.avatar_normal)
        }

        constructor() {}

        protected constructor(`in`: Parcel) {
            this.username = `in`.readString()
            this.avatar_normal = `in`.readString()
        }

        companion object {

            val CREATOR: Parcelable.Creator<MemberBean> = object : Parcelable.Creator<MemberBean> {
                override fun createFromParcel(source: Parcel): MemberBean {
                    return MemberBean(source)
                }

                override fun newArray(size: Int): Array<MemberBean?> {
                    return arrayOfNulls(size)
                }
            }
        }
    }

    class NodeBean : Parcelable {

        var title: String? = null

        override fun describeContents(): Int {
            return 0
        }

        override fun writeToParcel(dest: Parcel, flags: Int) {
            dest.writeString(this.title)
        }

        constructor() {}

        protected constructor(`in`: Parcel) {
            this.title = `in`.readString()
        }

        companion object {

            val CREATOR: Parcelable.Creator<NodeBean> = object : Parcelable.Creator<NodeBean> {
                override fun createFromParcel(source: Parcel): NodeBean {
                    return NodeBean(source)
                }

                override fun newArray(size: Int): Array<NodeBean?> {
                    return arrayOfNulls(size)
                }
            }
        }
    }

    override fun describeContents(): Int {
        return 0
    }

    override fun writeToParcel(dest: Parcel, flags: Int) {
        dest.writeString(this.id)
        dest.writeString(this.title)
        dest.writeString(this.content_rendered)
        dest.writeInt(this.replies)
        dest.writeParcelable(this.member, flags)
        dest.writeParcelable(this.node, flags)
        dest.writeInt(this.created)
        dest.writeInt(this.last_modified)
    }

    constructor() {}

    protected constructor(`in`: Parcel) {
        this.id = `in`.readString()
        this.title = `in`.readString()
        this.content_rendered = `in`.readString()
        this.replies = `in`.readInt()
        this.member = `in`.readParcelable(MemberBean::class.java.classLoader)
        this.node = `in`.readParcelable(NodeBean::class.java.classLoader)
        this.created = `in`.readInt()
        this.last_modified = `in`.readInt()
    }

    companion object {

        val CREATOR: Parcelable.Creator<NodeListBean> = object : Parcelable.Creator<NodeListBean> {
            override fun createFromParcel(source: Parcel): NodeListBean {
                return NodeListBean(source)
            }

            override fun newArray(size: Int): Array<NodeListBean?> {
                return arrayOfNulls(size)
            }
        }
    }
}
