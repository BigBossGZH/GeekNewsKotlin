package com.codekili.geeknewskotlin.model.bean

import io.realm.RealmObject
import io.realm.annotations.PrimaryKey

/**
 * Created by codeest on 16/8/17.
 */

open class ReadStateBean : RealmObject() {

    @PrimaryKey
    var id: Int = 0
}
