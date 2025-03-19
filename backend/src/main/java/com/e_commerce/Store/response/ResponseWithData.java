package com.e_commerce.Store.response;

import lombok.Getter;

@Getter
public class ResponseWithData extends ApiResponse{
    private final Object data;


    public ResponseWithData(Integer code, String status, String message,  Object data) {
        super(code,status,message);
        this.data = data;
    }
}
