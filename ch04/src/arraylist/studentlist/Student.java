package arraylist.studentlist;

import java.util.ArrayList;
import arraylist.scorelist.Subject;

public class Student {

    //field 필드(멤버 변수)
    int studentId; //학번
    String studentName; // 이름
    ArrayList<Subject> subjectList;

    public Student(int studentId, String studentName) {
        this.studentId = studentId;
        this.studentName = studentName;
        subjectList = new ArrayList<>();
    }

    // 과목 추가
    public void addSubject(String name, int score) {
        Subject subject = new Subject(); // 과목 객체 생성
        subject.setSubjectName(name); // 과목 이름 입력
        subject.setScorePoint(score); // 점수 입력

        subjectList.add(subject);
    }

    // 작성 정보 출력
    public void showInfo() {
        int total = 0; // 총점
        double avg;

        for (int i = 0; i < subjectList.size(); i++) {
            Subject subject = subjectList.get(i);
            // 총점 계산
            total += subject.getScorePoint();

            System.out.printf("학생 %s의 %s 과목 성적은 %d점입니다.\n",
                    studentName, subject.getSubjectName(), subject.getScorePoint());
        }

        avg = (double) total / subjectList.size();
        System.out.printf("학생 %s의 총점은 %d점이고 평균: %.1f점입니다.\n",
                studentName, total, avg);
    }
}
