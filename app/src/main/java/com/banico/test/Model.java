package com.banico.test;

import androidx.annotation.NonNull;
import com.banico.test.network.Service;
import com.banico.test.responses.RegisterResponse;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class Model implements Contract.Model {

    private Contract.Presenter presenter;

    @Override
    public void onModelAttached(Contract.Presenter presenter) {
        this.presenter = presenter;
    }

    @Override
    public void onRegisterRequest() {
        Service.getService().register(null).enqueue(new Callback<RegisterResponse>() {
            @Override
            public void onResponse(@NonNull Call<RegisterResponse> call,@NonNull Response<RegisterResponse> response) {
                presenter.onRegisterResponse(response.body());
            }

            @Override
            public void onFailure(@NonNull Call<RegisterResponse> call,@NonNull Throwable t) {

            }
        });
    }


}
