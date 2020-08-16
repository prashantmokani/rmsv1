package com.masala.hmsv1.exceptions;

public class TableReservationNotFoundException extends Exception {

    public TableReservationNotFoundException(String errorMessage){
        super(errorMessage);
    }
}
