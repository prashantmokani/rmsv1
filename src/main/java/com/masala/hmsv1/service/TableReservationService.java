package com.masala.hmsv1.service;

import com.masala.hmsv1.dto.TableReservationRequest;
import com.masala.hmsv1.entities.HallReservation;
import com.masala.hmsv1.entities.TableReservation;
import com.masala.hmsv1.repositories.TableReservationRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;

import java.sql.Date;
import java.util.List;

@Service
@Slf4j
public class TableReservationService {

    @Autowired
    private TableReservationRepository tableReservationRepository;


    public TableReservation reserveTable(TableReservation tableReservation){

        log.info("Reserve table Service is Started for request = {}",tableReservation.toString());
/*        TableReservation tableReservation = new TableReservation();

        tableReservation.setCustomerName(tableReservationRequest.getCustomerName());
        tableReservation.setBookingDate(tableReservationRequest.getBookingDate());
        tableReservation.setEmailId(tableReservationRequest.getEmailId());
        tableReservation.setNoOfAttendees(tableReservationRequest.getNoOfAttendees());
        tableReservation.setPhoneNumber(tableReservationRequest.getPhoneNumber());
        tableReservation.setSpecialRequest(tableReservationRequest.getSpecialRequest());
        tableReservation.setStartTime(tableReservationRequest.getStartTime());*/

        log.debug("Table reservation successfully done : ");
        return tableReservationRepository.save(tableReservation);
    }

    public List<TableReservation> showAllTableReservation(){
        return tableReservationRepository.findAll();
    }

    public List<TableReservation> showAllTableReservationsByDate(Date date){

        List<TableReservation> tableReservationList = tableReservationRepository.getAllTableReservationsByDate(date);
        return tableReservationList;
    }
}
