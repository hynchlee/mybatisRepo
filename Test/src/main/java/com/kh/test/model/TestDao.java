package com.kh.test.model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class TestDao {

	public List<Test> selectList() {

		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;

		List<Test> list = new ArrayList<>();

		try {

			String sql = "SELECT * FROM TEST";

			Class.forName("oracle.jdbc.driver.OracleDriver");
			conn = DriverManager.getConnection("jdbc:oracle:thin:@192.168.10.3:1521:xe");
			pstmt = conn.prepareStatement(sql);
			rs = pstmt.executeQuery();

			while (rs.next()) {
				String writer = rs.getString("WRITER");
				String title = rs.getString("TITLE");
				String content = rs.getString("CONTENT");
				String date = rs.getString("REGDATE");

				Test test = new Test();
				test.setWriter(writer);
				test.setTitle(title);
				test.setContent(content);
				test.setRegDate(date);

				list.add(test);
			}

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if (rs != null) {
				try {
					rs.close();
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
			if (pstmt != null) {
				try {
					pstmt.close();
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
			if (conn != null) {
				try {
					conn.close();
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		}

		return list;
	}

}
