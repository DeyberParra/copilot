package com.appwesome.copilot.model

data class Driver(
    val name : String,
    val email : String,
    val avatar : String?,
    val enable : Boolean,
    val driverLicense: DriverLicense,
)
