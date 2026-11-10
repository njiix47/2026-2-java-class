package test05;

public class Customer {
    private String name;
    private int reservedSeats;

    public Customer(String name) {
        this.name = name;
        this.reservedSeats = 0;
    }

    public void addReservation(int addReserve) {
        reservedSeats += addReserve;
    }

    public void showInfo() {
        System.out.println(name + ": " + reservedSeats + "석");
    }
}
