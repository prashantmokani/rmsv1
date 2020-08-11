package com.masala.hmsv1.entities;

import com.sun.istack.NotNull;
import lombok.Data;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.Entity;
import javax.persistence.Table;
import java.sql.Date;
import java.sql.Time;

@Entity
@Data
@Table(name = "table_reservation")
public class TableReservation extends AbstractEntity {
    @NotNull
    private String customerName;
    @NotNull
    private String phoneNumber;
    @NotNull
    private String emailId;
    @NotNull
    private Date bookingDate;
    @NotNull
    private Time startTime;
    @NotNull
    private int noOfAttendees;
    private String specialRequest;
}
