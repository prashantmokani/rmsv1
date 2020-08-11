package com.masala.hmsv1.repositories;

import com.masala.hmsv1.entities.TableReservation;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TableReservationRepository extends JpaRepository<TableReservation,Long> {
}
