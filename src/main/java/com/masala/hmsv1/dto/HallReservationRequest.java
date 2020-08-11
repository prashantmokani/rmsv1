package com.masala.hmsv1.dto;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.sql.Date;
import java.sql.Time;

@Data
@AllArgsConstructor
public class HallReservationRequest {
    private String customerName;
    private String phoneNumber;
    private String emailId;
    private String eventName;
    private Date bookingDate;
    private Time fromTime;
    private Time toTime;
    private int noOfAttendees;
    private String specialRequest;

    public HallReservationRequest(){}
}
