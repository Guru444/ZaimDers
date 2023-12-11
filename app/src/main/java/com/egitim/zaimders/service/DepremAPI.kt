package com.egitim.zaimders.service

import com.egitim.zaimders.model.DepremListesiResponse
import io.reactivex.Single
import retrofit2.http.GET
import retrofit2.http.Path
import retrofit2.http.Query

interface DepremAPI {

    companion object{
        const val LIVE_DEPREM = "kandilli/live"
    }

    @GET(LIVE_DEPREM)
    fun getDepremListesi() : Single<DepremListesiResponse>

}