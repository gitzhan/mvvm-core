package com.superzhan.android.mvvmcore.util

import com.google.gson.Gson

object GsonUtil {
    val mInstance = Gson()

    fun toJson(data: Any?): String = mInstance.toJson(data)

    inline fun <reified T> fromJson(json: String): T = mInstance.fromJson(json, T::class.java)
}