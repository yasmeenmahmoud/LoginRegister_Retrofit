package com.example.dell.loginregister_retrofit.Activity;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ProgressBar;
import android.widget.Spinner;
import android.widget.Toast;

import com.example.dell.loginregister_retrofit.Helper.AddressHelper;
import com.example.dell.loginregister_retrofit.Presenter.UserRegister_Presenter;
import com.example.dell.loginregister_retrofit.R;
import com.example.dell.loginregister_retrofit.View.UserRegister_View;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class RegisterActivity extends AppCompatActivity implements UserRegister_View {

    @BindView(R.id.fullname)
    EditText fullname;
    @BindView(R.id.email)
    EditText email;
    @BindView(R.id.password)
    EditText password;
    @BindView(R.id.confirmpassword)
    EditText confirmpassword;
    @BindView(R.id.phone)
    EditText phone;
    @BindView(R.id.city_spinner)
    Spinner citySpinner;
    @BindView(R.id.country_spinner)
    Spinner countrySpinner;
    @BindView(R.id.signup_btn)
    Button signupBtn;
    UserRegister_Presenter userRegister_presenter;
    @BindView(R.id.simpleprogressbar)
    ProgressBar simpleprogressbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);
        ButterKnife.bind(this);
        userRegister_presenter = new UserRegister_Presenter(this, this);
        AddressHelper addressHelper = new AddressHelper(this, citySpinner, countrySpinner);
        addressHelper.citySpinner();
    }

    @OnClick(R.id.signup_btn)
    public void onViewClicked() {
        simpleprogressbar.setVisibility(View.VISIBLE);
        String _name = fullname.getText().toString();
        String _email = email.getText().toString();
        String _password = password.getText().toString();
        String _confirmpasswordd = confirmpassword.getText().toString();
        String _phone = phone.getText().toString();
        String _country = countrySpinner.getSelectedItem().toString();
        String _city = String.valueOf(citySpinner.getSelectedItemId());
        if (_name.isEmpty() || _email.isEmpty() || _password.isEmpty() || _confirmpasswordd.isEmpty() || _phone.isEmpty() || _country.isEmpty() || _city.isEmpty()) {
            Toast.makeText(this, "this field is required  ,Please try Again ^^", Toast.LENGTH_SHORT).show();
            simpleprogressbar.setVisibility(View.GONE);

        } else {
            userRegister_presenter.Register(_name, _email, _password, _confirmpasswordd, _phone, _city, _country);
        }
    }

    @Override
    public void Error() {
        Toast.makeText(this, "Register Failed ,Please try Again ^^", Toast.LENGTH_SHORT).show();
        simpleprogressbar.setVisibility(View.GONE);

    }

    @Override
    public void Success() {
        simpleprogressbar.setVisibility(View.GONE);
        Toast.makeText(this, "Register succes,Welcome ^^", Toast.LENGTH_SHORT).show();
        Intent loginintent = new Intent(RegisterActivity.this, MainActivity.class);
        startActivity(loginintent);
    }
}
