package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import common.JDBCConnection;
import vo.AstemsUserVO;

public class UserDAO {
	
		Connection conn = null;
		PreparedStatement stmt = null;
		ResultSet rs = null;
		
		
		public void joinuser(AstemsUserVO bean) {
			
			try {
				
				conn = JDBCConnection.getConnection();
				
				String sql = "insert into astems_user(id, pw, name) values(?,?,?)";
				
				stmt = conn.prepareStatement(sql);
				
				stmt.setString(1, bean.getId());
				stmt.setString(2, bean.getPw());
				stmt.setString(3, bean.getName());
				
				stmt.executeQuery();
				
								
			} 	catch (ClassNotFoundException e) {
					e.printStackTrace();
				} catch (SQLException e) {
					e.printStackTrace();
				} finally {
					JDBCConnection.close(stmt, conn);
				}
			}


		public AstemsUserVO userlogin(String id, String pw) {
			
			AstemsUserVO user = null;
			
						
			try {
				
				conn = JDBCConnection.getConnection();
				
				String sql = "select * from astems_user where id=? and pw =?";
				
				stmt = conn.prepareStatement(sql);
				stmt.setString(1, id);
				stmt.setString(2, pw);
				
				rs = stmt.executeQuery();
				
				if(rs.next()) {
					user = new AstemsUserVO();
					user.setId(rs.getString("id"));
				}
				
				

			} catch (ClassNotFoundException e) {
				e.printStackTrace();
			} catch (SQLException e) {
				e.printStackTrace();
			} finally {
				JDBCConnection.close(rs, stmt, conn);
			}
			
			return user;
		}	
}
			
			

		

