package com.appwesome.copilot.model

import java.util.Date

data class CirculationCard(
    val expeditionDate: Date,
    val licensePlateNumber: String,
    val licensePlateExpirationDate: Date,
    val vin : String,
    val document : String? // If the user wants to upload a document
)