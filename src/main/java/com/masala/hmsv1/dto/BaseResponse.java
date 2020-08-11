package com.masala.hmsv1.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.http.HttpStatus;
import org.springframework.web.servlet.resource.HttpResource;

import java.net.http.HttpResponse;

@Data
@AllArgsConstructor
public class BaseResponse {
    private int httpStatus;
    private String message;
}
