package com.kube.ecommers.service.helper;

import android.content.Context;

import com.kube.ecommers.helper.Constants;

import java.util.concurrent.TimeUnit;

import okhttp3.OkHttpClient;
import okhttp3.Request;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class ConnectionHelperJV {
    private static ConnectionHelperJV myConnectionHelperJV;
    private OkHttpClient.Builder httpClient;
    private Context context;

    public static ConnectionHelperJV sharedInstance() {
        if (myConnectionHelperJV == null) {
            myConnectionHelperJV = new ConnectionHelperJV();
        }
        return myConnectionHelperJV;
    }
    public Retrofit getJsonUrlRetrofit(Context context) {
        this.context = context;
        Retrofit retrofit = null;
            getHttpClient();
            retrofit = new Retrofit.Builder()
                    .baseUrl(Constants.baseUrl)
                    .addConverterFactory(GsonConverterFactory.create())
                    .client(httpClient.build())
                    .build();
            return retrofit;
    }

    private void getHttpClient() {
        httpClient = new OkHttpClient.Builder();
        httpClient.connectTimeout(60, TimeUnit.SECONDS);
        httpClient.readTimeout(60, TimeUnit.SECONDS);
        httpClient.writeTimeout(60, TimeUnit.SECONDS);
        httpClient.addInterceptor(chain -> {
            Request request = chain.request().newBuilder()
                    .addHeader("Content-Type", "application/json")
                    .addHeader("Accept", "*/*")
                    .build();
            return chain.proceed(request);
        });

    }

}
