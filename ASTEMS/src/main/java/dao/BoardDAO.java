package dao;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import common.JDBCConnection;
import vo.BoardVO;

public class BoardDAO {
		Connection conn = null;
		PreparedStatement stmt = null;
		ResultSet rs = null;
		
		
		public ArrayList<BoardVO> boardList() {
			
			ArrayList<BoardVO> list = new ArrayList<>();
			
			try {
				
				conn = JDBCConnection.getConnection();
				
				String sql = "select * from astems_board";
				
				stmt = conn.prepareStatement(sql);
				
				rs = stmt.executeQuery();
				
				list = new ArrayList<BoardVO>(); 
				
				while(rs.next()) {
					int seq = rs.getInt(1);
					String writer = rs.getString(2);
					String title = rs.getString(3);
					String content = rs.getString(4);
					Date day = rs.getDate(5);
					
					BoardVO bean = new BoardVO();
					
					bean.setSeq(seq);
					bean.setWriter(writer);
					bean.setTitle(title);
					bean.setContent(content);
					bean.setDay(day);
					
					list.add(bean);		

				}
				
				System.out.println("불러오기 완료");
				
			} catch (ClassNotFoundException e) {
				e.printStackTrace();
			} catch (SQLException e) {
				e.printStackTrace();
			} finally {
				JDBCConnection.close(rs, stmt, conn);
			}			
			
			return list;
		}
		
		
}
