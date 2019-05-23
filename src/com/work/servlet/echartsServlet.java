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

@WebServlet("/echarts")
public class echartsServlet extends HttpServlet{

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) 
			throws ServletException, IOException {
		doPost(req, resp);
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) 
			throws ServletException, IOException {
		GoodsDao goodsDao = new GoodsDao();
		StringBuilder goodsName = new StringBuilder();
		StringBuilder goodsPrice = new StringBuilder();
		goodsName.append("[");
		goodsPrice.append("[");
		try {
			List<Goods> goodsList = goodsDao.getList();
			for (int i = 0; i < goodsList.size() - 1; i++) {
				goodsName.append("'" + goodsList.get(i).getName() + "'" + ",");
				goodsPrice.append(goodsList.get(i).getPrice() + ",");
			}
			goodsName.append("'" + goodsList.get(goodsList.size() - 1).getName() + "'");
			goodsPrice.append(goodsList.get(goodsList.size() - 1).getPrice());
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		goodsName.append("]");
		goodsPrice.append("]");
		
		System.out.println(goodsName.toString());
		System.out.println(goodsPrice.toString());
		
		req.setAttribute("goodsName", goodsName.toString());
		req.setAttribute("goodsPrice", goodsPrice.toString());
		
		req.getRequestDispatcher("echarts.jsp").forward(req, resp);
		
	}
	
}
