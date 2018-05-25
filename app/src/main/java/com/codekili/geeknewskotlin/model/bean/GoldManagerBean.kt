package com.codekili.geeknewskotlin.model.bean

import android.os.Parcel
import android.os.Parcelable

import io.realm.RealmList
import io.realm.RealmObject

/**
 * Created by codeest on 16/11/27.
 */

class GoldManagerBean : RealmObject, Parcelable {

    var managerList: RealmList<GoldManagerItemBean>? = null

    constructor() {

    }

    override fun describeContents(): Int {
        return 0
    }

    override fun writeToParcel(dest: Parcel, flags: Int) {
        dest.writeList(this.managerList)
    }

    protected constructor(`in`: Parcel) {
        this.managerList = RealmList()
        `in`.readList(this.managerList, GoldManagerItemBean::class.java.classLoader)
    }

    constructor(mList: RealmList<GoldManagerItemBean>) {
        this.managerList = mList
    }

    companion object {

        val CREATOR: Parcelable.Creator<GoldManagerBean> = object : Parcelable.Creator<GoldManagerBean> {
            override fun createFromParcel(source: Parcel): GoldManagerBean {
                return GoldManagerBean(source)
            }

            override fun newArray(size: Int): Array<GoldManagerBean> {
                return arrayOfNulls(size)
            }
        }
    }
}
