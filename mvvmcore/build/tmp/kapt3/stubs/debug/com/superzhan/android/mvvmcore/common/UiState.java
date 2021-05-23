package com.superzhan.android.mvvmcore.common;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u000b\b\u0016\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B;\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00018\u0000\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t\u00a2\u0006\u0002\u0010\nR\u0013\u0010\b\u001a\u0004\u0018\u00010\t\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0006\u001a\u00020\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0005\u001a\u00020\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000eR\u0011\u0010\u0003\u001a\u00020\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000eR\u0015\u0010\u0007\u001a\u0004\u0018\u00018\u0000\u00a2\u0006\n\n\u0002\u0010\u0013\u001a\u0004\b\u0011\u0010\u0012\u00a8\u0006\u0014"}, d2 = {"Lcom/superzhan/android/mvvmcore/common/UiState;", "T", "", "refresh", "", "loading", "loadMore", "success", "error", "", "(ZZZLjava/lang/Object;Ljava/lang/String;)V", "getError", "()Ljava/lang/String;", "getLoadMore", "()Z", "getLoading", "getRefresh", "getSuccess", "()Ljava/lang/Object;", "Ljava/lang/Object;", "mvvmcore_debug"})
public class UiState<T extends java.lang.Object> {
    private final boolean refresh = false;
    private final boolean loading = false;
    private final boolean loadMore = false;
    @org.jetbrains.annotations.Nullable()
    private final T success = null;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.String error = null;
    
    public UiState() {
        super();
    }
    
    public UiState(boolean refresh, boolean loading, boolean loadMore, @org.jetbrains.annotations.Nullable()
    T success, @org.jetbrains.annotations.Nullable()
    java.lang.String error) {
        super();
    }
    
    public final boolean getRefresh() {
        return false;
    }
    
    public final boolean getLoading() {
        return false;
    }
    
    public final boolean getLoadMore() {
        return false;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final T getSuccess() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getError() {
        return null;
    }
}