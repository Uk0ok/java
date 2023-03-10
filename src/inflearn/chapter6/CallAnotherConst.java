package inflearn.chapter6;

class Person {
    String name;
    int age;

    public Person() {
        this("이름없음", 1); // this는 가장 먼저 나와야 한다. this 앞에는 어떤 statement가 나오면 안된다.
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Person returnSelf() {
        return this;
    }
}

public class CallAnotherConst {
    public static void main(String[] args) {
        Person p1 = new Person();

        System.out.println(p1.name);
        System.out.println(p1.returnSelf());
    }
    
}
