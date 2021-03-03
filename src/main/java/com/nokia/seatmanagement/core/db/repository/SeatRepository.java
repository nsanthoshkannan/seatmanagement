package com.nokia.seatmanagement.core.db.repository;

import org.springframework.data.repository.CrudRepository;

import com.nokia.seatmanagement.models.Seats;  

public interface SeatRepository extends CrudRepository<Seats, Long> {

}
