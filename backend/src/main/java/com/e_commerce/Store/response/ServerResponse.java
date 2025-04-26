package com.e_commerce.Store.response;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

public class ServerResponse {

    private static ResponseEntity<ApiResponse> generateResponse(String status, String message, HttpStatus httpStatus) {
        return new ResponseEntity<>(
                new ApiResponse(httpStatus.value(), status, message != null ? message : "Unexpected Error Occurred"
                ), httpStatus
        );
    }

    private static ResponseEntity<ApiResponse> successResponse(String message, HttpStatus httpStatus) {
        return generateResponse("Success", message, httpStatus);
    }

    private static ResponseEntity<ApiResponse> errorResponse(String message, HttpStatus httpStatus) {
        return generateResponse("Failed", message, httpStatus);
    }


    public static ResponseEntity<ApiResponse> created(String message) {
        return successResponse (message, HttpStatus.CREATED);
    }

    public static ResponseEntity<ApiResponse> Ok(String message) {
        return successResponse(message, HttpStatus.OK);
    }

    public static ResponseEntity<ResponseWithData> withData(String message, Object data) {
        return ResponseEntity.ok().body(
                new ResponseWithData(
                        HttpStatus.OK.value(),
                        "Success",
                        message,
                        data
                )
        );
    }

    public static ResponseEntity<ApiResponse> conflict(String message) {
        return errorResponse(message, HttpStatus.CONFLICT);
    }

    public static ResponseEntity<ApiResponse> unauthorized(String message) {
        return errorResponse(message, HttpStatus.UNAUTHORIZED);
    }

    public static ResponseEntity<ApiResponse> notFound(String message) {
        return errorResponse(message, HttpStatus.NOT_FOUND);
    }

}
