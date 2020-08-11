package com.masala.hmsv1.dto;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.sql.Date;
import java.sql.Time;

@Data
@AllArgsConstructor
public class TableReservationRequest {
    private String customerName;
    private String phoneNumber;
    private String emailId;
    private Date bookingDate;
    private Time startTime;
    private int noOfAttendees;
    private String specialRequest;

    public TableReservationRequest(){}
}
