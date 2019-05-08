package com.work.dao;

import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.work.entity.BuyOrder;
import com.work.util.DBUtil;

public class BuyOrderDao {
	public static int insert(BuyOrder buyOrder) throws Exception{
		String sql ="insert into buy_order(no,prv_id,dt)values(?,?,?)";
		List<Object> list = new ArrayList<Object>();
		list.add(buyOrder.getNo());
		list.add(buyOrder.getPrv_id());
		list.add(buyOrder.getDt());
		return DBUtil.executeUpdate(sql, list);
	}
	
	public List<BuyOrder> search(String no) throws Exception{
		List<BuyOrder> buyOrderList = new ArrayList<>();
		String sql = "select * from buy_order where no like ? ";
		List<Object> list = new ArrayList<>();
		list.add("%%"+no+"%%");
		ResultSet rs = DBUtil.executeQuery(sql, list);
		while(rs != null && rs.next()) {
			BuyOrder buyOrder = new BuyOrder();
			buyOrder.setId(rs.getInt("id"));
			buyOrder.setNo(rs.getString("no"));
			buyOrder.setPrv_id(rs.getString("prv_id"));
			buyOrder.setDt(rs.getString("dt"));
			buyOrderList.add(buyOrder);
		}
		DBUtil.close(rs, null, null);
		return buyOrderList;
	}
	
	public int update(BuyOrder buyOrder) throws Exception{
		String sql = "update buy_order set no = ?,prv_id = ?,dt = ? where id = ?";
		List<Object> list = new ArrayList<>();
		list.add(buyOrder.getNo());
		list.add(buyOrder.getPrv_id());
		list.add(buyOrder.getDt());
		list.add(buyOrder.getId());
		return DBUtil.executeUpdate(sql,list);
	}
	
	public BuyOrder getOne(int id) throws Exception{
		String sql = "select * from buy_order where id = ?";
		List<Object> list = new ArrayList<>();
		list.add(id);
		ResultSet rs = DBUtil.executeQuery(sql,list);
		BuyOrder buyOrder = new BuyOrder();
		while(rs != null && rs.next()) {	
			buyOrder.setId(rs.getInt("id"));
			buyOrder.setPrv_id(rs.getString("prv_id"));
			buyOrder.setNo(rs.getString("no"));
			buyOrder.setDt(rs.getString("dt"));
		}
		return buyOrder;
	}
	
	public int delete(int id) throws Exception{
		String sql = "delete from buy_order where id = ?";
		List<Object> list = new ArrayList<>();
		list.add(id);
		return DBUtil.executeUpdate(sql, list);
	}
	
	
}
