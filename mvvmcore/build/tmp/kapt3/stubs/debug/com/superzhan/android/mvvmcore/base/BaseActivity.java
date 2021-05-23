package com.superzhan.android.mvvmcore.base;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\b&\u0018\u00002\u00020\u00012\u00020\u0002B\u0005\u00a2\u0006\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H&J\b\u0010\u0006\u001a\u00020\u0007H&J\b\u0010\b\u001a\u00020\u0007H&J\u0012\u0010\t\u001a\u00020\u00072\b\u0010\n\u001a\u0004\u0018\u00010\u000bH\u0014J\b\u0010\f\u001a\u00020\u0007H\u0014\u00a8\u0006\r"}, d2 = {"Lcom/superzhan/android/mvvmcore/base/BaseActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "Lorg/jetbrains/anko/AnkoLogger;", "()V", "getLayoutResId", "", "initData", "", "initView", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "setView", "mvvmcore_debug"})
public abstract class BaseActivity extends androidx.appcompat.app.AppCompatActivity implements org.jetbrains.anko.AnkoLogger {
    
    public BaseActivity() {
        super();
    }
    
    @java.lang.Override()
    protected void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    protected void setView() {
    }
    
    public abstract int getLayoutResId();
    
    public abstract void initView();
    
    public abstract void initData();
    
    @org.jetbrains.annotations.NotNull()
    public java.lang.String getLoggerTag() {
        return null;
    }
}