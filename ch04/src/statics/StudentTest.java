package statics;

public class StudentTest {

	public static void main(String[] args) {
		
		// 학생 객체 생성(lee - 힙 메모리 영역 위치)
		Student lee = new Student();
		// lee.name = "이대현";
		//lee.studentId = 1000;
		//lee.setName("이대현");		
		
		//System.out.println("이름 :" + lee.getname());
		System.out.println("학번 :" + lee.getStudentId());
		
		
		
	}

}
