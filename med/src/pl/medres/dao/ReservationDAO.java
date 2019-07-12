package pl.medres.dao;

import java.util.List;

import pl.medres.model.Reservation;
public interface ReservationDAO extends GenericDAO<Reservation, Long>{
	List<Reservation>getAll();

}
