package DAO;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.Properties;

import com.mysql.cj.jdbc.Driver;

public class DAOimpl {
	
	private static Connection con;
	
	
	//��ȡ���ݿ�����
	public static void getConnectSQL() {
		try{
			Driver driver = new Driver();
			String url = "jdbc:mysql://localhost:3306/information?serverTimezone = GMT%2B8";
			Properties info = new Properties();
			info.put("user", "root");
			info.put("password", "hq441521hq");
			con = driver.connect(null, info);
			
		}catch(SQLException e){
			e.printStackTrace();
		}
	}
	

	
	//�ر����ݿ�����
	public static void close() {
		try {
			con.close();
		}catch(SQLException e) {
			e.printStackTrace();
		}finally{
			if(con != null) {
				con = null;
			}
		}
	}
	
}
