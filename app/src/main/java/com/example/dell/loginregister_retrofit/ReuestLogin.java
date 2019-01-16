package com.example.dell.loginregister_retrofit;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

/**
 * Created by khaled.badawy on 8/7/2018.
 */


public class ReuestLogin {

    @SerializedName("Email")
    @Expose
    private String email;
    @SerializedName("Password")
    @Expose
    private String password;
    @SerializedName("Language")
    @Expose
    private Integer language;

    /**
     * No args constructor for use in serialization
     *
     */
    public ReuestLogin() {
    }

    /**
     *
     * @param email
     * @param language
     * @param password
     */
    public ReuestLogin(String email, String password, Integer language) {
        super();
        this.email = email;
        this.password = password;
        this.language = language;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Integer getLanguage() {
        return language;
    }

    public void setLanguage(Integer language) {
        this.language = language;
    }

}