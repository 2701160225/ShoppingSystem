package com.work.dao;

import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.work.entity.Goods;
import com.work.util.DBUtil;


public class GoodsDao {
	public int insert(Goods goods) throws Exception{
		String sql ="insert into goods(no,name,price)values(?,?,?)";
		List<Object> list = new ArrayList<Object>();
		list.add(goods.getNo());
		list.add(goods.getName());
		list.add(goods.getPrice());
		return DBUtil.executeUpdate(sql, list);
	}
	
	public List<Goods> search(String name) throws Exception{
		List<Goods> goodsList = new ArrayList<>();
		String sql = "select * from goods where name like ? ";
		List<Object> list = new ArrayList<>();
		list.add("%%"+name+"%%");
		ResultSet rs = DBUtil.executeQuery(sql, list);
		while(rs != null && rs.next()) {
			Goods goods = new Goods();
			goods.setId(rs.getInt("id"));
			goods.setName(rs.getString("name"));
			goods.setNo(rs.getString("no"));
			goods.setPrice(rs.getDouble("price"));
			goodsList.add(goods);
		}
		DBUtil.close(rs, null, null);
		return goodsList;
	}
	
	public List<Goods> getList() throws Exception{
		List<Goods> goodsList = new ArrayList<>();
		String sql = "select * from goods";
		ResultSet rs = DBUtil.executeQuery(sql, null);
		while(rs != null && rs.next()) {
			Goods goods = new Goods();
			goods.setId(rs.getInt("id"));
			goods.setName(rs.getString("name"));
			goods.setNo(rs.getString("no"));
			goods.setPrice(rs.getDouble("price"));
			goodsList.add(goods);
		}
		DBUtil.close(rs, null, null);
		return goodsList;
	}
	
	public int update(Goods goods) throws Exception{
		String sql = "update goods set no = ?,name = ?,price = ? where id = ?";
		List<Object> list = new ArrayList<>();
		list.add(goods.getNo());
		list.add(goods.getName());
		list.add(goods.getPrice());
		list.add(goods.getId());
		return DBUtil.executeUpdate(sql,list);
	}
	
	public Goods getOne(int id) throws Exception{
		String sql = "select * from goods where id = ?";
		List<Object> list = new ArrayList<>();
		list.add(id);
		ResultSet rs = DBUtil.executeQuery(sql,list);
		Goods goods = new Goods();
		while(rs != null && rs.next()) {	
			goods.setId(rs.getInt("id"));
			goods.setName(rs.getString("name"));
			goods.setNo(rs.getString("no"));
			goods.setPrice(rs.getDouble("price"));
		}
		return goods;
	}
	
	public int delete(int id) throws Exception{
		String sql = "delete from goods where id = ?";
		List<Object> list = new ArrayList<>();
		list.add(id);
		return DBUtil.executeUpdate(sql, list);
	}
	
	
}
