package com.example.dell.loginregister_retrofit.Retrofit;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.util.concurrent.TimeUnit;

import okhttp3.OkHttpClient;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;
public class ApiClass {
    public static final String BASE_URL="http://ipda3.com/sofra/api/v1/";

    private static Retrofit retrofit = null;
    public static Retrofit getClient() {
        Gson gson = new GsonBuilder()
                .setLenient()
                .create();

        final OkHttpClient okHttpClient = new OkHttpClient.Builder()
                .readTimeout(60, TimeUnit.SECONDS)
                .connectTimeout(60, TimeUnit.SECONDS)
                .build();

        if (retrofit == null) {
            retrofit = new Retrofit.Builder()
                    .baseUrl(BASE_URL)
                    .addConverterFactory(GsonConverterFactory.create(gson))
                    .client(okHttpClient)
                    .build();
        }

        return retrofit;
    }

}


//
//
//    public static Retrofit getRetrofit() {
//        public static Retrofit getClien() {
//            Gson gson = new GsonBuilder()
//                    .setLenient()
//                    .create();
//
//            final OkHttpClient okHttpClient = new OkHttpClient.Builder()
//                    .readTimeout(60, TimeUnit.SECONDS)
//                    .connectTimeout(60, TimeUnit.SECONDS)
//                    .build();
//
//            if (retrofit == null) {
//
//                retrofit = new Retrofit.Builder().baseUrl(URL_BASE)
//                        .addConverterFactory(GsonConverterFactory.create(gson))
//                        .client(okHttpClient)
//                        .build();
//            }
//            return retrofit;


//    private static OkHttpClient getClient() {
//
//        HttpLoggingInterceptor httpLoggingInterceptor = new HttpLoggingInterceptor();
//        httpLoggingInterceptor.setLevel(HttpLoggingInterceptor.Level.BODY);
//
//
//
//        return new OkHttpClient.Builder()
//                .connectTimeout(1, TimeUnit.MINUTES)
//                .readTimeout(1, TimeUnit.MINUTES)
//                .addInterceptor(httpLoggingInterceptor)
//                .build();
   // }
//}
