package com.example.dell.loginregister_retrofit;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

/**
 * Created by khaled.badawy on 8/7/2018.
 */

public class LoginModel {


    @SerializedName("result")
    @Expose
    private Result result;
    @SerializedName("ISResultHasData")
    @Expose
    private Integer iSResultHasData;

    /**
     * No args constructor for use in serialization
     */
    public LoginModel() {
    }

    /**
     * @param result
     * @param iSResultHasData
     */
    public LoginModel(Result result, Integer iSResultHasData) {
        super();
        this.result = result;
        this.iSResultHasData = iSResultHasData;
    }

    public Result getResult() {
        return result;
    }

    public void setResult(Result result) {
        this.result = result;
    }

    public Integer getISResultHasData() {
        return iSResultHasData;
    }

    public void setISResultHasData(Integer iSResultHasData) {
        this.iSResultHasData = iSResultHasData;
    }

    public class Obj {

        @SerializedName("UserID")
        @Expose
        private String userID;
        @SerializedName("FullName")
        @Expose
        private String fullName;
        @SerializedName("RegisterType")
        @Expose
        private Integer registerType;
        @SerializedName("Email")
        @Expose
        private String email;
        @SerializedName("Phone")
        @Expose
        private String phone;
        @SerializedName("FB")
        @Expose
        private Object fB;
        @SerializedName("Fcm_Token")
        @Expose
        private Object fcm_Token;
        @SerializedName("CountryID")
        @Expose
        private Integer countryID;
        @SerializedName("cityID")
        @Expose
        private Integer cityID;
        @SerializedName("Country")
        @Expose
        private String country;
        @SerializedName("City")
        @Expose
        private String city;
        @SerializedName("IsLockedOut")
        @Expose
        private Object isLockedOut;
        @SerializedName("Promocode")
        @Expose
        private String promocode;
        @SerializedName("AvailableTime")
        @Expose
        private Integer availableTime;
        @SerializedName("IsValidpromo")
        @Expose
        private Boolean isValidpromo;
        @SerializedName("Language")
        @Expose
        private Integer language;
        @SerializedName("UserIdValue")
        @Expose
        private Object userIdValue;
        @SerializedName("Base64")
        @Expose
        private Object base64;
        @SerializedName("Extension")
        @Expose
        private Object extension;
        @SerializedName("SharedLink")
        @Expose
        private Object sharedLink;
        @SerializedName("PagesCount")
        @Expose
        private Integer pagesCount;
        @SerializedName("CurrentPage")
        @Expose
        private Integer currentPage;
        @SerializedName("RowsPerPage")
        @Expose
        private Integer rowsPerPage;

        /**
         * No args constructor for use in serialization
         */
        public Obj() {
        }

        /**
         * @param promocode
         * @param sharedLink
         * @param phone
         * @param userIdValue
         * @param countryID
         * @param cityID
         * @param pagesCount
         * @param availableTime
         * @param fB
         * @param fcm_Token
         * @param country
         * @param city
         * @param extension
         * @param userID
         * @param rowsPerPage
         * @param base64
         * @param registerType
         * @param email
         * @param isValidpromo
         * @param currentPage
         * @param language
         * @param fullName
         * @param isLockedOut
         */
        public Obj(String userID, String fullName, Integer registerType, String email, String phone, Object fB, Object fcm_Token, Integer countryID, Integer cityID, String country, String city, Object isLockedOut, String promocode, Integer availableTime, Boolean isValidpromo, Integer language, Object userIdValue, Object base64, Object extension, Object sharedLink, Integer pagesCount, Integer currentPage, Integer rowsPerPage) {
            super();
            this.userID = userID;
            this.fullName = fullName;
            this.registerType = registerType;
            this.email = email;
            this.phone = phone;
            this.fB = fB;
            this.fcm_Token = fcm_Token;
            this.countryID = countryID;
            this.cityID = cityID;
            this.country = country;
            this.city = city;
            this.isLockedOut = isLockedOut;
            this.promocode = promocode;
            this.availableTime = availableTime;
            this.isValidpromo = isValidpromo;
            this.language = language;
            this.userIdValue = userIdValue;
            this.base64 = base64;
            this.extension = extension;
            this.sharedLink = sharedLink;
            this.pagesCount = pagesCount;
            this.currentPage = currentPage;
            this.rowsPerPage = rowsPerPage;
        }

        public String getUserID() {
            return userID;
        }

        public void setUserID(String userID) {
            this.userID = userID;
        }

        public String getFullName() {
            return fullName;
        }

        public void setFullName(String fullName) {
            this.fullName = fullName;
        }

        public Integer getRegisterType() {
            return registerType;
        }

        public void setRegisterType(Integer registerType) {
            this.registerType = registerType;
        }

        public String getEmail() {
            return email;
        }

        public void setEmail(String email) {
            this.email = email;
        }

        public String getPhone() {
            return phone;
        }

        public void setPhone(String phone) {
            this.phone = phone;
        }

        public Object getFB() {
            return fB;
        }

        public void setFB(Object fB) {
            this.fB = fB;
        }

        public Object getFcm_Token() {
            return fcm_Token;
        }

        public void setFcm_Token(Object fcm_Token) {
            this.fcm_Token = fcm_Token;
        }

        public Integer getCountryID() {
            return countryID;
        }

        public void setCountryID(Integer countryID) {
            this.countryID = countryID;
        }

        public Integer getCityID() {
            return cityID;
        }

        public void setCityID(Integer cityID) {
            this.cityID = cityID;
        }

        public String getCountry() {
            return country;
        }

        public void setCountry(String country) {
            this.country = country;
        }

        public String getCity() {
            return city;
        }

        public void setCity(String city) {
            this.city = city;
        }

        public Object getIsLockedOut() {
            return isLockedOut;
        }

        public void setIsLockedOut(Object isLockedOut) {
            this.isLockedOut = isLockedOut;
        }

        public String getPromocode() {
            return promocode;
        }

        public void setPromocode(String promocode) {
            this.promocode = promocode;
        }

        public Integer getAvailableTime() {
            return availableTime;
        }

        public void setAvailableTime(Integer availableTime) {
            this.availableTime = availableTime;
        }

        public Boolean getIsValidpromo() {
            return isValidpromo;
        }

        public void setIsValidpromo(Boolean isValidpromo) {
            this.isValidpromo = isValidpromo;
        }

        public Integer getLanguage() {
            return language;
        }

        public void setLanguage(Integer language) {
            this.language = language;
        }

        public Object getUserIdValue() {
            return userIdValue;
        }

        public void setUserIdValue(Object userIdValue) {
            this.userIdValue = userIdValue;
        }

        public Object getBase64() {
            return base64;
        }

        public void setBase64(Object base64) {
            this.base64 = base64;
        }

        public Object getExtension() {
            return extension;
        }

        public void setExtension(Object extension) {
            this.extension = extension;
        }

        public Object getSharedLink() {
            return sharedLink;
        }

        public void setSharedLink(Object sharedLink) {
            this.sharedLink = sharedLink;
        }

        public Integer getPagesCount() {
            return pagesCount;
        }

        public void setPagesCount(Integer pagesCount) {
            this.pagesCount = pagesCount;
        }

        public Integer getCurrentPage() {
            return currentPage;
        }

        public void setCurrentPage(Integer currentPage) {
            this.currentPage = currentPage;
        }

        public Integer getRowsPerPage() {
            return rowsPerPage;
        }

        public void setRowsPerPage(Integer rowsPerPage) {
            this.rowsPerPage = rowsPerPage;
        }

    }


    public class Result {

        @SerializedName("success")
        @Expose
        private Boolean success;
        @SerializedName("obj")
        @Expose
        private Obj obj;
        @SerializedName("Message")
        @Expose
        private Object message;

        /**
         * No args constructor for use in serialization
         */
        public Result() {
        }

        /**
         * @param message
         * @param obj
         * @param success
         */
        public Result(Boolean success, Obj obj, Object message) {
            super();
            this.success = success;
            this.obj = obj;
            this.message = message;
        }

        public Boolean getSuccess() {
            return success;
        }

        public void setSuccess(Boolean success) {
            this.success = success;
        }

        public Obj getObj() {
            return obj;
        }

        public void setObj(Obj obj) {
            this.obj = obj;
        }

        public Object getMessage() {
            return message;
        }

        public void setMessage(Object message) {
            this.message = message;
        }

    }

}
