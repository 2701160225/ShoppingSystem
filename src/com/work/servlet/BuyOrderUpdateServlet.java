package com.work.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.work.dao.BuyOrderDao;
import com.work.entity.BuyOrder;


@WebServlet("/buyOrderUpdateServlet")
public class BuyOrderUpdateServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public BuyOrderUpdateServlet() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		String id = request.getParameter("id");
		String no = request.getParameter("no");
		String prv_id = request.getParameter("prv_id");
		String dt = request.getParameter("dt");
		BuyOrder buyOrder = new BuyOrder();
		BuyOrderDao buyOrderDao = new BuyOrderDao();
		try {
			if(!id.equals("") && !no.equals("") && !prv_id.equals("") && !dt.equals("")) {
				buyOrder.setId(Integer.valueOf(id));
				buyOrder.setNo(no);
				buyOrder.setPrv_id(prv_id);
				buyOrder.setDt(dt);
				buyOrderDao.update(buyOrder);
				response.sendRedirect("buyOrderModifySaveOK.jsp");
			}
			else {
				response.sendRedirect("buyOrderModifyServlet?id=" + id);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException {
		doGet(request, response);
	}

}
