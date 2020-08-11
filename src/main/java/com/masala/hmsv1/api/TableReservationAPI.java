package com.masala.hmsv1.api;

import com.masala.hmsv1.dto.BaseResponse;
import com.masala.hmsv1.dto.TableReservationRequest;
import com.masala.hmsv1.entities.TableReservation;
import com.masala.hmsv1.service.TableReservationService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@Slf4j
@CrossOrigin(origins = "*")
@RequestMapping("/api/v1/table")
public class TableReservationAPI {
    @Autowired
    private TableReservationService tableReservationService;

    @PostMapping("/tableReservation")
    public ResponseEntity tableReservation(@RequestBody TableReservationRequest tableReservationRequest){
        log.info("Table Reservation request is started for request : {}",tableReservationRequest.toString());

        TableReservation tableReservation = tableReservationService.reserveTable(tableReservationRequest);
        log.debug("Table is reserved with ID : {}",tableReservation.getId());
        return new ResponseEntity<>(new BaseResponse(HttpStatus.OK.value(),
                "Your table is reserved with Table Id : "+tableReservation.getId())
                ,HttpStatus.OK);
    }


    @GetMapping("/showAllTableReservation")
    public List<TableReservation> showAllTable(){
        return tableReservationService.showAllTableReservation();
    }
}
