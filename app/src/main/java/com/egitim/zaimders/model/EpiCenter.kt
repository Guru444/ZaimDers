package com.egitim.zaimders.model


import com.google.gson.annotations.SerializedName

data class EpiCenter(
    @SerializedName("cityCode")
    val cityCode: Int,
    @SerializedName("name")
    val name: String,
    @SerializedName("population")
    val population: Int
)