package com.superzhan.android.mvvmcore.common

import android.annotation.SuppressLint
import android.content.Context
import android.content.SharedPreferences
import android.util.Log
import kotlin.properties.ReadWriteProperty
import kotlin.reflect.KProperty

open class Preference<T>(
    private val name: String,
    private val default: T,
    context: Context,
    fileName: String = "default"
) : ReadWriteProperty<Any?, T> {

    private val prefs: SharedPreferences by lazy {
        context.getSharedPreferences(fileName, Context.MODE_PRIVATE)
    }

    override fun getValue(thisRef: Any?, property: KProperty<*>): T = with(prefs) {
        val result: Any? = when (default) {
            is Int -> getInt(name, default)
            is Float -> getFloat(name, default)
            is Long -> getLong(name, default)
            is String -> getString(name, default)
            is Boolean -> getBoolean(name, default)
            else -> throw IllegalArgumentException("This type can be saved into Preferences")
        }
        Log.d(TAG, "getValueBySharedPreferences, name: $name, vaule: $result")
        return result as T
    }

    @SuppressLint("CommitPrefEdits")
    override fun setValue(thisRef: Any?, property: KProperty<*>, value: T) {
        with(prefs.edit()) {
            when (value) {
                is Int -> putInt(name, value)
                is Float -> putFloat(name, value)
                is Long -> putLong(name, value)
                is String -> putString(name, value)
                is Boolean -> putBoolean(name, value)
                else -> throw IllegalArgumentException("This type can be saved into Preferences")
            }
        }.apply()
        Log.d(TAG, "setValueBySharedPreferences, name: $name, vaule: $value")
    }

    companion object {
        private const val TAG = "SharedPreferences"
    }
}