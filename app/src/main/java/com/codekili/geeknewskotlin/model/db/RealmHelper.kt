package com.codekili.geeknewskotlin.model.db

import com.codeest.geeknews.model.db.DBHelper
import com.codekili.geeknewskotlin.model.bean.GoldManagerBean
import com.codekili.geeknewskotlin.model.bean.RealmLikeBean
import javax.inject.Inject

/**
 * Created by Administrator on 2018/5/22 0022.
 */
class RealmHelper: DBHelper {
    override val likeList: List<RealmLikeBean>
        get() = TODO("not implemented") //To change initializer of created properties use File | Settings | File Templates.
    override val goldManagerList: GoldManagerBean
        get() = TODO("not implemented") //To change initializer of created properties use File | Settings | File Templates.

    override fun insertNewsId(id: Int) {
    }

    override fun queryNewsId(id: Int): Boolean {
        return false
    }

    override fun insertLikeBean(bean: RealmLikeBean) {
    }

    override fun deleteLikeBean(id: String) {
    }

    override fun queryLikeId(id: String): Boolean {
        return false
    }

    override fun changeLikeTime(id: String, time: Long, isPlus: Boolean) {
    }

    override fun updateGoldManagerList(bean: GoldManagerBean) {
    }

    @Inject
    constructor()
}