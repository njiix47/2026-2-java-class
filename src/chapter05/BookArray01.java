package chapter05;

public class BookArray01 {
    public static void main(String[] args) {

        Book book1 = new Book("오디세이아", "호메로스");
        Book book2 = new Book("니코마코스 윤리학", "아리스토텔레스");
        Book book3 = new Book("신곡", "단테");

        Book book4 = new Book("질문을 잊는 법", "최민기");
        Book book5 = new Book("수업을 듣지 않고 전교 1등을 놓치는 법", "최민기");
        Book book6 = new Book("고도로 발전된 사회성 부족과 신체 부조화로 17년 동안 싱글로 사는 법", "최민기");
        Book book7 = new Book("농구부에서 퇴출 당하는 법", "최민기");

        book1.showInfo();
        book2.showInfo();
        book3.showInfo();
        book4.showInfo();
        book5.showInfo();
        book6.showInfo();
        book7.showInfo();


    }
}
