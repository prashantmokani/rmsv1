package com.masala.hmsv1.api;

import com.masala.hmsv1.dto.BaseResponse;
import com.masala.hmsv1.dto.HallReservationRequest;
import com.masala.hmsv1.entities.HallReservation;
import com.masala.hmsv1.service.HallReservationService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.net.http.HttpClient;
import java.util.List;

@RestController
@Slf4j
@CrossOrigin(origins = "*")
@RequestMapping("/api/v1/hall")
public class HallReservationAPI {

    @Autowired
    private HallReservationService hallReservationService;

    @PostMapping("/hallReservation")
    public ResponseEntity hallReservation(@RequestBody HallReservationRequest hallReservationRequest){
        HallReservation hallReservation = hallReservationService.reserveHall(hallReservationRequest);
        return new ResponseEntity<>(new BaseResponse(HttpStatus.OK.value(),
                "Hall reservation has been done with Reservation Id :"+hallReservation.getId()), HttpStatus.OK);
    }

    @GetMapping("/showAllHallReservation")
    public List<HallReservation> showAllHall(){
        return hallReservationService.showAllHallReservation();
    }
}
