package com.example;

import org.springframework.context.annotation.Profile;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@Profile("dev")
@RestControllerAdvice
public class CustomerExceptionHandler {
    @ExceptionHandler(DataNotFoundException.class)
    @ResponseStatus(HttpStatus.NOT_FOUND)
    public ResponseEntity<ErrorResponse> notFound(DataNotFoundException exception) {
        ErrorResponse errorResponse = new ErrorResponse();
        errorResponse.setCode(exception.getStatusCode());
        errorResponse.setMsg(errorResponse.getMsg());
        return new ResponseEntity<>(errorResponse, HttpStatus.NOT_FOUND);
    }
}

class DataNotFoundException extends RuntimeException {
    private String msg;
    private String statusCode;

    public DataNotFoundException(String msg, String statusCode) {
        super(msg);
        this.msg = msg;
        this.statusCode = statusCode;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public String getStatusCode() {
        return statusCode;
    }

    public void setStatusCode(String statusCode) {
        this.statusCode = statusCode;
    }
}

class ErrorResponse {
    private String msg;
    private String code;


    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }
}