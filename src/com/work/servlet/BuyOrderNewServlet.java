package com.work.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.work.dao.BuyOrderDao;
import com.work.entity.BuyOrder;


@WebServlet("/buyOrderNewServlet")
public class BuyOrderNewServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public BuyOrderNewServlet() {
        super();
        
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		String no = request.getParameter("no");
		String prv_id = request.getParameter("prv_id");
		String dt = request.getParameter("dt");
		
		BuyOrder buyOrder = new BuyOrder();
		buyOrder.setNo(no);
		buyOrder.setPrv_id(prv_id);
		buyOrder.setDt(dt);
		BuyOrderDao goodsDao = new BuyOrderDao();
		
		try {
			BuyOrderDao.insert(buyOrder);
			request.setAttribute("buyOrder", buyOrder);
			request.getRequestDispatcher("buyOrderNewSaveOK.jsp").forward(request, response);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException {
		doGet(request, response);
	}

}
