package com.work.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.work.dao.ProviderDao;
import com.work.entity.Provider;

@WebServlet("/providerNewServlet")
public class ProviderNewServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public ProviderNewServlet() {
        super();
    }
	protected void doGet(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		String no = request.getParameter("no");
		String name = request.getParameter("name");
		String tel = request.getParameter("tel");
		String addr = request.getParameter("addr");
		
		Provider provider = new Provider();
		provider.setNo(no);
		provider.setName(name);
		provider.setTel(tel);
		provider.setAddr(addr);
		
		ProviderDao providerDao = new ProviderDao();
		try {
			providerDao.insert(provider);
			request.setAttribute("provider", provider);
			request.getRequestDispatcher("providerNewSaveOK.jsp").forward(request, response);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException {
		doGet(request, response);
	}

}
