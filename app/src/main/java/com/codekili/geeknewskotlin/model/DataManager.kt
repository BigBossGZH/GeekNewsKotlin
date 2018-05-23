package com.codekili.geeknewskotlin.model

import com.codekili.geeknewskotlin.http.HttpHelper
import com.codekili.geeknewskotlin.model.db.DBHelper
import com.codekili.geeknewskotlin.model.prefs.PreferencesHelper
import javax.inject.Inject

/**
 * Created by Administrator on 2018/5/22 0022.
 */
class DataManager constructor( var mHttpHelper: HttpHelper,  var mDbHelper: DBHelper,  var mPreferencesHelper: PreferencesHelper) : HttpHelper, DBHelper, PreferencesHelper {

}