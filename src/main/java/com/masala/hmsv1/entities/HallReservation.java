package com.masala.hmsv1.entities;

import com.sun.istack.NotNull;
import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Table;
import java.sql.Date;
import java.sql.Time;

@Entity
@Data
@Table(name = "hall_reservation")
public class HallReservation extends AbstractEntity{

    @NotNull
    private String customerName;
    @NotNull
    private String phoneNumber;
    @NotNull
    private String emailId;
    @NotNull
    private String eventName;
    @NotNull
    private Date bookingDate;
    @NotNull
    private Time fromTime;
    @NotNull
    private Time toTime;
    @NotNull
    private int noOfAttendees;
    private String specialRequest;

}
