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
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun queryNewsId(id: Int): Boolean {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun insertLikeBean(bean: RealmLikeBean) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun deleteLikeBean(id: String) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun queryLikeId(id: String): Boolean {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun changeLikeTime(id: String, time: Long, isPlus: Boolean) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun updateGoldManagerList(bean: GoldManagerBean) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    @Inject
    constructor()
}