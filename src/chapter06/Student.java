package chapter06;

import java.sql.SQLOutput;

public class Student {
    int studentID;
    String studentName;
    int grade;
    String address;

    public void showStudentInfo() {
        System.out.println(studentName + " " + address);
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String name) {
        studentName = name;
    }

    public static void main(String[] args) {
        Student studentLee = new Student();
        Student studentKim = new Student();

        studentLee.studentName = "이유찬";
        studentKim.studentName = "김섭규";

        System.out.println(studentLee.studentName);
        System.out.println(studentLee.getStudentName());

        System.out.println(studentKim.studentName);
        System.out.println(studentKim.getStudentName());

        System.out.println(studentLee);
        System.out.println(studentKim);
    }
}
