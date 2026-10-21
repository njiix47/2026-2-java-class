package chapter05;
import java.util.ArrayList;

public class ArrayListTest {
    public static void main(String[] args) {
        ArrayList<Book> booklist = new ArrayList<Book>();

        booklist.add(new Book("오디세이아", "호메로스"));
        booklist.add(new Book("신곡", "단테"));
        booklist.add(new Book("도리언 그레이의 초상", "오스카 와일드"));
        booklist.add(new Book("니코마코스 윤리학", "아리스토텔레스"));

        for (Book book : booklist) {
            book.showInfo();
        }

        booklist.remove(0);
        System.out.println("\n첫 번째 항목 제거");

        for (Book book : booklist) {
            book.showInfo();
        }

        booklist.removeAll(booklist);
        System.out.println("\n모든 항목 제거");

        for (Book book : booklist) {
            book.showInfo();
        }

        System.out.println(booklist.isEmpty());
    }
}
