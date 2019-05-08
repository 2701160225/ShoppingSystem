package com.work.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.work.dao.BuyOrderDao;


@WebServlet("/buyOrderDeleteServlet")
public class BuyOrderDeleteServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
  
    public BuyOrderDeleteServlet() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		String id = request.getParameter("id");
		BuyOrderDao buyOrderDao = new BuyOrderDao();
		try {
			buyOrderDao.delete(Integer.valueOf(id));
		} catch (Exception e) {
			e.printStackTrace();
		}
			response.sendRedirect("buyOrderDeleteSaveOK.jsp");
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
