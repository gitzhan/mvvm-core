package com.superzhan.android.mvvmcore.ext;

import java.lang.System;

@kotlin.Suppress(names = {"UNCHECKED_CAST"})
@kotlin.Metadata(mv = {1, 5, 1}, k = 2, d1 = {"\u0000:\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0000\u001a\u001d\u0010\u0000\u001a\u0002H\u0001\"\u0004\b\u0000\u0010\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\u0002\u00a2\u0006\u0002\u0010\u0004\u001a\u001b\u0010\u0005\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u00012\u0006\u0010\u0006\u001a\u0002H\u0001H\u0002\u00a2\u0006\u0002\u0010\u0007\u001a)\u0010\b\u001a\u00020\t*\u00020\n2\u0017\u0010\u000b\u001a\u0013\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\t0\f\u00a2\u0006\u0002\b\u000eH\u0086\b\u00f8\u0001\u0000\u001a/\u0010\u000f\u001a\u0002H\u0001\"\u0004\b\u0000\u0010\u0001*\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00032\u0006\u0010\u0012\u001a\u0002H\u00012\b\b\u0002\u0010\u0013\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0014\u001a/\u0010\u000f\u001a\u0002H\u0001\"\u0004\b\u0000\u0010\u0001*\u00020\u00152\u0006\u0010\u0011\u001a\u00020\u00032\u0006\u0010\u0012\u001a\u0002H\u00012\b\b\u0002\u0010\u0013\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0016\u001a/\u0010\u0017\u001a\u00020\t\"\u0004\b\u0000\u0010\u0001*\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00032\u0006\u0010\u0018\u001a\u0002H\u00012\b\b\u0002\u0010\u0013\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0019\u001a/\u0010\u0017\u001a\u00020\t\"\u0004\b\u0000\u0010\u0001*\u00020\u00152\u0006\u0010\u0011\u001a\u00020\u00032\u0006\u0010\u0018\u001a\u0002H\u00012\b\b\u0002\u0010\u0013\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u001a\u001a\u001e\u0010\u001b\u001a\u00020\n*\u00020\u00102\b\b\u0002\u0010\u0013\u001a\u00020\u00032\b\b\u0002\u0010\u001c\u001a\u00020\u001d\u001a\u001e\u0010\u001b\u001a\u00020\n*\u00020\u00152\b\b\u0002\u0010\u0013\u001a\u00020\u00032\b\b\u0002\u0010\u001c\u001a\u00020\u001d\u0082\u0002\u0007\n\u0005\b\u009920\u0001\u00a8\u0006\u001e"}, d2 = {"deSerialization", "T", "str", "", "(Ljava/lang/String;)Ljava/lang/Object;", "serialize", "obj", "(Ljava/lang/Object;)Ljava/lang/String;", "edit", "", "Landroid/content/SharedPreferences;", "action", "Lkotlin/Function1;", "Landroid/content/SharedPreferences$Editor;", "Lkotlin/ExtensionFunctionType;", "getSpValue", "Landroid/app/Activity;", "key", "default", "name", "(Landroid/app/Activity;Ljava/lang/String;Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;", "Landroid/content/Context;", "(Landroid/content/Context;Ljava/lang/String;Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;", "putSpValue", "value", "(Landroid/app/Activity;Ljava/lang/String;Ljava/lang/Object;Ljava/lang/String;)V", "(Landroid/content/Context;Ljava/lang/String;Ljava/lang/Object;Ljava/lang/String;)V", "sp", "mode", "", "mvvmcore_release"})
public final class SharedPreferencesExtKt {
    
    /**
     * Get the Editor instance and commit/apply
     * @param action invoke the action after get the [SharedPreferences.Editor] instance
     */
    public static final void edit(@org.jetbrains.annotations.NotNull()
    android.content.SharedPreferences $this$edit, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super android.content.SharedPreferences.Editor, kotlin.Unit> action) {
    }
    
    /**
     * Return the SharedPreferences instance
     * @param name Desired preferences file. Default value is the packageName
     * @param mode Operating mode. Default value is [Context.MODE_PRIVATE]
     */
    @org.jetbrains.annotations.NotNull()
    public static final android.content.SharedPreferences sp(@org.jetbrains.annotations.NotNull()
    android.content.Context $this$sp, @org.jetbrains.annotations.NotNull()
    java.lang.String name, int mode) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public static final android.content.SharedPreferences sp(@org.jetbrains.annotations.NotNull()
    android.app.Activity $this$sp, @org.jetbrains.annotations.NotNull()
    java.lang.String name, int mode) {
        return null;
    }
    
    /**
     * Set a [T] value in the preferences editor, to be written back once
     * commit() or apply() are called.
     *
     * @param key The name of the preference to modify
     * @param value The new value for the preference
     * @param name Desired preferences file. Default value is the packageName
     */
    public static final <T extends java.lang.Object>void putSpValue(@org.jetbrains.annotations.NotNull()
    android.content.Context $this$putSpValue, @org.jetbrains.annotations.NotNull()
    java.lang.String key, T value, @org.jetbrains.annotations.NotNull()
    java.lang.String name) {
    }
    
    public static final <T extends java.lang.Object>void putSpValue(@org.jetbrains.annotations.NotNull()
    android.app.Activity $this$putSpValue, @org.jetbrains.annotations.NotNull()
    java.lang.String key, T value, @org.jetbrains.annotations.NotNull()
    java.lang.String name) {
    }
    
    /**
     * Retrieve a [T] value from the preferences
     *
     * @param key The name of the preference to retrieve.
     * @param default Value to return if this preference does not exist.
     * @param name Desired preferences file. Default value is the packageName
     */
    public static final <T extends java.lang.Object>T getSpValue(@org.jetbrains.annotations.NotNull()
    android.content.Context $this$getSpValue, @org.jetbrains.annotations.NotNull()
    java.lang.String key, T p2_772401952, @org.jetbrains.annotations.NotNull()
    java.lang.String name) {
        return null;
    }
    
    public static final <T extends java.lang.Object>T getSpValue(@org.jetbrains.annotations.NotNull()
    android.app.Activity $this$getSpValue, @org.jetbrains.annotations.NotNull()
    java.lang.String key, T p2_772401952, @org.jetbrains.annotations.NotNull()
    java.lang.String name) {
        return null;
    }
    
    private static final <T extends java.lang.Object>java.lang.String serialize(T obj) {
        return null;
    }
    
    private static final <T extends java.lang.Object>T deSerialization(java.lang.String str) {
        return null;
    }
}