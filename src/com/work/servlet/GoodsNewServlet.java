	package com.work.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.work.dao.GoodsDao;
import com.work.entity.Goods;

@WebServlet("/goodsNewServlet")
public class GoodsNewServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public GoodsNewServlet() {
        super();
        
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		String no = request.getParameter("no");
		String name = request.getParameter("name");
		String price = request.getParameter("price");
		
		Goods goods = new Goods();
		goods.setNo(no);
		goods.setName(name);
		goods.setPrice(Double.valueOf(price));
		GoodsDao goodsDao = new GoodsDao();
		
		try {
			goodsDao.insert(goods);
			request.setAttribute("goods", goods);
			request.getRequestDispatcher("goodsNewSaveOK.jsp").forward(request, response);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException {
		doGet(request, response);
	}

}
