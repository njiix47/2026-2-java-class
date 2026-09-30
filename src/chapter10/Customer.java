package chapter10;

public class Customer {
    private String name;
    private double budget;
    private String model;

    public Customer(String name, double budget, String model) {
        this.name = name;
        this.budget = budget;
        this.model = model;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getBudget() {
        return budget;
    }

    public void setBudget(double budget) {
        this.budget = budget;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void buyPhone(Store store) {
        Phone phone = store.sellPhone(model, budget);
        if (phone == null) {
            System.out.println("고객 : 구매에 실패했습니다.");
        } else {
            System.out.println("고객 : 구매에 성공했습니다.");
        }
    }
}
