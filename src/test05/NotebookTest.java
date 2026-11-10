package test05;

import java.util.Scanner;

public class NotebookTest {
    public static void main(String[] args) {
        NotebookManager manager = NotebookManager.getInstance();

        Scanner sc = new Scanner(System.in);

        int rentCount = sc.nextInt();
        sc.nextLine();

        int returnCount = sc.nextInt();

        manager.rentNotebook(rentCount);
        manager.returnNotebook(returnCount);

        manager.showInfo();
    }
}
