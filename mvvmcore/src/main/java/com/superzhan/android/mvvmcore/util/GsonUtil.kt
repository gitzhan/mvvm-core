package com.superzhan.android.mvvmcore.util

import com.google.gson.Gson

object GsonUtil {
    private val mInstance = Gson()

    fun toJson(data: Any?): String = mInstance.toJson(data)
}