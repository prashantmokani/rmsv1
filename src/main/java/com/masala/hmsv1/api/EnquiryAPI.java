package com.masala.hmsv1.api;

import com.masala.hmsv1.dto.BaseResponse;
import com.masala.hmsv1.entities.EnquiryDetails;
import com.masala.hmsv1.service.EnquiryDetailsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping("/api/enquiry")
public class EnquiryAPI {

    @Autowired
    private EnquiryDetailsService enquiryDetailsService;

    @PostMapping("/saveEnquiry")
    public ResponseEntity registerEnquiryDetails(@RequestBody EnquiryDetails enquiryDetails){
        enquiryDetailsService.saveEnquiryDetails(enquiryDetails);


        return new ResponseEntity(new BaseResponse(HttpStatus.OK.value(),
                "Successfully sent your data, Reference Id: "+enquiryDetails.getId()),HttpStatus.OK);
    }
}
