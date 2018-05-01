package com.chanduthedev.ExceptionHandlingDemo.exception;

import java.util.Date;

import org.springframework.http.HttpStatus;

public class ApiError {

    private Date timestamp;
    private HttpStatus statusCode;
    private String debugMsg;

    public ApiError() {
        super();
        // TODO Auto-generated constructor stub
    }

    public ApiError(Date timestamp, HttpStatus statusCode, String debugMsg) {
        super();
        this.timestamp = timestamp;
        this.statusCode = statusCode;
        this.debugMsg = debugMsg;
    }

    public Date getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(Date timestamp) {
        this.timestamp = timestamp;
    }

    public HttpStatus getStatusCode() {
        return statusCode;
    }

    public void setStatusCode(HttpStatus statusCode) {
        this.statusCode = statusCode;
    }

    public String getDebugMsg() {
        return debugMsg;
    }

    public void setDebugMsg(String debugMsg) {
        this.debugMsg = debugMsg;
    }

}
