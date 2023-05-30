package db;

import java.util.ArrayList;

public class PersonMain {

	public static void main(String[] args) {
		PersonDAO dao = new PersonDAO();
		
		
		// 자료 삽입
		Person person1 = new Person("test", "test1234", "tester", 30);
//		dao.insertPerson(person1); // 호출
		
		
		// 자료 1개 검색
//		Person person = dao.getPerson("cloud");
//		String userId = person.getUserId();
//		String userPw = person.getUserPw();
//		String name = person.getName();
//		int age = person.getAge();
		
		
		
//		System.out.printf("아이디: %s, 비밀번호: %s, 이름: %s, 나이: %d\n" , userId, userPw, name, age);
		
		// 자료 삭제
//		dao.deletePerson("test");
		
		// 자료 수정 - 아이디 "cloud"인 사람 검색
		Person cloud = dao.getPerson("cloud");
		
		cloud.setName("클라우드");
		cloud.setAge(50);
		
		// 자료 수정
		dao.updatePerson(cloud);
		
		
		System.out.println("===========================================");
		
		
		// Person 자료 검색(목록 조회)		
		
		ArrayList<Person> personList = dao.getPersonList();
		for(int i=0; i<personList.size(); i++) {
			Person person11 = personList.get(i);
			
			String userId1 = person11.getUserId();
			String userPw1 = person11.getUserPw();
			String name1 = person11.getName();
			int age1 = person11.getAge();
			
			System.out.printf("아이디: %s, 비밀번호: %s, 이름: %s, 나이: %d\n" , userId1, userPw1, name1, age1);
		}

	}

}
