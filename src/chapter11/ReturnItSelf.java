package chapter11;

public class ReturnItSelf {
    public static void main(String[] args) {
        Student student = new Student();

        // Student student1 = student.setId(1215);
        // Student student2 = student1.setName("장준우");
        // Student student3 = student2.setGrade(1);

        student.setId(1215).setName("장준우").setGrade(1).showStudentInfo(); // 체이닝 기법
    }

}
