package pl.medres.dao;


public abstract class DAOFactory {
	public abstract AddressDAO getAddressDAO();
	public abstract PersonDAO getPersonDAO();
	public abstract ReservationDAO getReservationDAO();
	public abstract UserDAO getUserDAO();

}
