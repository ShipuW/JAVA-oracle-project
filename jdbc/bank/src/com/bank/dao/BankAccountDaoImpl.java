package com.bank.dao;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.bank.model.BankAccount;
import com.bank.util.ConnectionFactory;



/**
 * 实现业务逻辑接口，操作数据库
 * 
 * @author 朱帅
 *
 */
public class BankAccountDaoImpl implements BankAccountDao{
	ConnectionFactory factory = null;
	Connection conn = null;
	PreparedStatement pstm = null;
	ResultSet rs = null;
	/**
	 * 实现开户的操作方法
	 */
	@Override
	public BankAccount open(String name, float balance) {
		//1.新增账户信息
		//2.返回操作成功后的账户id
		//3.向操作表插入操作记录
		BankAccount account= null;
		
		//新增账户信息
		//得到连接
		factory = new ConnectionFactory();
		conn = factory.getConnection();
		//设置事务不自动提交
		try {
			conn.setAutoCommit(false);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		String sql ="insert into bankaccount values(null,?,?)";
		String sql1 = "select last_insert_id();";
		String sql2 = "insert into bankstatement(action,txdate,amt,fromaccno) " +
				"values(?,?,?,?);"	;	
		try {
			//**************************添加账户信息***************************
			pstm = conn.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
			//pstm = conn.prepareStatement(sql);
			//给？赋值
			pstm.setString(1,name);
			pstm.setFloat(2, balance);
			int i = pstm.executeUpdate();
			//***************************添加账户信息******************************
			//***************************得到开启成功后的id************************
			//getGeneratedKeys()得到id
			//方法一
			//rs = pstm.getGeneratedKeys();
			//方法二
			pstm = conn.prepareStatement(sql1);
			rs = pstm.executeQuery();
			int fromaccno = 0;
			if(rs.next()){
				fromaccno=rs.getInt(1);
			}
			//**************************得到开启成功后的id**************************
			
			//**************************向操作表插入操作记录*************************
			pstm=conn.prepareStatement(sql2);
			pstm.setString(1,"开户");
			java.util.Date date = new java.util.Date();
			pstm.setDate(2, new Date(date.getTime()));
			pstm.setFloat(3, balance);
			pstm.setInt(4, fromaccno);
			//插入记录消息
			pstm.executeUpdate();
			conn.commit();
			
			//设置我们返回账户信息值
			account = new BankAccount();
			account.setAccno(fromaccno);
			account.setName(name);
			account.setBalance(balance);
			
			//**************************向操作表插入操作记录**********************************
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally{
			try {
				conn.rollback();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			//关闭连接，结果集
		}
		return account;
	}
	public static void main(String[] args) {
		BankAccountDaoImpl impl = new BankAccountDaoImpl();
		impl.open("朱俊璋", 10);
	}
	
}
