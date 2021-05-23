package com.superzhan.android.mvvmcore.base

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import org.jetbrains.anko.AnkoLogger

abstract class BaseActivity : AppCompatActivity(), AnkoLogger {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setView()
        initView()
        initData()
    }

    protected open fun setView() {
        setContentView(getLayoutResId())
    }


    abstract fun getLayoutResId(): Int
    abstract fun initView()
    abstract fun initData()
}