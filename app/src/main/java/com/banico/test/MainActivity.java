package com.banico.test;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import com.banico.test.responses.RegisterResponse;

public class MainActivity extends AppCompatActivity implements Contract.View {

    Contract.Presenter presenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        presenter = new Presenter();
        presenter.onAttachView(this);
        presenter.onRegisterRequest();

    }

    @Override
    public void onRegisterResponse(RegisterResponse registerResponse) {
    }
}
