package com.codekili.geeknewskotlin.model.http

import com.codekili.geeknewskotlin.http.HttpHelper
import com.codekili.geeknewskotlin.http.response.GankHttpResponse
import com.codekili.geeknewskotlin.http.response.GoldHttpResponse
import com.codekili.geeknewskotlin.http.response.MyHttpResponse
import com.codekili.geeknewskotlin.http.response.WXHttpResponse
import com.codekili.geeknewskotlin.model.bean.*
import io.reactivex.Flowable
import javax.inject.Inject

/**
 * Created by Administrator on 2018/5/22 0022.
 */
class RetrofitHelper:HttpHelper{
    override fun fetchDailyListInfo(): Flowable<DailyListBean> {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun fetchDailyBeforeListInfo(date: String): Flowable<DailyBeforeListBean> {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun fetchDailyThemeListInfo(): Flowable<ThemeListBean> {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun fetchThemeChildListInfo(id: Int): Flowable<ThemeChildListBean> {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun fetchSectionListInfo(): Flowable<SectionListBean> {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun fetchSectionChildListInfo(id: Int): Flowable<SectionChildListBean> {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun fetchDetailInfo(id: Int): Flowable<ZhihuDetailBean> {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun fetchDetailExtraInfo(id: Int): Flowable<DetailExtraBean> {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun fetchWelcomeInfo(res: String): Flowable<WelcomeBean> {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun fetchLongCommentInfo(id: Int): Flowable<CommentBean> {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun fetchShortCommentInfo(id: Int): Flowable<CommentBean> {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun fetchHotListInfo(): Flowable<HotListBean> {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun fetchTechList(tech: String, num: Int, page: Int): Flowable<GankHttpResponse<List<GankItemBean>>> {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun fetchGirlList(num: Int, page: Int): Flowable<GankHttpResponse<List<GankItemBean>>> {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun fetchRandomGirl(num: Int): Flowable<GankHttpResponse<List<GankItemBean>>> {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun fetchGankSearchList(query: String, type: String, num: Int, page: Int): Flowable<GankHttpResponse<List<GankSearchItemBean>>> {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun fetchWechatListInfo(num: Int, page: Int): Flowable<WXHttpResponse<List<WXItemBean>>> {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun fetchWechatSearchListInfo(num: Int, page: Int, word: String): Flowable<WXHttpResponse<List<WXItemBean>>> {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun fetchVersionInfo(): Flowable<MyHttpResponse<VersionBean>> {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun fetchGoldList(type: String, num: Int, page: Int): Flowable<GoldHttpResponse<List<GoldListBean>>> {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun fetchGoldHotList(type: String, dataTime: String, limit: Int): Flowable<GoldHttpResponse<List<GoldListBean>>> {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun fetchNodeInfo(name: String): Flowable<NodeBean> {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun fetchTopicList(name: String): Flowable<List<NodeListBean>> {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun fetchTopicInfo(id: String): Flowable<List<NodeListBean>> {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun fetchRepliesList(id: String): Flowable<List<RepliesListBean>> {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    @Inject
    constructor()
}