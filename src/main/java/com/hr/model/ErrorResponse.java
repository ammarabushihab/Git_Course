package com.hr.model;

import java.util.Date;
import java.util.List;


public class ErrorResponse {

    private String message;
    private String statusCode;
    private Date time;
    private List<String> details;

    public ErrorResponse(String message, String statusCode, List<String> details) {
        this.message = message;
        this.statusCode = statusCode;
        this.details = details;
        this.time=new Date();
    }
public ErrorResponse(){

}
    public void setMessage(String message) {
        this.message = message;
    }

    public void setStatusCode(String statusCode) {
        this.statusCode = statusCode;
    }

    public void setTime(Date time) {
        this.time = time;
    }

    public void setDetails(List<String> details) {
        this.details = details;
    }

    public String getMessage() {
        return message;
    }

    public String getStatusCode() {
        return statusCode;
    }

    public Date getTime() {
        return time;
    }

    public List<String> getDetails() {
        return details;
    }
}