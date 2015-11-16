package com.oracle.mountain;

public class BookBean implements java.io.Serializable{

	public BookBean() {
	}
	 private String name;
	 private float price;
	 private boolean recommend;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public float getPrice() {
		return price;
	}
	public void setPrice(float price) {
		this.price = price;
	}
	public boolean isRecommend() {
		return recommend;
	}
	public void setRecommend(boolean recommend) {
		this.recommend = recommend;
	}
	 
}
