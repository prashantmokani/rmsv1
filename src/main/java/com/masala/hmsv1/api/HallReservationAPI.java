package com.masala.hmsv1.api;

import com.masala.hmsv1.dto.BaseResponse;
import com.masala.hmsv1.dto.HallReservationRequest;
import com.masala.hmsv1.entities.HallReservation;
import com.masala.hmsv1.exceptions.HallReservationNotFoundException;
import com.masala.hmsv1.service.HallReservationService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.sql.Date;
import java.util.List;

@RestController
@Slf4j
@CrossOrigin(origins = "*")
@RequestMapping("/api/hall")
public class HallReservationAPI {

    @Autowired
    private HallReservationService hallReservationService;

    @PostMapping("/hallReservation")
    public ResponseEntity hallReservation(@RequestBody HallReservation hallReservation){
        HallReservation hallReservationDetails = hallReservationService.reserveHall(hallReservation);
        return new ResponseEntity<>(new BaseResponse(HttpStatus.OK.value(),
                "Hall reservation has been done with Reservation Id :"+hallReservationDetails.getId()), HttpStatus.OK);
    }

    @GetMapping("/showAllHallReservation")
    public List<HallReservation> showAllHall(){
        return hallReservationService.showAllHallReservation();
    }

    @GetMapping("/showAllHall/{bookingDate}")
    public ResponseEntity showHall(@PathVariable Date bookingDate){
        List<HallReservation> hallReservationList = hallReservationService.showHallReservationByDate(bookingDate);
        try {
            if(hallReservationList.isEmpty()){
                throw new HallReservationNotFoundException("Hall Reservation not found for the date: "+bookingDate.toString());
            }
        }
        catch (HallReservationNotFoundException exception){
            return new ResponseEntity(new BaseResponse(HttpStatus.OK.value(),exception.getMessage()),HttpStatus.OK);
        }
        return new ResponseEntity<>(new BaseResponse(HttpStatus.OK.value(),
                "Data fetched successfully",hallReservationList),HttpStatus.OK);
    }
}
