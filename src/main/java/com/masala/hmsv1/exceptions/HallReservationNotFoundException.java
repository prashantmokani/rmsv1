package com.masala.hmsv1.exceptions;

public class HallReservationNotFoundException extends Exception {
    public HallReservationNotFoundException(String errorMessage){
        super(errorMessage);
    }
}
