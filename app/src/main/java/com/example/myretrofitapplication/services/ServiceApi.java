package com.example.myretrofitapplication.services;

import com.example.myretrofitapplication.model.User;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;
import retrofit2.http.Query;

public interface ServiceApi {

    @GET("register.php")
        // call the registration page query
    Call<User> doRegistration(@Query("name") String name,
                              @Query("email") String email,
                              @Query("password") String password,
                              @Query("phone") String phone);


    @GET("login.php")
        // call the login page query
    Call<User> doRegistration(@Query("email") String email,
                              @Query("password") String password);

}
