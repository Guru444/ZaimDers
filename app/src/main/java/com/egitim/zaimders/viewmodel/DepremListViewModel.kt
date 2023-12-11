package com.egitim.zaimders.viewmodel

import android.annotation.SuppressLint
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.egitim.zaimders.model.DepremListesiResponse
import com.egitim.zaimders.service.DepremAPIService
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.disposables.CompositeDisposable
import io.reactivex.observers.DisposableSingleObserver
import io.reactivex.schedulers.Schedulers

class DepremListViewModel : ViewModel() {

    private val depremAPIService = DepremAPIService()
    val getDepremList = MutableLiveData<DepremListesiResponse>()

    @SuppressLint("CheckResult")
    fun getDepremList() {
        depremAPIService.getDeprem()
            .subscribeOn(Schedulers.newThread())
            .observeOn(AndroidSchedulers.mainThread())
            .subscribeWith(object : DisposableSingleObserver<DepremListesiResponse>() {
                override fun onSuccess(response: DepremListesiResponse) {
                    getDepremList.value = response
                }

                override fun onError(e: Throwable) {
                    e.printStackTrace()
                }
            })
    }
}