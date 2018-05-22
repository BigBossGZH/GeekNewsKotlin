package com.codekili.geeknewskotlin.di.module

import com.codekili.geeknewskotlin.app.App
import com.codekili.geeknewskotlin.http.HttpHelper
import com.codekili.geeknewskotlin.model.DataManager
import com.codekili.geeknewskotlin.model.db.DBHelper
import com.codekili.geeknewskotlin.model.db.RealmHelper
import com.codekili.geeknewskotlin.model.http.RetrofitHelper
import com.codekili.geeknewskotlin.model.prefs.ImplPreferencesHelper
import com.codekili.geeknewskotlin.model.prefs.PreferencesHelper
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

/**
 * Created by Administrator on 2018/5/22 0022.
 */
@Module
class AppModule(private val application: App) {

    @Provides
    @Singleton
    fun provideApplicationContext(): App {
        return application
    }

    @Singleton
    @Provides
    fun provideHttpHelper(retrofitHelper: RetrofitHelper): HttpHelper {
        return retrofitHelper
    }

    @Singleton
    @Provides
    fun provideDbHelper(realmHelper: RealmHelper): DBHelper {
        return realmHelper
    }

    @Singleton
    @Provides
    fun providePreferencesHelper(implPreferencesHelper: ImplPreferencesHelper): PreferencesHelper {
        return implPreferencesHelper
    }

    fun provideDataManager(httpHelper: HttpHelper, dbHelper: DBHelper, preferencesHelper: PreferencesHelper): DataManager {
        return DataManager(httpHelper, dbHelper, preferencesHelper)
    }


}
