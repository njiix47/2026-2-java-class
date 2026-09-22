package chapter08;

public class Student {
    int studentID;
    String studentName;

    Subject dataBase = new subject();
    Subject java = new subject();

    public Student(int studentID, String studentName) {
        this.studentName = studentName;
        this.studentID = studentID;
    }
}
