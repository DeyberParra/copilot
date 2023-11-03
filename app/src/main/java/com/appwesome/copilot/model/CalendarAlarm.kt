package com.appwesome.copilot.model

data class CalendarAlarm(
    val title : AlarmType,
    val reminder : Reminder?,
    val enable : Boolean = false
)
