package com.superzhan.android.mvvmcore.base

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.databinding.ViewDataBinding
import androidx.lifecycle.ViewModelProvider
import java.lang.reflect.ParameterizedType

abstract class BaseVMDFragment<VM: BaseViewModel, VDB: ViewDataBinding> : BaseFragment() {
    lateinit var mViewModel: VM
    lateinit var mBinding: VDB

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        mBinding = DataBindingUtil.inflate<VDB>(
            inflater,
            getLayoutResId(),
            container,
            false
        ).apply {
            lifecycleOwner = this@BaseVMDFragment
        }
        return mBinding.root
    }

    override fun initView() {
        initViewModel()
    }

    protected open fun initViewModel() {
        val type = javaClass.genericSuperclass
        mViewModel = if (type is ParameterizedType) {
            ViewModelProvider(this).get(type.actualTypeArguments[0] as Class<VM>)
        } else {
            // 未指定泛型，则认为是 BaseViewModel，并进行初始化
            ViewModelProvider(this).get(BaseViewModel::class.java) as VM
        }
    }
}