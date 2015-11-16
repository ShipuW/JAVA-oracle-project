package com.bank.model;
import java.sql.Date;
public class BankStatement {
	// 操作id
	private int id;
	// 操作方法，类型
	private String action;
	// 操作的时间
	private Date txdate;
	// 操作金额
	private float amt;
	// 接收账户
	private int toaccno;
	// 转账的账户
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

	public Date getTxdate() {
		return txdate;
	}

	public void setTxdate(Date txdate) {
		this.txdate = txdate;
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
