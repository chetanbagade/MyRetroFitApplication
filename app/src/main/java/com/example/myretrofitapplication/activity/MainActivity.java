package com.example.myretrofitapplication.activity;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.FrameLayout;

import com.example.myretrofitapplication.R;
import com.example.myretrofitapplication.constant.Constant;
import com.example.myretrofitapplication.extras.AppPreference;
import com.example.myretrofitapplication.fragment.LoginFragment;
import com.example.myretrofitapplication.fragment.ProfileFragment;
import com.example.myretrofitapplication.fragment.RegistrationFragment;
import com.example.myretrofitapplication.services.MyInterface;
import com.example.myretrofitapplication.services.RetrofitClient;
import com.example.myretrofitapplication.services.ServiceApi;

public class MainActivity extends AppCompatActivity implements MyInterface {

    FrameLayout frameLayout;
    public static ServiceApi serviceApi;
    public static String c_date;
    public static AppPreference appPreference;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        frameLayout = findViewById(R.id.fragment_container);
        serviceApi = RetrofitClient.getApiClient(Constant.baseUrl.BASE_URL).create(ServiceApi.class);

    }

    @Override
    public void register() {

        getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container, new RegistrationFragment()).addToBackStack(null).commit();


    }

    @Override
    public void login(String name, String email, String created_at) {
        getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container, new ProfileFragment()).commit();

    }

    @Override
    public void logout() {
        getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container, new LoginFragment()).commit();

    }
}
