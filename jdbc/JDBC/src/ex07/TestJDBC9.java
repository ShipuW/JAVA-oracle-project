package ex07;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/*
 * 使用CallableStatement实现批量更新
 */
public class TestJDBC9 {
	public static void main(String[] args) {
		Connection conn = null;
		PreparedStatement pstmt = null;
		CallableStatement cstmt = null;
		ResultSet rs = null;
		try {
			Driver drv = new com.mysql.jdbc.Driver();
			DriverManager.registerDriver(drv);
		    conn = DriverManager.getConnection("jdbc:mysql://localhost:3308/tests",
		    		"root","123456");
		    conn.setAutoCommit(false);              //设置事务非自动提�?
		    
		    pstmt = conn.prepareStatement("select * from student");
		    rs = pstmt.executeQuery();
		    conn.commit();                          //主动提交事务  
		    
		    System.out.println("callablestatement批量添加前：");
		    System.out.println("id\tname\tage");
		    while(rs.next()){
		    	System.out.print(rs.getInt(1)+"\t");
		    	System.out.print(rs.getString(2)+"\t");
		    	System.out.print(rs.getInt(3)+"\n");
		    }
		    
		    
		    //批量更新
		    cstmt = conn.prepareCall("{call proc_insert_test(?,?)}");
		    cstmt.setString(1,"xiaoming1");
		    cstmt.setInt(2,33);
		    cstmt.addBatch();
		    
		    cstmt.setString(1,"xiaoming2");
		    cstmt.setInt(2,13);
		    cstmt.addBatch();
		    
		    int count[] = cstmt.executeBatch();
		    conn.commit();                          //主动提交事务
		    
		    System.out.println("callablestatement批量更新返回�?");
		    for(int i=0;i<count.length;i++){
		    	System.out.print(count[i]+",\t");
		    }
		    System.out.println();
		    
		    
		    pstmt = conn.prepareStatement("select * from student");
		    rs = pstmt.executeQuery();
		    conn.commit();                          //主动提交事务
		    
		    System.out.println("callablestatement批量添加�?");
		    System.out.println("id\tname\tage");
		    while(rs.next()){
		    	System.out.print(rs.getInt(1)+"\t");
		    	System.out.print(rs.getString(2)+"\t");
		    	System.out.print(rs.getInt(3)+"\n");
		    }
		    
		} catch(Exception ex) {
			ex.printStackTrace();
		} finally {
			try {
				if(rs!=null){
					rs.close();
				}
				if(pstmt!=null){
					pstmt.close();
				}
				if(cstmt!=null){
					cstmt.close();
				}
				if(conn!=null){
					conn.close();
				}
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}
}