package dao;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import dto.StudentDTO;

public class StudentDAO {

	private Connection conn=null;
	private String url="jdbc:oracle:thin:@localhost:1521:orcl";


	public StudentDAO() {
		String driver ="oracle.jdbc.driver.OracleDriver";
		try {
			Class.forName(driver);
			System.out.println("�ε� ����");
		} catch (Exception e) {
			System.out.println("�ε� ����");
		}
	}

	public Connection getConnection() {
		try {
			conn = DriverManager.getConnection(url,"system","1234");
			System.out.println("���Ἲ��");
			return conn;
		} catch (Exception e) {
			System.out.println("�������");
		}
		return null;
	}

	public void insert(StudentDTO s) {
		PreparedStatement psmt = null;
		if(getConnection()!=null) {
			try {
				String sql = "INSERT INTO STUDENTS (name, grade, classnum, address, point, penalty) VALUES (?, ?, ?, ?, ?, ?)";
				psmt = conn.prepareStatement(sql);
				psmt.setString(1, s.getName());
				psmt.setString(2, s.getGrade());
				psmt.setString(3, s.getClassnum());
				psmt.setString(4, s.getAddress());
				psmt.setInt(5, s.getPoint());
				psmt.setInt(6, s.getPenalty());
				psmt.executeUpdate();
				
				
			} catch (Exception e) {
				System.out.println("�Է��۾����� ���� �߻�");
			}
		}
	}


}

	
	
		
	





