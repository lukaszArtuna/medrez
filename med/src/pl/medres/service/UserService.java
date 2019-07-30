package pl.medres.service;

import pl.medres.dao.DAOFactory;
import pl.medres.model.User;
import pl.medres.dao.UserDAO;

public class UserService {
	public void addUser(String username, String password) {
		User user = new User();
		
		user.setUsername(username);
		user.setPassword(password);
		user.setIs_active(true);
		DAOFactory factory = DAOFactory.getDAOFactory();
		UserDAO userDao = factory.getUserDAO();
		userDao.create(user);
	}

}
