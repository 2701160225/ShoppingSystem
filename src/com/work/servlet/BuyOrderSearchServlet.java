package com.work.servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.work.dao.BuyOrderDao;
import com.work.entity.BuyOrder;


@WebServlet("/buyOrderSearchServlet")
public class BuyOrderSearchServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
  
    public BuyOrderSearchServlet() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		String no = request.getParameter("no");
		BuyOrderDao buyOrderDao = new BuyOrderDao();
			try {
				List<BuyOrder> buyOrderList =buyOrderDao.search(no);
				request.setAttribute("no", no);
				request.setAttribute("buyOrderList", buyOrderList);
			} catch (Exception e) {
				e.printStackTrace();
			}
			request.getRequestDispatcher("buyOrderSearchResult.jsp").forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException {
		doGet(request, response);
	}

}
