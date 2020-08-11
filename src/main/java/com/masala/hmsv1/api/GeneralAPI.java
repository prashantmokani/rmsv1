package com.masala.hmsv1.api;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GeneralAPI {

    @RequestMapping("/")
    public String showInfo(){
        return "All the APIs are : api/v1/hall/hallReservation, " +
                "api/v1/table/tableReservation ," +
                "api/v1/table/showAllTableReservation ," +
                "http://localhost:8080/api/v1/hall/showAllHallReservation";
    }
}
