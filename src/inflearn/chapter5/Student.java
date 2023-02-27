package inflearn.chapter5;

public class Student {
    int studentID;
    String studentName;
    int grade;
    String address;

    public Student() {} // 디폹트 생성자

    public Student(int id, String name) {
        studentID = id;
        studentName = name;
    }

    public void showStudentinfo() {
        System.out.println(studentName + ", " + address);
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String name) {
        studentName = name;
    }
} 

