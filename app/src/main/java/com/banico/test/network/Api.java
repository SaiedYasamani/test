package com.banico.test.network;

import com.banico.test.requests.Register;
import com.banico.test.responses.RegisterResponse;
import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.GET;

public interface Api {

    @GET("/")
    Call<RegisterResponse> register(@Body Register register);
}
