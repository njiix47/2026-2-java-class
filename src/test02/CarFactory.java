package test02;

public class CarFactory {
    private static CarFactory car1 = new CarFactory();

    private CarFactory() {
    }

    public static CarFactory getInstance() {
        return car1;
    }

    public Car createCar() {
        return new Car();
    }
}
