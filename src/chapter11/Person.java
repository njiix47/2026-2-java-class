package chapter11;

public class Person {
    String name;
    int age;

    Person() {
        // this로 다른 생성자를 호출할 때는 this 위(주석 위치) 아무 것도(변수 정의 등) 있으면 안됨
        this("이름없음", 17);
    }

    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    Person returnItSelf() {
        return this;
    }
}
