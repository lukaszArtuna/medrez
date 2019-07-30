package pl.medres.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import pl.medres.service.UserService;
import pl.medres.service.PersonService;


@WebServlet("/register")
public class RegisterController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       



	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.getRequestDispatcher("register.jsp").forward(request, response);	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		String username = request.getParameter("inputUsername"); //
		String password = request.getParameter("inputPassword");//
		String firstname = request.getParameter("imputFirstname");//
		String lastname = request.getParameter("imputLastname");//
		String sex = request.getParameter("imputSex"); // for now not input
		String mobilephone = request.getParameter("imputMobilephone");//
		String email = request.getParameter("inputEmail");//
		UserService userService = new UserService();
		userService.addUser(username, password);
		PersonService personService = new PersonService();
		personService.addPerson(firstname, lastname, sex, mobilephone, email);
		response.sendRedirect(request.getContextPath() + "/");
	}

}
