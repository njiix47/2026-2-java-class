package chapter11;

public class ThisEx {
    public static void main(String[] args) {
        BirthDay birthDay = new BirthDay();

        birthDay.setYear(2010);
        System.out.println(birthDay);

        birthDay.printThis();
    }
}
