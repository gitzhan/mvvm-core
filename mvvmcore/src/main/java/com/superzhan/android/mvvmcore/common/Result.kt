package com.superzhan.android.mvvmcore.common

import com.superzhan.android.mvvmcore.ext.toJson

sealed class Result<out T: Any> {

    data class Success<out T: Any>(val data: T) : Result<T>()
    data class Error(val e: Exception) : Result<Nothing>()

    override fun toString(): String = when (this) {
        is Success<*> -> "Result success, data: ${data.toJson()}"
        is Error -> "Result error, exception: $e"
    }
}