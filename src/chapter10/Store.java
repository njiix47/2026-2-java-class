package chapter10;

public class Store {
    private Phone phone;

    public Store(Phone phone) {
        this.phone = phone;
    }

    // 판매가 가능하면 판매할 폰을 반환, 불가능하면 null 반환
    public Phone sellPhone(String model, double budget) {
        if (model.equals(phone.getModel()) && budget >= phone.getPrice()) {
            registerPayments(); //요금제 등록
            discountPromotion(); //할인
            saveData(); //데이터 저장 후 이동

            return phone;
        } else {
            return null;
        }
    }

    private void registerPayments() {
        System.out.println("대리점 : 요금제를 등록합니다. 약정을 등록합니다.");
    }

    private void discountPromotion() {
        System.out.println("대리점 : 할인 프로모션을 진행합니다.");
    }

    private void saveData() {
        System.out.println("대리점 : 데이터를 저장하고 새로운 폰으로 이동합니다.");
    }
}
