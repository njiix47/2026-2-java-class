package chapter08;

public class Student {
    int studentID;
    String studentName;

    Subject dataBase;
    Subject java;

    public Student(int studentID, String studentName) {
        this.studentName = studentName;
        this.studentID = studentID;

        dataBase = new Subject();
        java = new Subject();
    }

    public void setDataBaseSubject(String subjectName, int score) {
        dataBase.setSubjectName(subjectName);
        dataBase.setScorePoint(score);
    }

    public void setJavaSubject(String subjectName, int score) {
        java.setSubjectName(subjectName);
        java.setScorePoint(score);
    }

    public void showStudentInfo() {
        System.out.println(
                studentName + "님의 " + dataBase.getSubjectName() + "과목의 점수는 " + dataBase.getScorePoint() + "점이고, "
                + java.getSubjectName() + "과목의 점수는 " + java.getScorePoint() + "점 입니다.");
    }
}
