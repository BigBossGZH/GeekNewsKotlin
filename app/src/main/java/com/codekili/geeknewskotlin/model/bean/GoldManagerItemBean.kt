package com.codekili.geeknewskotlin.model.bean

import android.os.Parcel
import android.os.Parcelable
import io.realm.RealmModel

import io.realm.RealmObject
import io.realm.annotations.RealmClass

/**
 * Created by codeest on 16/12/1.
 */

@RealmClass
open class GoldManagerItemBean : RealmObject, Parcelable {

    var index: Int = 0

    var isSelect: Boolean = false

    constructor() {

    }

    constructor(index: Int, isSelect: Boolean) {
        this.index = index
        this.isSelect = isSelect
    }

    override fun describeContents(): Int {
        return 0
    }

    override fun writeToParcel(dest: Parcel, flags: Int) {
        dest.writeInt(this.index)
        dest.writeByte(if (this.isSelect) 1.toByte() else 0.toByte())
    }

    protected constructor(`in`: Parcel) {
        this.index = `in`.readInt()
        this.isSelect = `in`.readByte().toInt() != 0
    }

    companion object {

        val CREATOR: Parcelable.Creator<GoldManagerItemBean> = object : Parcelable.Creator<GoldManagerItemBean> {
            override fun createFromParcel(source: Parcel): GoldManagerItemBean {
                return GoldManagerItemBean(source)
            }

            override fun newArray(size: Int): Array<GoldManagerItemBean?> {
                return arrayOfNulls(size)
            }
        }
    }
}
