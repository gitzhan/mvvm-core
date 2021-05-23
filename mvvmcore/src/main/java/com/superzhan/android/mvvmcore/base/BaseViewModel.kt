package com.superzhan.android.mvvmcore.base

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

open class BaseViewModel: ViewModel() {

    private val _exception: MutableLiveData<Throwable> = MutableLiveData()
    val mException: LiveData<Throwable> = _exception

    fun throwE(throwable: Throwable) {
        _exception.value = throwable
    }
}