package com.e_commerce.Store.exceptions;

import com.e_commerce.Store.response.ApiResponse;
import com.e_commerce.Store.response.ServerResponse;
import org.springframework.http.ResponseEntity;
import org.springframework.web.ErrorResponse;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import java.util.ArrayList;
import java.util.List;

@ControllerAdvice
public class GlobalExceptionHandling {
    @ExceptionHandler(NotFoundException.class)
    public ResponseEntity<ApiResponse> handleNotFoundException(NotFoundException e) {
        return ServerResponse.notFound(e.getMessage());
    }

    @ExceptionHandler(AlreadyExistException.class)
    public ResponseEntity<ApiResponse> handleAlreadyExistException(AlreadyExistException e) {
        return ServerResponse.conflict(e.getMessage());
    }

    @ExceptionHandler(UnauthorizedException.class)
    public ResponseEntity<ApiResponse> handleUnauthorizedException(UnauthorizedException e) {
        return ServerResponse.unauthorized(e.getMessage());
    }

//    @ExceptionHandler(MethodArgumentNotValidException.class)
//    public ResponseEntity<ErrorResponse> handleMethodArgumentNotValidException(MethodArgumentNotValidException e) {
//        List<String> errors = new ArrayList<>();
//
//        e.getBindingResult().getFieldErrors().forEach(error -> {
//            errors.add(error.getDefaultMessage());
//        });
//        return ServerResponse.fieldResponse(errors);
//    }

}
