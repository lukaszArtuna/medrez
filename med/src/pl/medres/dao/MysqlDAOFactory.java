package pl.medres.dao;

public class MysqlDAOFactory extends DAOFactory{

	@Override
	public AddressDAO getAddressDAO() {
		
		return new AddressDAOImpl();
	}

	@Override
	public PersonDAO getPersonDAO() {
		
		return new PersonDAOImpl();
	}

	@Override
	public ReservationDAO getReservationDAO() {
		
		return new ReservationDAOImpl();
	}

	@Override
	public UserDAO getUserDAO() {
		
		return new UserDAOImpl();
	}

}
