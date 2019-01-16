package com.example.dell.loginregister_retrofit.Presenter;

import android.content.Context;
import android.util.Log;
import android.widget.Toast;

import com.example.dell.loginregister_retrofit.Retrofit.ApiClass;
import com.example.dell.loginregister_retrofit.Retrofit.ApiInterface;
import com.example.dell.loginregister_retrofit.Model.Register_Response;
import com.example.dell.loginregister_retrofit.View.UserRegister_View;

import java.util.HashMap;
import java.util.Map;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class UserRegister_Presenter {
    UserRegister_View userRegister_view;
    Context context;

    public UserRegister_Presenter(Context context, UserRegister_View userRegister_view) {
        this.userRegister_view = userRegister_view;
        this.context = context;
    }

    public void Register(String name, String email, String password, String confirmpassword, String phone, String reginid, String address) {
        Map<String, String> registerqueryMap = new HashMap<>();
        registerqueryMap.put("email", email);
        registerqueryMap.put("password", password);
        registerqueryMap.put("name", name);
        registerqueryMap.put("password_confirmation", confirmpassword);
        registerqueryMap.put("phone", phone);
        registerqueryMap.put("address", address);
        registerqueryMap.put("region_id", reginid);

        ApiInterface apiInterface = ApiClass.getClient().create(ApiInterface.class);
        Call<Register_Response> call = apiInterface.Register(registerqueryMap);
        call.enqueue(new Callback<Register_Response>() {
            @Override
            public void onResponse(Call<Register_Response> call, Response<Register_Response> response) {
                Register_Response register_response = response.body();
                try {
                    if (register_response != null) {
                        Log.i("mymessage", register_response.getMsg());
                        userRegister_view.Success();
                        Toast.makeText(context, register_response.getMsg(), Toast.LENGTH_SHORT).show();
                    }
                } catch (Exception ex) {
                    ex.getMessage();
                }
            }

            @Override
            public void onFailure(Call<Register_Response> call, Throwable t) {
                Toast.makeText(context, t.toString(), Toast.LENGTH_SHORT).show();
            }
        });
    }

}
