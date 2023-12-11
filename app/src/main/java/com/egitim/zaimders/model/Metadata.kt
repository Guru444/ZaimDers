package com.egitim.zaimders.model


import com.google.gson.annotations.SerializedName

data class Metadata(
    @SerializedName("date_ends")
    val dateEnds: String,
    @SerializedName("date_starts")
    val dateStarts: String,
    @SerializedName("total")
    val total: Int
)