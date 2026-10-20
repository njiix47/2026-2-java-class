package chapter05;

public class BookArray02 {
    public static void main(String[] args) {
        Book[] books = new Book[7];
        Book[] booksCopy = new Book[7];

        books[0] = new Book("오디세이아", "호메로스");
        books[1] = new Book("니코마코스 윤리학", "아리스토텔레스");
        books[2] = new Book("신곡", "단테");

        books[3] = new Book("질문을 잊는 법", "최민기");
        books[4] = new Book("수업을 듣지 않아 전교 1등을 놓치는 법", "최민기");
        books[5] = new Book("고도로 발전된 사회성 부족과 신체 부조화로 17년 동안 싱글로 사는 법", "최민기");
        books[6] = new Book("농구부에서 퇴출 당하는 법", "최민기");

        for (int i = 0; i < books.length; i++) {
            books[i].showInfo();
        }

        books[0].setTitle("도리언 그레이의 초상");
        books[0].setAuthor("오스카 와일드");

        System.arraycopy(books, 0, booksCopy, 0, books.length);

        System.out.println("booksCopy");

        for (int i = 0; i < booksCopy.length; i++) {
            booksCopy[i].showInfo();
        }
    }
}
