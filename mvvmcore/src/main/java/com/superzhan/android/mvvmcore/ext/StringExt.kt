package com.superzhan.android.mvvmcore.ext

import com.superzhan.android.mvvmcore.util.GsonUtil

fun Any?.toJson(): String = GsonUtil.toJson(this)