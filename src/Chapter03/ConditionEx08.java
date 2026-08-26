package Chapter03;

public class ConditionEx08 {
    public static void main(String[] args) {
        int menu = 3;
        String strMenu;

        strMenu = switch (menu) {
            case 1 -> "아메리카노";
            case 2 -> "카페라떼";
            case 3 -> "초코라떼";
            case 4 -> "녹차라떼";

            default -> "없는 메뉴입니다.";
        };

        System.out.println("선택한 메뉴 : " + strMenu);
    }
}
