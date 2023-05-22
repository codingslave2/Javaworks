package statics;

public class Student {
	
	
	static int serialNum = 1000; // 기준번호
	
	private int studentId; // 학번
	private String name; // 이름
	
	Student(){ // 기본 생성자
		serialNum++; // serialNum을 1 증가
		studentId = serialNum; // 증가된 번호를 학번에 대입
		
	}
		
		
	
	// get(), set()
	int getStudentId() {
		return studentId;
	}
	
	void setStudentId(int StudentId) {
		this.studentId = studentId;
	}
	
}
