package pl.medres.dao;

import java.util.List;

import pl.medres.model.User;

public class UserDAOImpl implements UserDAO{

	private static final String CREATE_USER = 
			"INSERT INTO user(username, email, password, is_active) VALUES(:username, :email, :password, :active);";
	@Override
	public User create(User newObject) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public User read(Long primaryKey) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean update(User updateObject) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean delete(Long key) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public List<User> getAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public User getUserByUsername(String username) {
		// TODO Auto-generated method stub
		return null;
	}
	

}
