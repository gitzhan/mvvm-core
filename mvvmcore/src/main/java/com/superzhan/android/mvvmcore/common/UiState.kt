package com.superzhan.android.mvvmcore.common

open class UiState<T>(
    val refresh: Boolean = false, // 刷新中
    val loading: Boolean = false, // 加载中
    val loadMore: Boolean = false, // 加载更多
    val success: T? = null, // 成功结果
    val error: String? = null // 失败/异常提示
)