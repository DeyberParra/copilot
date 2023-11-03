package com.appwesome.copilot.model

import java.util.Date

data class  Tires(
    val sizeTires : String,
    val wheels: List<Wheels>
)

data class Wheels(
    val size: String,
    val age : Int,
    val changeDate : Date
)