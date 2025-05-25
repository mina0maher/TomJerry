package com.mina.tomjerry.models

data class TomCardData(
    val title: String,
    val subtitle: String,
    val tomIcon:Int,
    val cheeseCount: Int,
    val oldCheeseCount:Int?=null
)