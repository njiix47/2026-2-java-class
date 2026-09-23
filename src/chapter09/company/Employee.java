package chapter09.company;

public class Employee {
    public String name;
    protected String department;
    String email;
    private int salary;

    public void printInfor() {
        System.out.println(name);
        System.out.println(department);
        System.out.println(email);
        System.out.println(salary);
    }

}
