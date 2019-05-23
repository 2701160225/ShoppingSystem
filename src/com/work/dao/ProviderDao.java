package com.work.dao;

import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.work.entity.Provider;
import com.work.util.DBUtil;

public class ProviderDao {
	public int insert(Provider provider) throws Exception{
		String sql ="insert into provider(no,name,tel,addr)values(?,?,?,?)";
		List<Object> list = new ArrayList<Object>();
		list.add(provider.getNo());
		list.add(provider.getName());
		list.add(provider.getTel());
		list.add(provider.getAddr());
		return DBUtil.executeUpdate(sql, list);
	}
	
	public List<Provider> search(String name) throws Exception{
		List<Provider> providerList = new ArrayList<>();
		String sql = "select * from provider where name like ? ";
		List<Object> list = new ArrayList<>();
		list.add("%%"+name+"%%");
		ResultSet rs = DBUtil.executeQuery(sql, list);
		while(rs != null && rs.next()) {
			Provider provider = new Provider();
			provider.setId(rs.getInt("id"));
			provider.setName(rs.getString("name"));
			provider.setNo(rs.getString("no"));
			provider.setTel(rs.getString("tel"));
			provider.setAddr(rs.getString("addr"));
			providerList.add(provider);
		}
		DBUtil.close(rs, null, null);
		return providerList;
	}
	
	public int update(Provider provider) throws Exception{
		String sql = "update provider set no = ?,name = ?,tel = ?,addr = ? where id = ?";
		List<Object> list = new ArrayList<>();
		list.add(provider.getNo());
		list.add(provider.getName());
		list.add(provider.getTel());
		list.add(provider.getAddr());
		list.add(provider.getId());
		return DBUtil.executeUpdate(sql,list);
	}
	
	public Provider getOne(int id) throws Exception{
		String sql = "select * from provider where id = ?";
		List<Object> list = new ArrayList<>();
		list.add(id);
		ResultSet rs = DBUtil.executeQuery(sql,list);
		Provider provider = new Provider();
		while(rs != null && rs.next()) {	
			provider.setId(rs.getInt("id"));
			provider.setName(rs.getString("name"));
			provider.setNo(rs.getString("no"));
			provider.setTel(rs.getString("tel"));
			provider.setAddr(rs.getString("addr"));
		}
		return provider;
	}
	
	public int delete(int id) throws Exception{
		String sql = "delete from provider where id = ?";
		List<Object> list = new ArrayList<>();
		list.add(id);
		return DBUtil.executeUpdate(sql, list);
	}
}
