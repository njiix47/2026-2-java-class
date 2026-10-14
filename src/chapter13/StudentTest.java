package chapter13;

public class StudentTest {
    public static void main(String[] args) {
        Student student1 = new Student();
        Student student2 = new Student();

        student1.setStudentName("석하랑");
        System.out.println(student1.getStudentName() + " " + student1.getStudentID());

        student2.setStudentName("이나진");
        System.out.println(student2.getStudentName() + " " + student2.getStudentID());

    }
}
