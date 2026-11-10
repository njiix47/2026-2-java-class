package test05_01;

public class Rectangle {
    private int height;
    private int width;

    public Rectangle(int height, int width) {
        this.width = width;
        this.height = height;
    }

    public int getArea() {
        return height * width;
    }

    public int getPerimeter() {
        return (height + width) * 2;
    }

    public void showInfo() {
        System.out.println("가로 : " + width);
        System.out.println("세로 : " + height);
        System.out.println("넓이 : " + getArea());
        System.out.println("둘레 : " + getPerimeter());
    }
}
