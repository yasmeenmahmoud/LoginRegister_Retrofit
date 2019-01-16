package com.example.dell.loginregister_retrofit.Activity;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.example.dell.loginregister_retrofit.Helper.SharedPereferenceClass;
import com.example.dell.loginregister_retrofit.Model.LoginData_Model;
import com.example.dell.loginregister_retrofit.Presenter.UserLogin_Presenter;
import com.example.dell.loginregister_retrofit.R;
import com.example.dell.loginregister_retrofit.View.Login_View;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class Login_Activity extends AppCompatActivity implements Login_View {
    String apitoken;
    @BindView(R.id.email)
    EditText email;
    @BindView(R.id.password)
    EditText password;
    @BindView(R.id.remembrtme_chk)
    CheckBox remembrtmeChk;
    @BindView(R.id.login)
    Button login;
    @BindView(R.id.or)
    TextView or;
    @BindView(R.id.signup)
    Button signup;
    Login_View login_view;
    UserLogin_Presenter userLogin_presenter;
SharedPereferenceClass sharedPereferenceClass=new SharedPereferenceClass();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login_);
        ButterKnife.bind(this);
        remembrtmeChk.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    remembrtmeChk.setButtonDrawable(R.drawable.ic_chekbox_active);
                    sharedPereferenceClass.storeKey(Login_Activity.this,"REMEMBER_ME","save");
                } else {
                    remembrtmeChk.setButtonDrawable(R.drawable.ic_chekbox_unactive);
                    sharedPereferenceClass.storeKey(Login_Activity.this,"REMEMBER_ME","unsave");

                }
            }
        });
        userLogin_presenter = new UserLogin_Presenter(this, this);
    }

    @OnClick({R.id.login, R.id.signup})
    public void onViewClicked(View view) {
        switch (view.getId()) {
            case R.id.login:
                String L_email = email.getText().toString();
                String L_password = password.getText().toString();
                userLogin_presenter.Login(L_email, L_password);

                break;
            case R.id.signup:
                Intent signupintent = new Intent(Login_Activity.this, RegisterActivity.class);
                startActivity(signupintent);
                break;
        }
    }

    @Override
    public void Error() {
        Toast.makeText(this, "Login Failed ,Please Register Before ^^", Toast.LENGTH_SHORT).show();
        Intent signupintent = new Intent(Login_Activity.this, RegisterActivity.class);
        startActivity(signupintent);
    }

    @Override
    public void Success() {
        Toast.makeText(this, "Login succes,Welcome ^^", Toast.LENGTH_SHORT).show();
        Intent loginintent = new Intent(Login_Activity.this, MainActivity.class);
        startActivity(loginintent);

    }

    @Override
    public void apitoken(LoginData_Model loginData_model) {
        apitoken = loginData_model.getApiToken();
        Toast.makeText(this, apitoken, Toast.LENGTH_SHORT).show();
    }
}
