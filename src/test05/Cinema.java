package test05;

public class Cinema {
    private String title;
    private int availableSeats;

    public Cinema(String title, int availableSeats) {
        this.title = title;
        this.availableSeats = availableSeats;
    }

    public void reserve(Customer customer, int count) {
        if (availableSeats >= count) {
            availableSeats -= count;
            customer.addReservation(count);
        } else if (availableSeats <= 0) {
            System.out.println("올바른 좌석 수를 입력하세요.");
        } else {
            System.out.println("예약 가능한 좌석이 부족합니다.");
        }
    }

    public void showInfo() {
        System.out.println("영화 제목: " + title);
        System.out.println("남은 좌석: " + availableSeats);
    }
}
