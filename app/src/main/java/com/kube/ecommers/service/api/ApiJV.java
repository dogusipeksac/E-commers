package com.kube.ecommers.service.api;
import com.kube.ecommers.model.ParametersBody.ParametersBodyJV;
import com.kube.ecommers.model.Product.ProductJV;

import java.util.List;
import io.reactivex.Single;
import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.Url;

interface ApiJV {
    @GET("listing")
    Single<List<ProductJV>> getProduct();

    @POST
    Call<ProductJV> postProduct(@Url String url, @Body ParametersBodyJV parametersBodyJV);

}
