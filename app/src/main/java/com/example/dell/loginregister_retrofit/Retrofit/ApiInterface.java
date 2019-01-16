package com.example.dell.loginregister_retrofit.Retrofit;

import com.example.dell.loginregister_retrofit.Model.CityList_Response;
import com.example.dell.loginregister_retrofit.Model.Login_Response;
import com.example.dell.loginregister_retrofit.Model.Region_Response;
import com.example.dell.loginregister_retrofit.Model.Register_Response;

import java.util.List;
import java.util.Map;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.Field;
import retrofit2.http.FieldMap;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.Path;
import retrofit2.http.Query;

public interface ApiInterface {

    @POST("client/login")
    @FormUrlEncoded
    Call<Login_Response> Login(@Field("email") String email,
                               @Field("password") String password
    );
    @POST("client/register")
    @FormUrlEncoded
    Call<Register_Response> Register(@FieldMap Map<String, String> querMap);
    @GET("cities")
    Call<CityList_Response> getCityList();

    @GET("regions")
    Call<Region_Response> getRegionList(@Query("city_id") int id);


//    @POST("api/users/login")
//    Call<LoginModel> loginUSer(@Body ReuestLogin reuestLogin);
//
//
//
//    @POST("api/users/login/{id}/admin")
//    Call<LoginModel> loginUSer(@Path("id") String id);
//
//
//
//    @GET("repos")
//    Call<List<GithubResponse>> getRepos(
//            @Query("page") int page,
//            @Query("per_page") int number
//    );
}
