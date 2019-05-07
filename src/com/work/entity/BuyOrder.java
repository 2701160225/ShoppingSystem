package com.work.entity;

public class BuyOrder {
	private int id;
	private String no;
	private String prv_id;
	private String dt;
	
	public BuyOrder() {
		super();
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNo() {
		return no;
	}

	public void setNo(String no) {
		this.no = no;
	}

	public String getPrv_id() {
		return prv_id;
	}

	public void setPrv_id(String prv_id) {
		this.prv_id = prv_id;
	}

	public String getDt() {
		return dt;
	}

	public void setDt(String dt) {
		this.dt = dt;
	}

	@Override
	public String toString() {
		return "BuyOrder [id=" + id + ", no=" + no + ", prv_id=" + prv_id + ", dt=" + dt + "]";
	}
	
	
	
}
