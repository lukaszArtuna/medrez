package pl.medres.service;

import pl.medres.dao.DAOFactory;
import pl.medres.dao.PersonDAO;
import pl.medres.model.Person;

public class PersonService {
	
	public void addPerson(String firstName, String lastName, String sex, 
			String mobilePhone, String email
			) {
		Person person = new Person();
		person.setFirstName(firstName);
		person.setLastName(lastName);
		person.setSex(sex);
		person.setMobilePhone(mobilePhone);
		person.setEmail(email);
		DAOFactory factory = DAOFactory.getDAOFactory();
		PersonDAO personDao = factory.getPersonDAO();
		personDao.create(person);
		
	}

}
