package com.appwesome.copilot.model

data class Reminder(
    val anticipationDays: Int,
    val attempts : List<ReminderTime>,
    val enable : Boolean
)


