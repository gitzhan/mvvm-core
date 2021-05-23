package com.superzhan.android.mvvmcore.common

import android.annotation.SuppressLint
import android.app.Application
import android.content.Context
import com.superzhan.android.mvvmcore.lifecycle.KtxLifeCycleCallBack

open class MyApplication : Application() {

    companion object {
        @SuppressLint("StaticFieldLeak")
        lateinit var context: Context
    }

    override fun onCreate() {
        super.onCreate()
        context = applicationContext

        // 监听 activity 的 lifecycle
        this.registerActivityLifecycleCallbacks(KtxLifeCycleCallBack())
    }
}