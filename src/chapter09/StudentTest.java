package chapter09;

public class StudentTest {
    public static void main(String[] args) {
        Student student = new Student();
        //student.studentName = "장준우";
        student.setStudentName("장준우");
        System.out.println(student.getStudentName());
    }
}
