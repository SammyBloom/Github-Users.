package com.example.githubusers;

import java.util.ArrayList;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;

public interface ApiInterface {

    @GET("users")
    Call<ArrayList<Users>> allUsers();
@GET("users/{username}")
    Call<Users> aUser(@Path("username") String username);
}
