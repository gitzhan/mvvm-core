package com.superzhan.android.mvvmcore.lifecycle;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u000e\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\u0004J\u0012\u0010\t\u001a\u00020\n2\n\u0010\f\u001a\u0006\u0012\u0002\b\u00030\rJ\u0006\u0010\u000e\u001a\u00020\nJ\u0006\u0010\u000f\u001a\u00020\nJ\u000e\u0010\u0010\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\u0004J\u000e\u0010\u0011\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\u0004R\u0013\u0010\u0003\u001a\u0004\u0018\u00010\u00048F\u00a2\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00040\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0012"}, d2 = {"Lcom/superzhan/android/mvvmcore/lifecycle/KtxManager;", "", "()V", "currentActivity", "Landroid/app/Activity;", "getCurrentActivity", "()Landroid/app/Activity;", "mActivityList", "Ljava/util/LinkedList;", "finishActivity", "", "activity", "clazz", "Ljava/lang/Class;", "finishAllActivity", "finishCurrentActivity", "popActivity", "pushActivity", "mvvmcore_debug"})
public final class KtxManager {
    @org.jetbrains.annotations.NotNull()
    public static final com.superzhan.android.mvvmcore.lifecycle.KtxManager INSTANCE = null;
    private static final java.util.LinkedList<android.app.Activity> mActivityList = null;
    
    private KtxManager() {
        super();
    }
    
    @org.jetbrains.annotations.Nullable()
    public final android.app.Activity getCurrentActivity() {
        return null;
    }
    
    /**
     * push the specified [activity] into the list
     */
    public final void pushActivity(@org.jetbrains.annotations.NotNull()
    android.app.Activity activity) {
    }
    
    /**
     * pop the specified [activity] into the list
     */
    public final void popActivity(@org.jetbrains.annotations.NotNull()
    android.app.Activity activity) {
    }
    
    public final void finishCurrentActivity() {
    }
    
    public final void finishActivity(@org.jetbrains.annotations.NotNull()
    android.app.Activity activity) {
    }
    
    public final void finishActivity(@org.jetbrains.annotations.NotNull()
    java.lang.Class<?> clazz) {
    }
    
    public final void finishAllActivity() {
    }
}