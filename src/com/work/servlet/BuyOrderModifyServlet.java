package com.work.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.work.dao.BuyOrderDao;
import com.work.entity.BuyOrder;


@WebServlet("/buyOrderModifyServlet")
public class BuyOrderModifyServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public BuyOrderModifyServlet() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		String id = request.getParameter("id");
		BuyOrderDao buyOrderDao = new BuyOrderDao();
		BuyOrder buyOrder = new BuyOrder();
		try {
			buyOrder = buyOrderDao.getOne(Integer.valueOf(id));
			request.setAttribute("buyOrder", buyOrder);
		} catch (Exception e) {
			e.printStackTrace();
		}
		request.getRequestDispatcher("buyOrderModify.jsp").forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException {
		doGet(request, response);
	}

}
