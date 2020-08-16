package com.masala.hmsv1.repositories;

import com.masala.hmsv1.entities.HallReservation;
import com.masala.hmsv1.entities.TableReservation;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.sql.Date;
import java.util.List;

public interface TableReservationRepository extends JpaRepository<TableReservation,Long> {
    @Query("from TableReservation where bookingDate=:date")
    List<TableReservation> getAllTableReservationsByDate(@Param("date") Date date);
}
