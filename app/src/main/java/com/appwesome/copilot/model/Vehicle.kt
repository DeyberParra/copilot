package com.appwesome.copilot.model

data class Vehicle(
    val tag : String,
    val make : String,
    val model : String,
    val color : String?,
    val vehicleType : VehicleType?,
    val serialNumber : String?,
    val circulationCard: CirculationCard?,
    val fuel : FuelType,
    val engineStatus: EngineStatus,
    val insurance : Insurance,
    val tires : Tires
    )
