package com.egitim.zaimders.model


import com.google.gson.annotations.SerializedName

data class Airport(
    @SerializedName("code")
    val code: String,
    @SerializedName("coordinates")
    val coordinates: Coordinates,
    @SerializedName("distance")
    val distance: Double,
    @SerializedName("name")
    val name: String
)