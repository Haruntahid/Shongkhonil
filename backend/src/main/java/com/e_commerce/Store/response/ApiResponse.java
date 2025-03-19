package com.e_commerce.Store.response;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public class ApiResponse {
    private int code;
    private String status;
    private String message;
}
