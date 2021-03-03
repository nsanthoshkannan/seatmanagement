package com.nokia.seatmanagement.core.db;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nokia.seatmanagement.core.db.repository.SeatRepository;
import com.nokia.seatmanagement.models.Seats;

@Service
public class SeatService {

	@Autowired
	SeatRepository SeatRepository;

	// getting all Seat records
	public List<Seats> getAllSeat() {
		final List<Seats> seats = new ArrayList<Seats>();
		SeatRepository.findAll().forEach(seat -> seats.add(seat));
		return seats;
	}

	// getting a specific record
	public Seats getSeatById(Long id) {
		return SeatRepository.findOne(id);
	}

	public void saveOrUpdate(Seats seat) {
		SeatRepository.save(seat);
	}

	// deleting a specific record
	public void delete(Long id) {
		SeatRepository.delete(id);
	}

}
