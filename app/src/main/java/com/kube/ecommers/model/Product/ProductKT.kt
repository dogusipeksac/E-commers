package com.kube.ecommers.model.Product

import com.google.gson.annotations.SerializedName

data class ProductKT(
    @SerializedName("id")
    val id: Int?,
    @SerializedName("name")
    val product_name: String?,
    @SerializedName("price")
    val product_price: String?,
    @SerializedName("currency")
    val product_currency: String?,
    @SerializedName("image")
    val product_image_url: String?,
)