package com.example.demo.model;


public class ApiResponse {
    private String status;
    private int statusCode;
    private String message;
    private Object data;

    public ApiResponse() {
    }

    public ApiResponse(String status, int statusCode, String message, Object data) {
        this.status = status;
        this.statusCode = statusCode;
        this.message = message;
        this.data = data;
    }

    public ApiResponse(String accountSuccessfullyCreated, int i, Long id) {

    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public int getStatusCode() {
        return statusCode;
    }

    public void setStatusCode(int statusCode) {
        this.statusCode = statusCode;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }
}

