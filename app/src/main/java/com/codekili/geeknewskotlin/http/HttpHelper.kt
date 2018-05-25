package com.codekili.geeknewskotlin.http

import com.codekili.geeknewskotlin.http.response.GankHttpResponse
import com.codekili.geeknewskotlin.http.response.GoldHttpResponse
import com.codekili.geeknewskotlin.http.response.MyHttpResponse
import com.codekili.geeknewskotlin.http.response.WXHttpResponse
import com.codekili.geeknewskotlin.model.bean.*
import io.reactivex.Flowable

/**
 * Created by Administrator on 2018/5/16 0016.
 */
interface HttpHelper{
     fun fetchDailyListInfo(): Flowable<DailyListBean>

     fun fetchDailyBeforeListInfo(date: String): Flowable<DailyBeforeListBean>

     fun fetchDailyThemeListInfo(): Flowable<ThemeListBean>

     fun fetchThemeChildListInfo(id: Int): Flowable<ThemeChildListBean>

     fun fetchSectionListInfo(): Flowable<SectionListBean>

     fun fetchSectionChildListInfo(id: Int): Flowable<SectionChildListBean>

     fun fetchDetailInfo(id: Int): Flowable<ZhihuDetailBean>

     fun fetchDetailExtraInfo(id: Int): Flowable<DetailExtraBean>

     fun fetchWelcomeInfo(res: String): Flowable<WelcomeBean>

     fun fetchLongCommentInfo(id: Int): Flowable<CommentBean>

     fun fetchShortCommentInfo(id: Int): Flowable<CommentBean>

     fun fetchHotListInfo(): Flowable<HotListBean>

     fun fetchTechList(tech: String, num: Int, page: Int): Flowable<GankHttpResponse<List<GankItemBean>>>

     fun fetchGirlList(num: Int, page: Int): Flowable<GankHttpResponse<List<GankItemBean>>>

     fun fetchRandomGirl(num: Int): Flowable<GankHttpResponse<List<GankItemBean>>>

     fun fetchGankSearchList(query: String, type: String, num: Int, page: Int): Flowable<GankHttpResponse<List<GankSearchItemBean>>>

     fun fetchWechatListInfo(num: Int, page: Int): Flowable<WXHttpResponse<List<WXItemBean>>>

     fun fetchWechatSearchListInfo(num: Int, page: Int, word: String): Flowable<WXHttpResponse<List<WXItemBean>>>

     fun fetchVersionInfo(): Flowable<MyHttpResponse<VersionBean>>

     fun fetchGoldList(type: String, num: Int, page: Int): Flowable<GoldHttpResponse<List<GoldListBean>>>

     fun fetchGoldHotList(type: String, dataTime: String, limit: Int): Flowable<GoldHttpResponse<List<GoldListBean>>>

     fun fetchNodeInfo(name: String): Flowable<NodeBean>

     fun fetchTopicList(name: String): Flowable<List<NodeListBean>>

     fun fetchTopicInfo(id: String): Flowable<List<NodeListBean>>

     fun fetchRepliesList(id: String): Flowable<List<RepliesListBean>>
}