package com.example.dell.loginregister_retrofit.Presenter;

import android.content.Context;
import android.util.Log;

import com.example.dell.loginregister_retrofit.Retrofit.ApiClass;
import com.example.dell.loginregister_retrofit.Retrofit.ApiInterface;
import com.example.dell.loginregister_retrofit.Model.Login_Response;
import com.example.dell.loginregister_retrofit.View.Login_View;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class UserLogin_Presenter {
    Login_View login_view;
    Context context;

    public UserLogin_Presenter(Context context, Login_View login_view) {
        this.login_view = login_view;
        this.context = context;
    }

    public void Login(String email, String password) {
        ApiInterface apiInterface = ApiClass.getClient().create(ApiInterface.class);
        Call<Login_Response> call = apiInterface.Login(email, password);
        call.enqueue(new Callback<Login_Response>() {
            @Override
            public void onResponse(Call<Login_Response> call, Response<Login_Response> response) {
                Login_Response login_response = response.body();
                try {
                    if (response.isSuccessful()) {
                        Log.i("MyLogin", login_response.getMsg());
                        Log.i("getApiToken", login_response.getData().getApiToken());
                        login_view.Success();
                        login_view.apitoken(login_response.getData());
                    } else {
                        login_view.Error();
                    }
                } catch (Exception ex) {
                    ex.getMessage();
                    login_view.Error();
                }
            }

            @Override
            public void onFailure(Call<Login_Response> call, Throwable t) {
                login_view.Error();
            }
        });
    }
}
