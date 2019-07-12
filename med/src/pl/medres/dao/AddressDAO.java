package pl.medres.dao;

import java.util.List;
import pl.medres.model.Address;
public interface AddressDAO extends GenericDAO<Address, Long>{
	List<Address>getAll();

}
