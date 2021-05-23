package com.superzhan.android.mvvmcore.base

import androidx.databinding.DataBindingUtil
import androidx.databinding.ViewDataBinding
import androidx.lifecycle.ViewModelProvider
import java.lang.reflect.ParameterizedType

abstract class BaseVMDActivity<VM: BaseViewModel, VDB: ViewDataBinding> : BaseActivity() {
    lateinit var mViewModel: VM
    lateinit var mBinding: VDB

    override fun setView() {
        // 初始化DataBinding
        mBinding = DataBindingUtil.setContentView<VDB>(this, getLayoutResId()).apply {
            lifecycleOwner = this@BaseVMDActivity
        }
        // 初始化viewModel
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