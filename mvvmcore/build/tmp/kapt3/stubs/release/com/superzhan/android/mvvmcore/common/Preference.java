package com.superzhan.android.mvvmcore.common;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\b\u0016\u0018\u0000 \u001b*\u0004\b\u0000\u0010\u00012\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0003\u0012\u0004\u0012\u0002H\u00010\u0002:\u0001\u001bB\'\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00028\u0000\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\b\b\u0002\u0010\t\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\nJ$\u0010\u0012\u001a\u00028\u00002\b\u0010\u0013\u001a\u0004\u0018\u00010\u00032\n\u0010\u0014\u001a\u0006\u0012\u0002\b\u00030\u0015H\u0096\u0002\u00a2\u0006\u0002\u0010\u0016J,\u0010\u0017\u001a\u00020\u00182\b\u0010\u0013\u001a\u0004\u0018\u00010\u00032\n\u0010\u0014\u001a\u0006\u0012\u0002\b\u00030\u00152\u0006\u0010\u0019\u001a\u00028\u0000H\u0097\u0002\u00a2\u0006\u0002\u0010\u001aR\u0010\u0010\u0006\u001a\u00028\u0000X\u0082\u0004\u00a2\u0006\u0004\n\u0002\u0010\u000bR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001b\u0010\f\u001a\u00020\r8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u000e\u0010\u000f\u00a8\u0006\u001c"}, d2 = {"Lcom/superzhan/android/mvvmcore/common/Preference;", "T", "Lkotlin/properties/ReadWriteProperty;", "", "name", "", "default", "context", "Landroid/content/Context;", "fileName", "(Ljava/lang/String;Ljava/lang/Object;Landroid/content/Context;Ljava/lang/String;)V", "Ljava/lang/Object;", "prefs", "Landroid/content/SharedPreferences;", "getPrefs", "()Landroid/content/SharedPreferences;", "prefs$delegate", "Lkotlin/Lazy;", "getValue", "thisRef", "property", "Lkotlin/reflect/KProperty;", "(Ljava/lang/Object;Lkotlin/reflect/KProperty;)Ljava/lang/Object;", "setValue", "", "value", "(Ljava/lang/Object;Lkotlin/reflect/KProperty;Ljava/lang/Object;)V", "Companion", "mvvmcore_release"})
public class Preference<T extends java.lang.Object> implements kotlin.properties.ReadWriteProperty<java.lang.Object, T> {
    private final java.lang.String name = null;
    private final kotlin.Lazy prefs$delegate = null;
    @org.jetbrains.annotations.NotNull()
    public static final com.superzhan.android.mvvmcore.common.Preference.Companion Companion = null;
    private static final java.lang.String TAG = "SharedPreferences";
    
    public Preference(@org.jetbrains.annotations.NotNull()
    java.lang.String name, T p1_772401952, @org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.NotNull()
    java.lang.String fileName) {
        super();
    }
    
    private final android.content.SharedPreferences getPrefs() {
        return null;
    }
    
    @java.lang.Override()
    public T getValue(@org.jetbrains.annotations.Nullable()
    java.lang.Object thisRef, @org.jetbrains.annotations.NotNull()
    kotlin.reflect.KProperty<?> property) {
        return null;
    }
    
    @android.annotation.SuppressLint(value = {"CommitPrefEdits"})
    @java.lang.Override()
    public void setValue(@org.jetbrains.annotations.Nullable()
    java.lang.Object thisRef, @org.jetbrains.annotations.NotNull()
    kotlin.reflect.KProperty<?> property, T value) {
    }
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0005"}, d2 = {"Lcom/superzhan/android/mvvmcore/common/Preference$Companion;", "", "()V", "TAG", "", "mvvmcore_release"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}