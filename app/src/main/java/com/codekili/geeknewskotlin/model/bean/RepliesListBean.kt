package com.codekili.geeknewskotlin.model.bean

/**
 * Created by codeest on 16/12/22.
 */

class RepliesListBean {


    /**
     * id : 3876167
     * thanks : 0
     * content : Android-x86
     * content_rendered : Android-x86
     * member : {"id":68632,"username":"mason961125","tagline":"","avatar_normal":"//cdn.v2ex.co/gravatar/749c43cb8cd7c0786a55d4be05cc6b3a?s=24&d=retro","avatar_normal":"//cdn.v2ex.co/gravatar/749c43cb8cd7c0786a55d4be05cc6b3a?s=48&d=retro","avatar_large":"//cdn.v2ex.co/gravatar/749c43cb8cd7c0786a55d4be05cc6b3a?s=73&d=retro"}
     * created : 1482323170
     * last_modified : 1482323170
     */

    var thanks: Int = 0
    var content_rendered: String? = null
    var member: MemberBean? = null
    var created: Int = 0

    class MemberBean {
        /**
         * id : 68632
         * username : mason961125
         * tagline :
         * avatar_normal : //cdn.v2ex.co/gravatar/749c43cb8cd7c0786a55d4be05cc6b3a?s=24&d=retro
         * avatar_normal : //cdn.v2ex.co/gravatar/749c43cb8cd7c0786a55d4be05cc6b3a?s=48&d=retro
         * avatar_large : //cdn.v2ex.co/gravatar/749c43cb8cd7c0786a55d4be05cc6b3a?s=73&d=retro
         */

        var username: String? = null
        private var avatar_normal: String? = null

        fun getavatar_normal(): String? {
            return avatar_normal
        }

        fun setavatar_normal(avatar_normal: String) {
            this.avatar_normal = avatar_normal
        }
    }
}
