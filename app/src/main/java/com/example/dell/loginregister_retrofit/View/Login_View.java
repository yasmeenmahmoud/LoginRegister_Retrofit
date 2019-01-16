package com.example.dell.loginregister_retrofit.View;

import com.example.dell.loginregister_retrofit.Model.LoginData_Model;

public interface Login_View {
    void Error();
    void Success();
    void apitoken(LoginData_Model loginData_model);


}
