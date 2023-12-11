package com.egitim.zaimders.model


import com.google.gson.annotations.SerializedName

data class Result(
    @SerializedName("created_at")
    val createdAt: Int,
    @SerializedName("date")
    val date: String,
    @SerializedName("date_time")
    val dateTime: String,
    @SerializedName("depth")
    val depth: Double,
    @SerializedName("earthquake_id")
    val earthquakeId: String,
    @SerializedName("geojson")
    val geojson: Geojson,
    @SerializedName("_id")
    val id: String,
    @SerializedName("location_properties")
    val locationProperties: LocationProperties,
    @SerializedName("location_tz")
    val locationTz: String,
    @SerializedName("mag")
    val mag: Double,
    @SerializedName("provider")
    val provider: String,
    @SerializedName("rev")
    val rev: Any,
    @SerializedName("title")
    val title: String
)