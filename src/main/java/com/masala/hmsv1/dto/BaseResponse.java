package com.masala.hmsv1.dto;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.List;

@Data
@AllArgsConstructor
public class BaseResponse {
    private int httpStatus;
    private String message;
    private List data;

    public BaseResponse(){}
    public BaseResponse(int httpStatus,String message){
        this.httpStatus=httpStatus;
        this.message=message;
    }
}
