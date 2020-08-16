package com.masala.hmsv1.api;

import com.masala.hmsv1.entities.HallReservation;
import com.masala.hmsv1.repositories.HallReservationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.sql.Date;
import java.util.List;

@Controller
@CrossOrigin(origins = "*")
public class GeneralAPI {


    @GetMapping("/")
    public String showInfo(){
        return "redirect:http://localhost:8080/swagger-ui.html";
        /*return "All the APIs are : api/v1/hall/hallReservation, " +
                "api/v1/table/tableReservation ," +
                "api/v1/table/showAllTableReservation ," +
                "http://localhost:8080/api/v1/hall/showAllHallReservation";*/
    }


}
