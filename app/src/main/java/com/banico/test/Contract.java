package com.banico.test;

import com.banico.test.responses.RegisterResponse;

public interface Contract {

    interface View{
        void onRegisterResponse(RegisterResponse registerResponse);
        void onActivationResponse();
    }

    interface Presenter{
        void onAttachView(View view);
        void onActivationRequest();
        void onActivationResponse();
        void onRegisterRequest();
        void onRegisterResponse(RegisterResponse body);
    }

    interface Model{
        void onModelAttached(Presenter presenter);
        void onActivationRequest();
        void onRegisterRequest();
    }
}
