package com.bank.model;
import java.sql.Date;
public class BankStatement {
	// ����id
	private int id;
	// ��������������
	private String action;
	// ������ʱ��
	private Date txdate;
	// �������
	private float amt;
	// �����˻�
	private int toaccno;
	// ת�˵��˻�
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
