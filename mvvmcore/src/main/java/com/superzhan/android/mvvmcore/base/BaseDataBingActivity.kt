package com.superzhan.android.mvvmcore.base

import android.os.Bundle
import androidx.annotation.LayoutRes
import androidx.databinding.DataBindingUtil
import androidx.databinding.ViewDataBinding

abstract class BaseDataBingActivity : BaseActivity() {

    protected inline fun <reified T : ViewDataBinding> binding(
        @LayoutRes resId: Int = getLayoutResId()
    ): Lazy<T> =
        lazy {
            DataBindingUtil.setContentView<T>(this, resId).apply {
                lifecycleOwner = this@BaseDataBingActivity
            }
        }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        startObserve()
    }

    override fun setView() {
        // no setContenView
        // 不要忘了bingview
    }

    abstract fun startObserve()
}