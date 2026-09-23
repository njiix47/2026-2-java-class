package chapter08;

public class StudentTest {
    public static void main(String[] args) {
        Student studentHa = new Student(1217, "하헌휘");
        Student studentKang = new Student(1205, "강민준");

        studentHa.setDataBaseSubject("데이터베이스 프로그래밍", 100);
        studentHa.setJavaSubject("자바 프로그래밍 기초", 0);

        studentKang.setDataBaseSubject("데이터베이스 프로그래밍", 50);
        studentKang.setJavaSubject("자바 프로그래밍 기초", 90);

        studentHa.showStudentInfo();
        studentKang.showStudentInfo();
    }
}


