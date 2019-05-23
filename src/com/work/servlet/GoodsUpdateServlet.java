package com.work.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.work.dao.GoodsDao;
import com.work.entity.Goods;

@WebServlet("/goodsUpdateServlet")
public class GoodsUpdateServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public GoodsUpdateServlet() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		String id = request.getParameter("id");
		String no = request.getParameter("no");
		String name = request.getParameter("name");
		String price = request.getParameter("price");
		Goods goods = new Goods();
		GoodsDao goodsDao = new GoodsDao();
		try {
			if(!id.equals("") && !no.equals("") && !name.equals("") && !price.equals("")) {
				goods.setId(Integer.valueOf(id));
				goods.setNo(no);
				goods.setName(name);
				goods.setPrice(Double.valueOf(price));
				goodsDao.update(goods);
				response.sendRedirect("goodsModifySaveOK.jsp");
			}
			else {
				response.sendRedirect("goodsModifyServlet?id=" + id);
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
