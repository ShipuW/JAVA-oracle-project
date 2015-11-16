package com.chapter7.bank.biz;

import com.chapter7.bank.dao.BankAccountDao;
import com.chapter7.bank.entity.BankAccount;

/*
 * 业务实现
 */
public class BankBizImpl implements BankBiz{
	private BankAccountDao dao;
	
	public BankBizImpl(){}
	public BankBizImpl(BankAccountDao dao){
		this.dao = dao;
	}
	public void setDao(BankAccountDao dao){
		this.dao = dao;
	}
	
	//存款
	public BankAccount deposit(long accno, float amt) {
		System.out.println("存款...");
		return null;
	}
	//开户
	public BankAccount open(String name, float balance) {
		BankAccount ba = new BankAccount();
		ba.setName(name);
		ba.setBalance(balance);
		return dao.newBankAccount(ba);
	}
	//转账
	public BankAccount transfer(long from, long to, float amt) {
		//判断转出账户是否存在
		BankAccount bankfrom = dao.findAccountByAccno(from);
		if(bankfrom==null){
			System.out.println("转出账户不存在，请重新输入!");
			return null;
		}
		//判断余额是否足够
		if(bankfrom.getBalance()<amt){
			System.out.println("转出账户余额不足，请重新输入!");
			return null;
		}
		//判断转入账户是否存在
		BankAccount bankto = dao.findAccountByAccno(to);
		if(bankto==null){
			System.out.println("转入户不存在，请重新输入!");
			return null;
		}
		
		return dao.transfer(bankfrom, bankto, amt);
	}
	//取款
	public BankAccount withdraw(long accno, float amt) {
		System.out.println("取款...");
		return null;
	}
}