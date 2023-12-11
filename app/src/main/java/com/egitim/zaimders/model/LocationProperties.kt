package com.egitim.zaimders.model


import com.google.gson.annotations.SerializedName

data class LocationProperties(
    @SerializedName("airports")
    val airports: List<Airport>,
    @SerializedName("closestCities")
    val closestCities: List<ClosestCity>,
    @SerializedName("closestCity")
    val closestCity: ClosestCity,
    @SerializedName("epiCenter")
    val epiCenter: EpiCenter
)