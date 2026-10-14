package chapter13;

public class Student {
    public static int serialNum = 20700;
    private String studentName;
    private int studentID;
    private int grade;
    private String address;

    public Student() {
        serialNum++;
        studentID = serialNum;
    }

    public int getStudentID() {
        return studentID;
    }

    public static int getSerialNum() {
        return serialNum;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }
}
