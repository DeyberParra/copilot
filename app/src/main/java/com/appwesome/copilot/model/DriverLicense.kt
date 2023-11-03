package com.appwesome.copilot.model

import java.util.Date

data class DriverLicense(
    val licenseNumber : String,
    val driverName : String?,
    val expeditionDate : Date,
    val expirationDate : Date,
    val document : String? //If the user wants to upload a document
    )