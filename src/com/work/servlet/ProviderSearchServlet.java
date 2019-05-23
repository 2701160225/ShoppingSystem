package com.work.servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.work.dao.ProviderDao;
import com.work.entity.Provider;

@WebServlet("/providerSearchServlet")
public class ProviderSearchServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public ProviderSearchServlet() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		String name = request.getParameter("name");
		ProviderDao providerDao = new ProviderDao();
			try {
				List<Provider> providerList =providerDao.search(name);
				request.setAttribute("name", name);
				request.setAttribute("providerList", providerList);
			} catch (Exception e) {
				e.printStackTrace();
			}
			request.getRequestDispatcher("providerSearchResult.jsp").forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException {
		doGet(request, response);
	}

}