package com.work.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.work.dao.ProviderDao;
import com.work.entity.Provider;


@WebServlet("/providerModifyServlet")
public class ProviderModifyServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public ProviderModifyServlet() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		String id = request.getParameter("id");
		ProviderDao providerDao = new ProviderDao();
		Provider provider = new Provider();
		try {
			provider =providerDao.getOne(Integer.valueOf(id));
			request.setAttribute("provider", provider);
		} catch (Exception e) {
			e.printStackTrace();
		}
		request.getRequestDispatcher("providerModify.jsp").forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException {
		doGet(request, response);
	}

}
