package com.bank.model;

import java.sql.Date;

public class BankStatement {
	//������ID
	private int id;
	//�����ķ���������
	private String action;
	//������ʱ��
	private Date taxdate;
	//�������
	private float amt;
	//�����˻�
	private int toaccno;
	//ת�˵��˻�
	private int fromaccno;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getAction() {
		return action;
	}
	public void setAction(String action) {
		this.action = action;
	}
	public Date getTaxdate() {
		return taxdate;
	}
	public void setTaxdate(Date taxdate) {
		this.taxdate = taxdate;
	}
	public float getAmt() {
		return amt;
	}
	public void setAmt(float amt) {
		this.amt = amt;
	}
	public int getToaccno() {
		return toaccno;
	}
	public void setToaccno(int toaccno) {
		this.toaccno = toaccno;
	}
	public int getFromaccno() {
		return fromaccno;
	}
	public void setFromaccno(int fromaccno) {
		this.fromaccno = fromaccno;
	}
	
	
	
	

}
