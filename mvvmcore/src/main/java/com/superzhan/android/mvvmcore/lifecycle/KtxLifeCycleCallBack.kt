package com.superzhan.android.mvvmcore.lifecycle

import android.app.Activity
import android.app.Application
import android.os.Bundle
import android.util.Log

class KtxLifeCycleCallBack : Application.ActivityLifecycleCallbacks {

    companion object {
        const val TAG = "KTX"
    }

    override fun onActivityCreated(activity: Activity, savedInstanceState: Bundle?) {
        KtxManager.pushActivity(activity)
        Log.i(TAG, "onActivityCreated : ${activity.localClassName}")
    }

    override fun onActivityStarted(activity: Activity) {
        Log.i(TAG, "onActivityStarted : ${activity.localClassName}")
    }

    override fun onActivityResumed(activity: Activity) {
        Log.i(TAG, "onActivityResumed : ${activity.localClassName}")
    }

    override fun onActivityPaused(activity: Activity) {
        Log.i(TAG, "onActivityPaused : ${activity.localClassName}")
    }


    override fun onActivityDestroyed(activity: Activity) {
        Log.i(TAG, "onActivityDestroyed : ${activity.localClassName}")
        KtxManager.popActivity(activity)
    }

    override fun onActivitySaveInstanceState(p0: Activity, p1: Bundle) {
    }

    override fun onActivityStopped(activity: Activity) {
        Log.i(TAG, "onActivityStopped : ${activity.localClassName}")
    }

}