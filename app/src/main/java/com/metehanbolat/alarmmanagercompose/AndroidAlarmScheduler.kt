package com.metehanbolat.alarmmanagercompose

import android.app.AlarmManager
import android.content.Context

class AndroidAlarmScheduler(
    private val context: Context
) : AlarmScheduler {

    private val alarmManager = context.getSystemService(AlarmManager::class.java)

    override fun schedule(item: AlarmItem) {
    }

    override fun cancel(item: AlarmItem) {

    }
}