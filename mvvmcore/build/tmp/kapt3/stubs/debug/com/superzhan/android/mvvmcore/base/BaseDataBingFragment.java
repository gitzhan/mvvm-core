package com.superzhan.android.mvvmcore.base;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\b&\u0018\u0000*\b\b\u0000\u0010\u0001*\u00020\u00022\u00020\u0003B\u0005\u00a2\u0006\u0002\u0010\u0004J3\u0010\u000b\u001a\u0002H\f\"\b\b\u0001\u0010\f*\u00020\u00022\u0006\u0010\r\u001a\u00020\u000e2\b\b\u0001\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012H\u0004\u00a2\u0006\u0002\u0010\u0013J&\u0010\u0014\u001a\u0004\u0018\u00010\u00152\u0006\u0010\r\u001a\u00020\u000e2\b\u0010\u0011\u001a\u0004\u0018\u00010\u00122\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017H\u0016J\u001a\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017H\u0016J\b\u0010\u001b\u001a\u00020\u0019H&R\u001c\u0010\u0005\u001a\u00028\u0000X\u0086.\u00a2\u0006\u0010\n\u0002\u0010\n\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\t\u00a8\u0006\u001c"}, d2 = {"Lcom/superzhan/android/mvvmcore/base/BaseDataBingFragment;", "VDB", "Landroidx/databinding/ViewDataBinding;", "Lcom/superzhan/android/mvvmcore/base/BaseFragment;", "()V", "mBinding", "getMBinding", "()Landroidx/databinding/ViewDataBinding;", "setMBinding", "(Landroidx/databinding/ViewDataBinding;)V", "Landroidx/databinding/ViewDataBinding;", "binding", "T", "inflater", "Landroid/view/LayoutInflater;", "layoutId", "", "container", "Landroid/view/ViewGroup;", "(Landroid/view/LayoutInflater;ILandroid/view/ViewGroup;)Landroidx/databinding/ViewDataBinding;", "onCreateView", "Landroid/view/View;", "savedInstanceState", "Landroid/os/Bundle;", "onViewCreated", "", "view", "startObserve", "mvvmcore_debug"})
public abstract class BaseDataBingFragment<VDB extends androidx.databinding.ViewDataBinding> extends com.superzhan.android.mvvmcore.base.BaseFragment {
    public VDB mBinding;
    
    public BaseDataBingFragment() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final VDB getMBinding() {
        return null;
    }
    
    public final void setMBinding(@org.jetbrains.annotations.NotNull()
    VDB p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    protected final <T extends androidx.databinding.ViewDataBinding>T binding(@org.jetbrains.annotations.NotNull()
    android.view.LayoutInflater inflater, @androidx.annotation.LayoutRes()
    int layoutId, @org.jetbrains.annotations.Nullable()
    android.view.ViewGroup container) {
        return null;
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
    public void onViewCreated(@org.jetbrains.annotations.NotNull()
    android.view.View view, @org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    public abstract void startObserve();
}