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
 * ʵ��ҵ���߼��ӿڣ��������ݿ�
 * 
 * @author ��˧
 *
 */
public class BankAccountDaoImpl implements BankAccountDao{
	ConnectionFactory factory = null;
	Connection conn = null;
	PreparedStatement pstm = null;
	ResultSet rs = null;
	/**
	 * ʵ�ֿ����Ĳ�������
	 */
	@Override
	public BankAccount open(String name, float balance) {
		//1.�����˻���Ϣ
		//2.���ز����ɹ�����˻�id
		//3.���������������¼
		BankAccount account= null;
		
		//�����˻���Ϣ
		//�õ�����
		factory = new ConnectionFactory();
		conn = factory.getConnection();
		//���������Զ��ύ
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
			//**************************����˻���Ϣ***************************
			pstm = conn.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
			//pstm = conn.prepareStatement(sql);
			//������ֵ
			pstm.setString(1,name);
			pstm.setFloat(2, balance);
			int i = pstm.executeUpdate();
			//***************************����˻���Ϣ******************************
			//***************************�õ������ɹ����id************************
			//getGeneratedKeys()�õ�id
			//����һ
			//rs = pstm.getGeneratedKeys();
			//������
			pstm = conn.prepareStatement(sql1);
			rs = pstm.executeQuery();
			int fromaccno = 0;
			if(rs.next()){
				fromaccno=rs.getInt(1);
			}
			//**************************�õ������ɹ����id**************************
			
			//**************************���������������¼*************************
			pstm=conn.prepareStatement(sql2);
			pstm.setString(1,"����");
			java.util.Date date = new java.util.Date();
			pstm.setDate(2, new Date(date.getTime()));
			pstm.setFloat(3, balance);
			pstm.setInt(4, fromaccno);
			//�����¼��Ϣ
			pstm.executeUpdate();
			conn.commit();
			
			//�������Ƿ����˻���Ϣֵ
			account = new BankAccount();
			account.setAccno(fromaccno);
			account.setName(name);
			account.setBalance(balance);
			
			//**************************���������������¼**********************************
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
			//�ر����ӣ������
		}
		return account;
	}
	public static void main(String[] args) {
		BankAccountDaoImpl impl = new BankAccountDaoImpl();
		impl.open("�쿡�", 10);
	}
	
}
