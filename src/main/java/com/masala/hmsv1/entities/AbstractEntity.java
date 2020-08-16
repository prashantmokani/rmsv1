package com.masala.hmsv1.entities;

import lombok.Data;

import javax.persistence.*;

@Data
@MappedSuperclass
public class AbstractEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO, generator = "idGen")
    @Column(name = "id")
    private long id;
}
