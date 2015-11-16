package com.chapter7.bank.dao;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Set;

import com.chapter7.bank.entity.BankAccount;
import com.chapter7.bank.entity.BankStatement;
import com.chapter7.dao.ConnectionFactory;

public class BankAccountDaoImpl implements BankAccountDao {
	//存款
	public BankAccount deposit(final BankAccount ba, final float amt) {
		System.out.println("存款数据库操作...");
		return null;
	}
	//查找账户信息
	public BankAccount findAccountByAccno(long accno) {
		Connection conn = ConnectionFactory.getConnection();
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		BankAccount bank = null;
		try {
			conn.setAutoCommit(false);
			//查找账户信息
			pstmt = conn.prepareStatement("select * from bankaccount where accno=?");
			pstmt.setLong(1,accno);
			rs = pstmt.executeQuery();
			if(!rs.next()){   //游标移动后，如果有数据就返回true，没有数据就返回false
				return null;
			}
			
			rs.first();
			bank = new BankAccount();
			bank.setAccno(rs.getLong(1));
			bank.setName(rs.getString(2));
			bank.setBalance(rs.getFloat(3));
			
			//记录查找
			pstmt = conn.prepareStatement("insert into bankstatement(action,txdate,amt,fromaccno) values(?,?,?,?)");
			pstmt.setString(1,"查找账户信息");
			java.util.Date date = new java.util.Date();
			pstmt.setDate(2,new Date(date.getTime()));
			pstmt.setFloat(3,0);
			pstmt.setLong(4,accno);		
			pstmt.executeUpdate();
			
			conn.commit();
		} catch (SQLException se) {
			try {
				conn.rollback();
			} catch (SQLException e) {
				throw new RuntimeException(e);
			}
			throw new RuntimeException(se);
		} finally {
			try {
				if(rs!=null){
					rs.close();
				}
				if(pstmt!=null){
					pstmt.close();
				}
			} catch (SQLException e) {
				throw new RuntimeException(e);
			}
		}
		return bank;
	}
	//查找交易信息
	public Set<BankStatement> findStatementByAccno(long accno) {
		System.out.println("查找交易信息数据库操作...");
		return null;
	}
	//开户
	public BankAccount newBankAccount(BankAccount ba) {
		Connection conn = ConnectionFactory.getConnection();
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		try {
			conn.setAutoCommit(false);
						
			//开户
			pstmt = conn.prepareStatement("insert into bankaccount(name,balance) values(?,?)");
			pstmt.setString(1,ba.getName());
			pstmt.setFloat(2,ba.getBalance());
			pstmt.executeUpdate();
			
			//获得能使用的accno列值
			pstmt = conn.prepareStatement("select last_insert_id()");
			rs = pstmt.executeQuery();
			rs.next();
			ba.setAccno(rs.getLong(1));
			
			//记录开户
			pstmt = conn.prepareStatement("insert into bankstatement(action,txdate,amt,fromaccno) values(?,?,?,?)");
			pstmt.setString(1,"开户");
			java.util.Date date = new java.util.Date();
			pstmt.setDate(2,new Date(date.getTime()));
			pstmt.setFloat(3,ba.getBalance());
			pstmt.setLong(4,ba.getAccno());
			pstmt.executeUpdate();
			
			conn.commit();
		} catch (SQLException se) {
			try {
				conn.rollback();
			} catch (SQLException e) {
				throw new RuntimeException(e);
			}
			throw new RuntimeException(se);
		} finally {
			try {
				if(pstmt!=null){
					pstmt.close();
				}
			} catch (SQLException e) {
				throw new RuntimeException(e);
			}
		}
		return ba;
	}
	//转帐
	public BankAccount transfer(BankAccount from, BankAccount to, float amt) {
		Connection conn = ConnectionFactory.getConnection();
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		BankAccount bankaccount = null;
		try {
			conn.setAutoCommit(false);
			//源账户减少金额
			pstmt = conn.prepareStatement("update bankaccount set balance=balance-? where accno=?");
			pstmt.setFloat(1,amt);
			pstmt.setLong(2,from.getAccno());
			pstmt.executeUpdate();
			
			//目标账户增加金额
			pstmt = conn.prepareStatement("update bankaccount set balance=balance+? where accno=?");
			pstmt.setFloat(1,amt);
			pstmt.setLong(2,to.getAccno());
			pstmt.executeUpdate();
			
			//记录转账
			pstmt = conn.prepareStatement("insert into bankstatement(action,txdate,amt,fromaccno,toaccno) values(?,?,?,?,?)");
			pstmt.setString(1,"转账");
			java.util.Date date = new java.util.Date();
			pstmt.setDate(2,new Date(date.getTime()));
			pstmt.setFloat(3,amt);
			pstmt.setLong(4,from.getAccno());
			pstmt.setLong(5,to.getAccno());			
			pstmt.executeUpdate();
			
			//返回账户信息
			pstmt = conn.prepareStatement("select * from bankaccount where accno=?");
			pstmt.setLong(1,from.getAccno());
			rs = pstmt.executeQuery();
			bankaccount = new BankAccount();
			rs.next();
			bankaccount.setAccno(rs.getLong(1));
			bankaccount.setName(rs.getString(2));
			bankaccount.setBalance(rs.getFloat(3));
			
			conn.commit();
		} catch (SQLException se) {
			try {
				conn.rollback();
			} catch (SQLException e) {
				throw new RuntimeException(e);
			}
			throw new RuntimeException(se);
		} finally {
			try {
				if(rs!=null){
					rs.close();
				}
				if(pstmt!=null){
					pstmt.close();
				}
			} catch (SQLException e) {
				throw new RuntimeException(e);
			}
		}
		return bankaccount;
	}
	//取款
	public BankAccount withdraw(BankAccount ba, float amt) {
		System.out.println("取款数据库操作...");
		return null;
	}
}