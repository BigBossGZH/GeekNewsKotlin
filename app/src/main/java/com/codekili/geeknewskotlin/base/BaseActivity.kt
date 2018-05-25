package com.codekili.geeknewskotlin.base

import android.support.v7.app.AppCompatDelegate
import android.view.ViewGroup
import com.codekili.geeknewskotlin.app.App
import com.codekili.geeknewskotlin.di.component.ActivityComponent
import com.codekili.geeknewskotlin.di.component.DaggerActivityComponent
import com.codekili.geeknewskotlin.di.module.ActivityModule
import com.codekili.geeknewskotlin.util.SnackbarUtil

/**
 * Created by Administrator on 2018/5/23 0023.
 */
abstract class BaseActivity<T : BasePresenter<*>> : SimpleActivity(), BaseView {

    //    @Inject
    var mPresenter: T? = null

    fun getActivityComponent(): ActivityComponent {


        return DaggerActivityComponent.builder()
                .appComponent(App.appComponent)
                .activityModule(getActivityModule())
                .build()
    }

    private fun getActivityModule(): ActivityModule {
        return ActivityModule(this)
    }

    override fun onViewCreated() {
        super.onViewCreated()
        initInject()
        mPresenter?.let {
            it.attachView(this as Nothing)
        }
    }

    override fun onDestroy() {
        mPresenter?.let {
            it.detachView()
        }
        super.onDestroy()
    }

    override fun showErrorMsg(msg: String) {
        SnackbarUtil.show((findViewById<ViewGroup>(android.R.id.content)).getChildAt(0), msg)
    }

    //夜间模式
    override fun useNighMode(isNight: Boolean) {
        if (isNight) {
            AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_YES)
        } else {
            AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_NO)
        }
        //3.0出现，重新创建Activity 会比正常启动Activity多调用了onSaveInstanceState()和onRestoreInstanceState()两个方法
        recreate()
    }

    override fun stateError() {
    }

    override fun stateEmpty() {
    }

    override fun stateLoading() {
    }

    override fun stateMain() {
    }

    protected abstract fun initInject()


}


