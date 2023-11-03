package com.appwesome.copilot.model

import java.util.Date

data class EngineStatus(
    val engineNumber : String,
    val mileage : Double,
    val regularMaintenanceDate: Date,
    val majorMaintenanceDate : Date,
    val oilChangeDate : Date,
    val breakFluidChangeDate : Date
)