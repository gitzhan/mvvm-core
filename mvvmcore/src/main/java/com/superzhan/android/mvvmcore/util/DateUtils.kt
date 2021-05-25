package com.superzhan.android.mvvmcore.util

import android.annotation.SuppressLint
import java.text.SimpleDateFormat
import java.util.*

object DateUtils {

    const val UTC_FORMAT = "yyyy-MM-dd'T'HH:mm:ss'Z'"
    const val YY_MM_DD_HH_MM_SS_FORMAT = "yyyy-MM-dd HH:mm:ss"
    const val YY_MM_DD_FORMAT = "yyyy-MM-dd"
    const val HH_MM_SS_FORMAT = "HH:mm:ss"

    val maxOfToday: String
        get() {
            return getMaxOfDay(Date())
        }

    val minOfToday: String
        get() {
            return getMinOfDay(Date())
        }

    val nowDateTime: String
        get() {
            return getDateTime(Date(), YY_MM_DD_HH_MM_SS_FORMAT)
        }

    val nowDate: String
        get() {
            return getDateTime(Date(), YY_MM_DD_FORMAT)
        }

    val nowTime: String
        get() {
            return getDateTime(Date(), HH_MM_SS_FORMAT)
        }

    fun getMaxOfDay(date: Date, format: String = YY_MM_DD_HH_MM_SS_FORMAT): String {
        val maxDate = Calendar.getInstance().run {
            time = date
            set(Calendar.HOUR_OF_DAY, 23)
            set(Calendar.MINUTE, 59)
            set(Calendar.SECOND, 59)
            set(Calendar.MILLISECOND, 999)
            time
        }
        return getDateTime(maxDate, format)
    }

    fun getMinOfDay(date: Date, format: String = YY_MM_DD_HH_MM_SS_FORMAT): String {
        val minDate = Calendar.getInstance().run {
            time = date
            set(Calendar.HOUR_OF_DAY, 0)
            set(Calendar.MINUTE, 0)
            set(Calendar.SECOND, 0)
            time
        }
        return getDateTime(minDate, format)
    }

    @SuppressLint("SimpleDateFormat")
    fun getDateTime(date: Date, format: String = YY_MM_DD_HH_MM_SS_FORMAT): String {
        val simpleDateFormat = SimpleDateFormat(format)
        return simpleDateFormat.format(date)
    }

    fun getDate(date: Date, format: String = YY_MM_DD_FORMAT): String = getDateTime(date, format)

    fun getTime(date: Date, format: String = HH_MM_SS_FORMAT): String = getDateTime(date, format)
}