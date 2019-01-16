package com.example.dell.loginregister_retrofit.Helper;

import android.content.Context;
import android.graphics.Color;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.TextView;

import com.example.dell.loginregister_retrofit.Model.CityList_Response;
import com.example.dell.loginregister_retrofit.Model.Region_Response;
import com.example.dell.loginregister_retrofit.Retrofit.ApiClass;
import com.example.dell.loginregister_retrofit.Retrofit.ApiInterface;


import java.util.ArrayList;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;


public class AddressHelper {
    public Spinner regionspinner;
    public Spinner cityspinner;
    private Context context;
    private int id;
    private ArrayList<String> citiessname = new ArrayList<>();

    public AddressHelper(Context context, Spinner regionspinner, Spinner cityspinner) {
        this.context = context;
        this.regionspinner = regionspinner;
        this.cityspinner = cityspinner;

    }

    public AddressHelper(Context context, Spinner cityspinner) {
        this.context = context;
        this.cityspinner = cityspinner;

    }

    public void regionSpinner(int id) {
        ApiInterface apiInterface = ApiClass.getClient().create(ApiInterface.class);
        Call<Region_Response> call = apiInterface.getRegionList(id);
        call.enqueue(new Callback<Region_Response>() {
            @Override
            public void onResponse(Call<Region_Response> call, Response<Region_Response> response) {
                Region_Response region_response = response.body();
                ArrayList<String> regionsname = new ArrayList<>();
                final ArrayList<Integer> regionsid = new ArrayList<>();
                regionsname.add("Choose Region....");
                for (int i = 0; i < region_response.getData().getData().size(); i++) {
                    regionsname.add(region_response.getData().getData().get(i).getName());
                    Log.i("City", region_response.getData().getData().get(i).getName());
                    regionsid.add(region_response.getData().getData().get(i).getId());
                }
                regionspinner.setAdapter(new ArrayAdapter<>(context, android.R.layout.simple_spinner_dropdown_item, regionsname));
                regionspinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                    @Override
                    public void onItemSelected(AdapterView<?> parent, View view, int position, long Id) {
                        if (position != 0) {
                            int id = regionsid.get(position - 1);
                        }
                    }

                    @Override
                    public void onNothingSelected(AdapterView<?> parent) {

                    }
                });
            }

            @Override
            public void onFailure(Call<Region_Response> call, Throwable t) {
            }
        });

    }

    public void citySpinner() {
        ApiInterface apiInterface = ApiClass.getClient().create(ApiInterface.class);
        Call<CityList_Response> call = apiInterface.getCityList();
        call.enqueue(new Callback<CityList_Response>() {
            @Override
            public void onResponse(Call<CityList_Response> call, Response<CityList_Response> response) {
                final CityList_Response cityList_response = response.body();
                ArrayList<String> citiessname = new ArrayList<>();
                final ArrayList<Integer> citiesid = new ArrayList<>();
                citiessname.add("Choose City... ");
                for (int i = 0; i < cityList_response.getData().getData().size(); i++) {
                    citiessname.add(cityList_response.getData().getData().get(i).getName());
                    Log.i("City", cityList_response.getData().getData().get(i).getName());
                    citiesid.add(cityList_response.getData().getData().get(i).getId());
                }
                cityspinner.setAdapter(new ArrayAdapter<>(context, android.R.layout.simple_spinner_dropdown_item, citiessname));
                cityspinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                    @Override
                    public void onItemSelected(AdapterView<?> parent, View view, int position, long Id) {
                        if (position != 0) {
                            int id = citiesid.get(position - 1);
                            regionSpinner(id);
                        }
                    }

                    @Override
                    public void onNothingSelected(AdapterView<?> parent) {

                    }
                });
            }

            @Override
            public void onFailure(Call<CityList_Response> call, Throwable t) {
            }
        });

    }
}
