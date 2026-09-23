package chapter09.developer;

import chapter09.company.Employee;

public class Developer extends Employee {
    public void printInfo() {
        System.out.println(name);
        System.out.println(department);
//      System.out.println(email);
//      System.out.println(salary);
    }
}
