package com.egitim.zaimders.model


import com.google.gson.annotations.SerializedName

data class DepremListesiResponse(
    @SerializedName("desc")
    val desc: String,
    @SerializedName("httpStatus")
    val httpStatus: Int,
    @SerializedName("metadata")
    val metadata: Metadata,
    @SerializedName("result")
    val result: ArrayList<Result>,
    @SerializedName("serverloadms")
    val serverloadms: Int,
    @SerializedName("status")
    val status: Boolean
)