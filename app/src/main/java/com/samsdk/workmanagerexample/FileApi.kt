package com.samsdk.workmanagerexample

import okhttp3.ResponseBody
import retrofit2.Response
import retrofit2.Retrofit
import retrofit2.http.GET

interface FileApi {

    @GET("564x/3b/a3/e8/3ba3e85e4b586011d414f7b26e156dbf.jpg") //https://i.pinimg.com/
    suspend fun downloadImage(): Response<ResponseBody>

    companion object {
        val instance by lazy {
            Retrofit.Builder()
                .baseUrl("https://i.pinimg.com/")
                .build()
                .create(FileApi::class.java)
        }
    }
}