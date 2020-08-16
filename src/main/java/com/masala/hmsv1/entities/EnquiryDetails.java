package com.masala.hmsv1.entities;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Data
@Table(name = "enquiry_details")
public class EnquiryDetails extends AbstractEntity{

    @Column(name = "full_name")
    private String fullName;

    private String email;

    private String subject;

    private String message;
}
