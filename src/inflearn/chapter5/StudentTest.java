package inflearn.chapter5;

public class StudentTest {
    public static void main(String[] args) {
        
        // Student studentLee = new Student(100, "이순신"); 
        Student studentLee = new Student(); 
        studentLee.studentName = "이순신";
        studentLee.studentID = 100;
        studentLee.address = "서울시 영등포구";
        
        Student studentKim = new Student(101, "김유신"); 
        // studentKim.studentName = "김유신";
        // studentKim.studentID = 101;
        // studentKim.address = "서울시 관악구";

        studentLee.showStudentinfo();
        studentKim.showStudentinfo();
    }
}