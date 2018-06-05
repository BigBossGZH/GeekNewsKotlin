package com.codekili.geeknewskotlin.model

import com.codeest.geeknews.model.db.DBHelper
import com.codekili.geeknewskotlin.http.HttpHelper
import com.codekili.geeknewskotlin.http.response.GankHttpResponse
import com.codekili.geeknewskotlin.http.response.GoldHttpResponse
import com.codekili.geeknewskotlin.http.response.MyHttpResponse
import com.codekili.geeknewskotlin.http.response.WXHttpResponse
import com.codekili.geeknewskotlin.model.bean.*
import com.codekili.geeknewskotlin.model.prefs.PreferencesHelper
import io.reactivex.Flowable

/**
 * Created by Administrator on 2018/5/22 0022.
 */
class DataManager constructor(var mHttpHelper: HttpHelper, var mDbHelper: DBHelper, var mPreferencesHelper: PreferencesHelper) : HttpHelper, DBHelper, PreferencesHelper {


    override fun insertNewsId(id: Int) {
        mDbHelper.insertNewsId(id)
    }

    override fun queryNewsId(id: Int): Boolean {
        return mDbHelper.queryNewsId(id)
    }

    override fun fetchDailyThemeListInfo(): Flowable<ThemeListBean> {
        return mHttpHelper.fetchDailyThemeListInfo()
    }

    override fun insertLikeBean(bean: RealmLikeBean) {
        return mDbHelper.insertLikeBean(bean)
    }

    override fun fetchThemeChildListInfo(id: Int): Flowable<ThemeChildListBean> {
        return mHttpHelper.fetchThemeChildListInfo(id)
    }

    override fun deleteLikeBean(id: String) {
        mDbHelper.deleteLikeBean(id)
    }

    override fun fetchSectionListInfo(): Flowable<SectionListBean> {
        return mHttpHelper.fetchSectionListInfo()
    }

    override fun fetchSectionChildListInfo(id: Int): Flowable<SectionChildListBean> {
        return mHttpHelper.fetchSectionChildListInfo(id)
    }

    override fun queryLikeId(id: String): Boolean {
        return mDbHelper.queryLikeId(id)
    }

    override fun fetchDetailInfo(id: Int): Flowable<ZhihuDetailBean> {
        return mHttpHelper.fetchDetailInfo(id)
    }

    override fun fetchDetailExtraInfo(id: Int): Flowable<DetailExtraBean> {
        return mHttpHelper.fetchDetailExtraInfo(id)
    }

    override fun changeLikeTime(id: String, time: Long, isPlus: Boolean) {
        mDbHelper.changeLikeTime(id, time, isPlus)
    }

    override fun fetchWelcomeInfo(res: String): Flowable<WelcomeBean> {
        return mHttpHelper.fetchWelcomeInfo(res)
    }

    override fun updateGoldManagerList(bean: GoldManagerBean) {
        mDbHelper.updateGoldManagerList(bean)
    }

    override fun fetchLongCommentInfo(id: Int): Flowable<CommentBean> {
        return mHttpHelper.fetchLongCommentInfo(id)

    }

    override fun fetchShortCommentInfo(id: Int): Flowable<CommentBean> {
        return mHttpHelper.fetchShortCommentInfo(id)
    }

    override fun fetchHotListInfo(): Flowable<HotListBean> {
        return mHttpHelper.fetchHotListInfo()
    }

    override fun fetchTechList(tech: String, num: Int, page: Int): Flowable<GankHttpResponse<List<GankItemBean>>> {
        return mHttpHelper.fetchTechList(tech,num,page)
    }

    override fun fetchGirlList(num: Int, page: Int): Flowable<GankHttpResponse<List<GankItemBean>>> {
        return mHttpHelper.fetchGirlList(num,page)
    }

    override fun fetchRandomGirl(num: Int): Flowable<GankHttpResponse<List<GankItemBean>>> {
        return mHttpHelper.fetchRandomGirl(num)
    }

    override fun fetchGankSearchList(query: String, type: String, num: Int, page: Int): Flowable<GankHttpResponse<List<GankSearchItemBean>>> {
        return mHttpHelper.fetchGankSearchList(query,type,num, page)
    }

    override fun fetchWechatListInfo(num: Int, page: Int): Flowable<WXHttpResponse<List<WXItemBean>>> {
        return mHttpHelper.fetchWechatListInfo(num, page)
    }

    override fun fetchWechatSearchListInfo(num: Int, page: Int, word: String): Flowable<WXHttpResponse<List<WXItemBean>>> {
        return mHttpHelper.fetchWechatSearchListInfo(num, page ,word)
    }

    override fun fetchVersionInfo(): Flowable<MyHttpResponse<VersionBean>> {
        return mHttpHelper.fetchVersionInfo()
    }

    override fun fetchGoldList(type: String, num: Int, page: Int): Flowable<GoldHttpResponse<List<GoldListBean>>> {
        return mHttpHelper.fetchGoldList(type,num,page)
    }

    override fun fetchGoldHotList(type: String, dataTime: String, limit: Int): Flowable<GoldHttpResponse<List<GoldListBean>>> {
        return mHttpHelper.fetchGoldHotList(type,dataTime,limit)
    }

    override fun fetchNodeInfo(name: String): Flowable<NodeBean> {
        return mHttpHelper.fetchNodeInfo(name)
    }

    override fun fetchTopicList(name: String): Flowable<List<NodeListBean>> {
        return mHttpHelper.fetchTopicList(name)
    }

    override fun fetchTopicInfo(id: String): Flowable<List<NodeListBean>> {
        return mHttpHelper.fetchTopicInfo(id)
    }

    override fun fetchRepliesList(id: String): Flowable<List<RepliesListBean>> {
        return mHttpHelper.fetchRepliesList(id)
    }

    override var nightModeState: Boolean
        get() = mPreferencesHelper.nightModeState
        set(value) {
            mPreferencesHelper.nightModeState = value
        }
    override var noImageState: Boolean
        get() = mPreferencesHelper.noImageState
        set(value) {
            mPreferencesHelper.noImageState = value
        }
    override var autoCacheState: Boolean
        get() = mPreferencesHelper.autoCacheState
        set(value) {
            mPreferencesHelper.autoCacheState = value
        }
    override var currentItem: Int
        get() = mPreferencesHelper.currentItem
        set(value) {
            mPreferencesHelper.currentItem == value
        }
    override var likePoint: Boolean
        get() = mPreferencesHelper.likePoint
        set(value) {
            mPreferencesHelper.likePoint = value
        }


    override fun fetchDailyListInfo(): Flowable<DailyListBean> {
        return mHttpHelper.fetchDailyListInfo()
    }


    override fun fetchDailyBeforeListInfo(date: String): Flowable<DailyBeforeListBean> {
        return mHttpHelper.fetchDailyBeforeListInfo(date)
    }

    override var versionPoint: Boolean
        get() = mPreferencesHelper.versionPoint
        set(value) {
            mPreferencesHelper.versionPoint = value
        }
    override val likeList: List<RealmLikeBean>
        get() = mDbHelper.likeList
    override var managerPoint: Boolean
        get() = mPreferencesHelper.managerPoint
        set(value) {
            mPreferencesHelper.managerPoint = value
        }


    override val goldManagerList: GoldManagerBean
        get() = mDbHelper.goldManagerList

}