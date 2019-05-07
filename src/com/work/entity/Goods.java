package com.work.entity;

public class Goods {
	private int id;
	private String no;
	private String name;
	private double price;
	
	public Goods() {
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

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "Goods [id=" + id + ", no=" + no + ", name=" + name + ", price=" + price + "]";
	}
	
	
	
}
	
