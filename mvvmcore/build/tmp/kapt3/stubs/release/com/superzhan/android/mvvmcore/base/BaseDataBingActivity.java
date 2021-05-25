package com.superzhan.android.mvvmcore.base;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b&\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J%\u0010\u0003\u001a\b\u0012\u0004\u0012\u0002H\u00050\u0004\"\n\b\u0000\u0010\u0005\u0018\u0001*\u00020\u00062\b\b\u0003\u0010\u0007\u001a\u00020\bH\u0084\bJ\u0012\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fH\u0014J\b\u0010\r\u001a\u00020\nH\u0014J\b\u0010\u000e\u001a\u00020\nH&\u00a8\u0006\u000f"}, d2 = {"Lcom/superzhan/android/mvvmcore/base/BaseDataBingActivity;", "Lcom/superzhan/android/mvvmcore/base/BaseActivity;", "()V", "binding", "Lkotlin/Lazy;", "T", "Landroidx/databinding/ViewDataBinding;", "resId", "", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "setView", "startObserve", "mvvmcore_release"})
public abstract class BaseDataBingActivity extends com.superzhan.android.mvvmcore.base.BaseActivity {
    
    public BaseDataBingActivity() {
        super();
    }
    
    @java.lang.Override()
    protected void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    @java.lang.Override()
    protected void setView() {
    }
    
    public abstract void startObserve();
}