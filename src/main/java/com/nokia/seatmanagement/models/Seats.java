package com.nokia.seatmanagement.models;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class Seats {

	@Id
	@Column
	private Long id;
	@Column
	private Long floorId;
	@Column
	private Long seatNumber;
	@Column
	private String description;
	@Column
	private String status;
	@Column
	private Date updatedTime;

	public Seats(Long floorId, Long seatNumber, String description, String status) {
		super();
		this.floorId = floorId;
		this.seatNumber = seatNumber;
		this.description = description;
		this.status = status;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Long getFloorId() {
		return floorId;
	}

	public void setFloorId(Long floorId) {
		this.floorId = floorId;
	}

	public Long getSeatNumber() {
		return seatNumber;
	}

	public void setSeatNumber(Long seatNumber) {
		this.seatNumber = seatNumber;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public Date getUpdatedTime() {
		return updatedTime;
	}

	public void setUpdatedTime(Date updatedTime) {
		this.updatedTime = updatedTime;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((description == null) ? 0 : description.hashCode());
		result = prime * result + ((floorId == null) ? 0 : floorId.hashCode());
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((seatNumber == null) ? 0 : seatNumber.hashCode());
		result = prime * result + ((status == null) ? 0 : status.hashCode());
		result = prime * result + ((updatedTime == null) ? 0 : updatedTime.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Seats other = (Seats) obj;
		if (description == null) {
			if (other.description != null)
				return false;
		} else if (!description.equals(other.description))
			return false;
		if (floorId == null) {
			if (other.floorId != null)
				return false;
		} else if (!floorId.equals(other.floorId))
			return false;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		if (seatNumber == null) {
			if (other.seatNumber != null)
				return false;
		} else if (!seatNumber.equals(other.seatNumber))
			return false;
		if (status == null) {
			if (other.status != null)
				return false;
		} else if (!status.equals(other.status))
			return false;
		if (updatedTime == null) {
			if (other.updatedTime != null)
				return false;
		} else if (!updatedTime.equals(other.updatedTime))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Seats [id=" + id + ", floorId=" + floorId + ", seatNumber=" + seatNumber + ", description="
				+ description + ", status=" + status + ", updatedTime=" + updatedTime + "]";
	}

}