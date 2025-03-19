package com.e_commerce.Store.constants;

public class ApiConstants {
    public static final String API = "/api";
    public static final String API_VERSION = "/v1";
    public static final String ADMIN = "/admin";
    public static final String PUBLIC = "/public";
    public static final String BASEURL = API + API_VERSION;
    public static final String ID = "/{id}";


    // product related API's
    public static final String PRODUCT = "/product";
    public static final String UPLOAD_PRODUCT = ADMIN+PRODUCT;


    // colors related API's
    private static final String COLOR = "/color";
    public static final String UPLOAD_COLOR = ADMIN+COLOR;
    public static final String GET_COLOR = ADMIN+COLOR+ID;

    // category related API's
    private static final String CATEGORY= "/category";
    public static final String UPLOAD_CATEGORY = ADMIN+CATEGORY;
    public static final String GET_CATEGORY = ADMIN+CATEGORY+ID;


}
