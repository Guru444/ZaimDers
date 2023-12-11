package com.egitim.zaimders.model


import com.google.gson.annotations.SerializedName

data class Geojson(
    @SerializedName("coordinates")
    val coordinates: List<Double>,
    @SerializedName("type")
    val type: String
)