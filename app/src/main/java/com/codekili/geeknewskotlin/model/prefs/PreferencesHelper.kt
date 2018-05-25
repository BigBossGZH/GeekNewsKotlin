package com.codekili.geeknewskotlin.model.prefs

/**
 * Created by Administrator on 2018/5/22 0022.
 */
interface PreferencesHelper{
    var nightModeState: Boolean

    var noImageState: Boolean

    var autoCacheState: Boolean

    var currentItem: Int

    var likePoint: Boolean

    var versionPoint: Boolean

    var managerPoint: Boolean
}