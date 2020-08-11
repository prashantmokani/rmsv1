package com.masala.hmsv1.service;

import com.masala.hmsv1.dto.HallReservationRequest;
import com.masala.hmsv1.entities.HallReservation;
import com.masala.hmsv1.repositories.HallReservationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class HallReservationService {

    @Autowired
    private HallReservationRepository hallReservationRepository;

    public HallReservation reserveHall(HallReservationRequest hallReservationRequest){
        HallReservation hallReservation = new HallReservation();

        hallReservation.setCustomerName(hallReservationRequest.getCustomerName());
        hallReservation.setPhoneNumber(hallReservationRequest.getPhoneNumber());
        hallReservation.setEmailId(hallReservationRequest.getEmailId());
        hallReservation.setEventName(hallReservationRequest.getEventName());
        hallReservation.setBookingDate(hallReservationRequest.getBookingDate());
        hallReservation.setFromTime(hallReservationRequest.getFromTime());
        hallReservation.setToTime(hallReservationRequest.getToTime());
        hallReservation.setNoOfAttendees(hallReservationRequest.getNoOfAttendees());
        hallReservation.setSpecialRequest(hallReservationRequest.getSpecialRequest());

        hallReservationRepository.save(hallReservation);

        return hallReservation;
    }

    public List<HallReservation> showAllHallReservation(){
        return hallReservationRepository.findAll();
    }
}
