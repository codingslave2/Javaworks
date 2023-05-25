package db;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

// DAO - 데이더베이스 연결 및 연동(입력, 검색, 수정, 삭제) 기능 클래스
public class PersonDAO {
	
	// 필드
	private Connection conn = null; // 연결 처리 클래스
	private PreparedStatement pstmt = null; // sql 처리 클래스
	
	
	// 연결 - 클래스 작성 호출
	
	
	
	// 자료 삽입
	public void insertPerson(Person person) {
		conn = JDBCUtil.getConnection();
		// String sql = "";
	}
	
	
	
	// 자료 검색(자료 목록 조회)
	public ArrayList<Person> getPersonList(){
		ArrayList<Person> personList = new ArrayList<>();
		try {
			conn = JDBCUtil.getConnection();
			String sql = "SELECT * FROM person";
			pstmt = conn.prepareStatement(sql);
			ResultSet rs = pstmt.executeQuery(); // 검색 -executeQuery()를 사용
			
			while(rs.next()) {
				Person person = new Person(); // 기본 생성자로 객체 생성
				// person 테이블에서 person 객체의 데이터에 저장함
				person.setUserId(rs.getString("userid")); // 유저 id 가져오기
				person.setUserPw(rs.getString("userpw")); // 유저 비번 가져오기
				person.setName(rs.getString("name")); // 유저 이름
				person.setAge(rs.getInt("age")); // 유저 나이
				
				personList.add(person); //사람 객체를 리스트에 저장
				
				
			}
		}catch(SQLException e) {
			e.printStackTrace();
		}
		
		return personList; // 호출하는 곳으로 반환함(돌려줌)
	}
	
	
	
}
