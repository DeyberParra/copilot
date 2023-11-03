package com.appwesome.copilot.model

data class Insurance(
    val insuranceName : String,
    val emergencyPhone : String,
    val startCoverageDate : String,
    val endCoverageDate : String,
    val document : String? //If the user wants to upload a document
)
