package com.ak47.spark;

public enum StatusResponse {

    SUCCESS("success"), ERROR("error");

    final private String status;

    StatusResponse(String status){
        this.status = status;
    }

    public String getStatus(){
        return status;
    }

}
