package com.egitim.zaimders.model


import com.google.gson.annotations.SerializedName

data class ClosestCity(
    @SerializedName("cityCode")
    val cityCode: Int,
    @SerializedName("distance")
    val distance: Double,
    @SerializedName("name")
    val name: String,
    @SerializedName("population")
    val population: Int
)