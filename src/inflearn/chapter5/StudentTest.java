package inflearn.chapter5;

public class StudentTest {
    public static void main(String[] args) {
        Student student = new Student();
        student.studentName = "이순신";
        student.address = "서울시 영등포구";

        student.showStudentinfo();
    }
}
