package com.work.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.work.dao.UserDao;
import com.work.entity.User;

@WebServlet("/loginServlet")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public LoginServlet() {
		super();
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doPost(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		String name = request.getParameter("uname");
		String pwd = request.getParameter("pwd");
		System.out.println(name + "----------------" + pwd);

		UserDao userdao = new UserDao();
		int i = userdao.findUser(name, pwd);
		if (i == 1) {
			request.getRequestDispatcher("buyManageSystem.jsp").forward(request, response);
		} else {
			response.sendRedirect("login.jsp");
		}
	}
}
