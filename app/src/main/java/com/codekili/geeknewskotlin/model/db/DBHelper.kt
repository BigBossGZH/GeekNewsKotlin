package com.codeest.geeknews.model.db

import com.codekili.geeknewskotlin.model.bean.GoldManagerBean
import com.codekili.geeknewskotlin.model.bean.RealmLikeBean

/**
 * @author: Est <codeest.dev></codeest.dev>@gmail.com>
 * @date: 2017/4/21
 * @description:
 */

interface DBHelper {

    val likeList: List<RealmLikeBean>

    /**
     * 获取 掘金首页管理列表
     * @return
     */
    val goldManagerList: GoldManagerBean

    fun insertNewsId(id: Int)

    /**
     * 查询 阅读记录
     * @param id
     * @return
     */
    fun queryNewsId(id: Int): Boolean

    /**
     * 增加 收藏记录
     * @param bean
     */
    fun insertLikeBean(bean: RealmLikeBean)

    /**
     * 删除 收藏记录
     * @param id
     */
    fun deleteLikeBean(id: String)

    /**
     * 查询 收藏记录
     * @param id
     * @return
     */
    fun queryLikeId(id: String): Boolean

    /**
     * 修改 收藏记录 时间戳以重新排序
     * @param id
     * @param time
     * @param isPlus
     */
    fun changeLikeTime(id: String, time: Long, isPlus: Boolean)

    /**
     * 更新 掘金首页管理列表
     * @param bean
     */
    fun updateGoldManagerList(bean: GoldManagerBean)
}
