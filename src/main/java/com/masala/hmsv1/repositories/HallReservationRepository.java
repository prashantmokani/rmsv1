package com.masala.hmsv1.repositories;

import com.masala.hmsv1.entities.HallReservation;
import org.springframework.data.jpa.repository.JpaRepository;

public interface HallReservationRepository extends JpaRepository<HallReservation,Long> {
}
