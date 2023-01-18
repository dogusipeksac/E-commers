package com.kube.ecommers.service

import com.kube.ecommers.helper.Constants
import com.kube.ecommers.model.Product.ProductKT
import com.kube.ecommers.service.api.ApiKT
import io.reactivex.Single
import retrofit2.Retrofit
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory
import retrofit2.converter.gson.GsonConverterFactory

class ApiService {
    private val api= Retrofit.Builder()
        .baseUrl(Constants.baseUrl)
        .addConverterFactory(GsonConverterFactory.create())
        .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
        .build()
        .create(ApiKT::class.java)

    fun getData(): Single<List<ProductKT>> {
        return api.getProduct()
    }
}