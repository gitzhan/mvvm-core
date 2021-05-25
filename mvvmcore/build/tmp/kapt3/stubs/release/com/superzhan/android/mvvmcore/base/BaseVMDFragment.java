package com.superzhan.android.mvvmcore.base;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b&\u0018\u0000*\b\b\u0000\u0010\u0001*\u00020\u0002*\b\b\u0001\u0010\u0003*\u00020\u00042\u00020\u0005B\u0005\u00a2\u0006\u0002\u0010\u0006J\b\u0010\u0013\u001a\u00020\u0014H\u0016J\b\u0010\u0015\u001a\u00020\u0014H\u0014J&\u0010\u0016\u001a\u0004\u0018\u00010\u00172\u0006\u0010\u0018\u001a\u00020\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u001b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001dH\u0016R\u001c\u0010\u0007\u001a\u00028\u0001X\u0086.\u00a2\u0006\u0010\n\u0002\u0010\f\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR\u001c\u0010\r\u001a\u00028\u0000X\u0086.\u00a2\u0006\u0010\n\u0002\u0010\u0012\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011\u00a8\u0006\u001e"}, d2 = {"Lcom/superzhan/android/mvvmcore/base/BaseVMDFragment;", "VM", "Lcom/superzhan/android/mvvmcore/base/BaseViewModel;", "VDB", "Landroidx/databinding/ViewDataBinding;", "Lcom/superzhan/android/mvvmcore/base/BaseFragment;", "()V", "mBinding", "getMBinding", "()Landroidx/databinding/ViewDataBinding;", "setMBinding", "(Landroidx/databinding/ViewDataBinding;)V", "Landroidx/databinding/ViewDataBinding;", "mViewModel", "getMViewModel", "()Lcom/superzhan/android/mvvmcore/base/BaseViewModel;", "setMViewModel", "(Lcom/superzhan/android/mvvmcore/base/BaseViewModel;)V", "Lcom/superzhan/android/mvvmcore/base/BaseViewModel;", "initView", "", "initViewModel", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "mvvmcore_release"})
public abstract class BaseVMDFragment<VM extends com.superzhan.android.mvvmcore.base.BaseViewModel, VDB extends androidx.databinding.ViewDataBinding> extends com.superzhan.android.mvvmcore.base.BaseFragment {
    public VM mViewModel;
    public VDB mBinding;
    
    public BaseVMDFragment() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final VM getMViewModel() {
        return null;
    }
    
    public final void setMViewModel(@org.jetbrains.annotations.NotNull()
    VM p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final VDB getMBinding() {
        return null;
    }
    
    public final void setMBinding(@org.jetbrains.annotations.NotNull()
    VDB p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public android.view.View onCreateView(@org.jetbrains.annotations.NotNull()
    android.view.LayoutInflater inflater, @org.jetbrains.annotations.Nullable()
    android.view.ViewGroup container, @org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
        return null;
    }
    
    @java.lang.Override()
    public void initView() {
    }
    
    protected void initViewModel() {
    }
}