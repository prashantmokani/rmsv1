package com.masala.hmsv1.repositories;

import com.masala.hmsv1.entities.HallReservation;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.sql.Date;
import java.util.List;

public interface HallReservationRepository extends JpaRepository<HallReservation,Long> {
    @Query("from HallReservation where bookingDate=:date")
    List<HallReservation> getAllHallsByBookingDate(@Param("date") Date date);
}
