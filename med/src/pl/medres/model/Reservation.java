package pl.medres.model;

import java.time.LocalDate;
import java.time.LocalTime;


public class Reservation {
	private long reservation_id;
	private LocalDate reservationDate;
	private LocalTime timeStart;
	private LocalTime timeEnd;
	private String descriptionString;
	private User user_idUser;
	
	
	
	
	
	
	public Reservation() {
		
	}
	
	public Reservation(long reservation_id, LocalDate reservationDate, LocalTime timeStart, LocalTime timeEnd,
			String descriptionString, User user_idUser) {
		this.reservation_id = reservation_id;
		this.reservationDate = reservationDate;
		this.timeStart = timeStart;
		this.timeEnd = timeEnd;
		this.descriptionString = descriptionString;
		this.user_idUser = user_idUser;
	}
	public long getReservation_id() {
		return reservation_id;
	}
	public void setReservation_id(long reservation_id) {
		this.reservation_id = reservation_id;
	}
	public LocalDate getReservationDate() {
		return reservationDate;
	}
	public void setReservationDate(LocalDate reservationDate) {
		this.reservationDate = reservationDate;
	}
	public LocalTime getTimeStart() {
		return timeStart;
	}
	public void setTimeStart(LocalTime timeStart) {
		this.timeStart = timeStart;
	}
	public LocalTime getTimeEnd() {
		return timeEnd;
	}
	public void setTimeEnd(LocalTime timeEnd) {
		this.timeEnd = timeEnd;
	}
	public String getDescriptionString() {
		return descriptionString;
	}
	public void setDescriptionString(String descriptionString) {
		this.descriptionString = descriptionString;
	}
	public User getUser_idUser() {
		return user_idUser;
	}
	public void setUser_idUser(User user_idUser) {
		this.user_idUser = user_idUser;
	}

	@Override
	public String toString() {
		return "reservation [reservation_id=" + reservation_id + ", reservationDate=" + reservationDate + ", timeStart="
				+ timeStart + ", timeEnd=" + timeEnd + ", descriptionString=" + descriptionString + ", user_idUser="
				+ user_idUser + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((descriptionString == null) ? 0 : descriptionString.hashCode());
		result = prime * result + ((reservationDate == null) ? 0 : reservationDate.hashCode());
		result = prime * result + (int) (reservation_id ^ (reservation_id >>> 32));
		result = prime * result + ((timeEnd == null) ? 0 : timeEnd.hashCode());
		result = prime * result + ((timeStart == null) ? 0 : timeStart.hashCode());
		result = prime * result + ((user_idUser == null) ? 0 : user_idUser.hashCode());
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
		Reservation other = (Reservation) obj;
		if (descriptionString == null) {
			if (other.descriptionString != null)
				return false;
		} else if (!descriptionString.equals(other.descriptionString))
			return false;
		if (reservationDate == null) {
			if (other.reservationDate != null)
				return false;
		} else if (!reservationDate.equals(other.reservationDate))
			return false;
		if (reservation_id != other.reservation_id)
			return false;
		if (timeEnd == null) {
			if (other.timeEnd != null)
				return false;
		} else if (!timeEnd.equals(other.timeEnd))
			return false;
		if (timeStart == null) {
			if (other.timeStart != null)
				return false;
		} else if (!timeStart.equals(other.timeStart))
			return false;
		if (user_idUser == null) {
			if (other.user_idUser != null)
				return false;
		} else if (!user_idUser.equals(other.user_idUser))
			return false;
		return true;
	}

	
	
		
	

}
