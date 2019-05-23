package com.work.servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.work.dao.GoodsDao;
import com.work.entity.Goods;

@WebServlet("/goodsSearchServlet")
public class GoodsSearchServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
  
    public GoodsSearchServlet() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		String name = request.getParameter("name");
		GoodsDao goodsDao = new GoodsDao();
			try {
				List<Goods> goodsList =goodsDao.search(name);
				request.setAttribute("name", name);
				request.setAttribute("goodsList", goodsList);
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			request.getRequestDispatcher("goodsSearchResult.jsp").forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException {
		doGet(request, response);
	}

}
