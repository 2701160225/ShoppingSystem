package com.work.dao;

import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.work.entity.User;
import com.work.util.DBUtil;

public class UserDao {

	// ����--->����
	public int findUser(String name, String pwd) {

		try {
			
			String sql = "select * from userlist where name=? and pwd=?";
			List<Object> list = new ArrayList<Object>();
			list.add(name);
			list.add(pwd);
		
			ResultSet rst = DBUtil.executeQuery(sql, list);
			// 5.��������
			String uname = null;
			String passwd = null;
			while (rst.next()) {
				uname = rst.getString("name");
				passwd = rst.getString("pwd");
			}
			if (uname != null && passwd != null) {
				return 1;// ��ʾ���ҵ�������˺�
			}
			// 6.�ͷ���Դ
			DBUtil.close(rst, null, null);
		} catch (Exception e) {
			e.printStackTrace();
		}

		return 0;// ��ʾû������˺�
	}
	public int addUser(User user) throws Exception {
		String sql = "insert into userlist(name,pwd) values(?,?)";
		List<Object> list = new ArrayList<Object>();
		list.add(user.getName());
		list.add(user.getPassword());
		return DBUtil.executeUpdate(sql, list);

	}
}
