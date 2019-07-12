package pl.medres.dao;

import java.util.List;

import pl.medres.model.User;

public interface UserDAO extends GenericDAO<User, Long> {
	List<User>getAll();
	User getUserByUsername(String username);
	

}
