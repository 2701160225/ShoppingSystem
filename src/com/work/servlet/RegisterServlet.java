package com.work.servlet;



import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.work.dao.UserDao;
import com.work.entity.User;




@WebServlet("/register")
public class RegisterServlet extends HttpServlet {

	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doPost(request, response);
	}

	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		//数据校验除了要在前端用js校验，服务的也是需要数据校验的
		request.setCharacterEncoding("UTF-8");
		String txtName = request.getParameter("txtName");
		String txtNick = request.getParameter("txtNick");
		String txtEmail = request.getParameter("txtEmail");
		String txtPwd = request.getParameter("txtPwd");
		String txtPhone = request.getParameter("txtPhone");
		String txtBornDate = request.getParameter("txtBornDate");
		
		System.out.println(txtName+" "+txtNick+" "+txtEmail+" "+txtPwd+" "+txtPhone+" "+txtBornDate);

		User user = new User();
		user.setName(txtNick);
		user.setPassword(txtPwd);
		
		UserDao dao = new UserDao();
		
		try {
			if(dao.addUser(user)==1){
				request.setAttribute("name", txtNick);
				request.getRequestDispatcher("success.jsp").forward(request, response);
			}else{
				response.sendRedirect("register.jsp");
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
