package com.example.splash.repo;


import com.example.splash.modal.UserModal;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.POST;
public interface RetrofitAPI {
    @POST("api/AccessToken/GetAccessToken")

        //on below line we are creating a method to post our data.
    Call<String> createPost(@Body UserModal dataModal);
}
