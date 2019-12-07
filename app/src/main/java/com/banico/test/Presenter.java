package com.banico.test;

import com.banico.test.responses.RegisterResponse;

public class Presenter implements Contract.Presenter {

    private Contract.View view;
    private Contract.Model model;

    @Override
    public void onAttachView(Contract.View view) {
        this.view = view;
        model = new Model();
        model.onModelAttached(this);
    }

    @Override
    public void onRegisterRequest() {
        model.onRegisterRequest();
    }

    @Override
    public void onRegisterResponse(RegisterResponse body) {
        view.onRegisterResponse(body);
    }
}
