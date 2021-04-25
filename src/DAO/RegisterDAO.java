package DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;

import com.google.common.util.concurrent.Service.State;

import Bean.User;
import datasource.ConnectDB;

public class RegisterDAO {
	
//	public List<User> findAll(){
//		String sql = "SELECT *FROM tbluser";
//		Connection connection = ConnectDB.getConnection();
//		try {
//			Statement st=connection.createStatement();
//			ResultSet resultSet = st.executeQuery(sql);
//			
//			while (resultSet.next()) {
//				User user = new User();
//				user.se
//				
//			}
//		} catch (SQLException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//	}
	
	public boolean checkAcount(User user) {
		return false;
	}
	
	public boolean saveOne(User user) {
		Connection cn = ConnectDB.getConnection();
		PreparedStatement pt = cn.createStatement();
	}
}
