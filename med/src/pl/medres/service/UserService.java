package pl.medres.service;

import pl.medres.dao.DAOFactory;
import pl.medres.model.User;
import pl.medres.dao.UserDAO;

public class UserService {
	public void addUser(Long user_id, String email, String password) {
		User user = new User();
		user.setUser_id(user_id);
		user.setEmail(email);
		user.setPassword(password);
		user.setIs_active(true);
		DAOFactory factory = DAOFactory.getDAOFactory();
		UserDAO userDao = factory.getUserDAO();
		userDao.create(user);
	}

}
