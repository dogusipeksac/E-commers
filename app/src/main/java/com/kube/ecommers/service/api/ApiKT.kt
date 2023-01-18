package com.kube.ecommers.service.api

import com.kube.ecommers.model.Product.ProductKT
import io.reactivex.Single
import retrofit2.http.GET

interface ApiKT {
    @GET("listing")
    fun getProduct() : Single<List<ProductKT>>
}