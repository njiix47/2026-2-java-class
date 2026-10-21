package test03;

public class Student {
    private String name;
    private int ID;

    public Student(int ID, String name){
        this.ID = ID;
        this.name = name;
    }

    public void showInfo() {
        System.out.println(name + " " + ID);
    }
}
