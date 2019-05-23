package com.work.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.work.dao.ProviderDao;
import com.work.entity.Provider;


@WebServlet("/providerUpdateServlet")
public class ProviderUpdateServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public ProviderUpdateServlet() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		String id = request.getParameter("id");
		String no = request.getParameter("no");
		String name = request.getParameter("name");
		String tel = request.getParameter("tel");
		String addr = request.getParameter("addr");
		Provider provider = new Provider();
		ProviderDao providerDao = new ProviderDao();
		
		try {
			if(!id.equals("") && !no.equals("") && !name.equals("") && !tel.equals("") && !addr.equals("")) {
				provider.setId(Integer.valueOf(id));
				provider.setNo(no);
				provider.setName(name);
				provider.setTel(tel);
				provider.setAddr(addr);
				providerDao.update(provider);
				response.sendRedirect("providerModifySaveOK.jsp");
			}
			else {
				response.sendRedirect("providerModifyServlet?id=" + id);
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
