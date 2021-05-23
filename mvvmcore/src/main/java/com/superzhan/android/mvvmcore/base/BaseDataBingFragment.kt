package com.superzhan.android.mvvmcore.base

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.annotation.LayoutRes
import androidx.databinding.DataBindingUtil
import androidx.databinding.ViewDataBinding

abstract class BaseDataBingFragment<VDB: ViewDataBinding> : BaseFragment() {

    lateinit var mBinding:VDB

    protected fun < T : ViewDataBinding> binding(
        inflater: LayoutInflater,
        @LayoutRes layoutId: Int,
        container: ViewGroup?
    ): T = DataBindingUtil.inflate<T>(inflater,layoutId, container,false).apply {
        lifecycleOwner = this@BaseDataBingFragment
    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        mBinding = binding(inflater, getLayoutResId(), container)
        return mBinding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        startObserve()
    }

    abstract fun startObserve()
}