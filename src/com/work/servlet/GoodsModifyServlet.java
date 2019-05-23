package com.work.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.work.dao.GoodsDao;
import com.work.entity.Goods;

@WebServlet("/goodsModifyServlet")
public class GoodsModifyServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public GoodsModifyServlet() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		String id = request.getParameter("id");
		GoodsDao goodsDao = new GoodsDao();
		Goods goods = new Goods();
		try {
			goods =goodsDao.getOne(Integer.valueOf(id));
			request.setAttribute("goods", goods);
		} catch (Exception e) {
			e.printStackTrace();
		}
		request.getRequestDispatcher("goodsModify.jsp").forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException {
		doGet(request, response);
	}

}
