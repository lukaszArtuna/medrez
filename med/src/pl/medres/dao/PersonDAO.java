package pl.medres.dao;

import java.util.List;
import pl.medres.model.Person;

public interface PersonDAO extends GenericDAO<Person, Long> {
	List<Person>getAll();
	

}
