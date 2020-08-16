package com.masala.hmsv1.service;

import com.masala.hmsv1.entities.EnquiryDetails;
import com.masala.hmsv1.repositories.EnquiryDetailsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EnquiryDetailsService {
    @Autowired
    private EnquiryDetailsRepository enquiryDetailsRepository;

    public EnquiryDetails saveEnquiryDetails(EnquiryDetails enquiryDetails){

        return enquiryDetailsRepository.save(enquiryDetails);

    }
}
