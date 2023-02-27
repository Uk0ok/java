package zz;
public class zoo {
    public static void main(String[] args) {
        Zookeeper zk = new Zookeeper();
        Tiger t = new Tiger();
        // Lion l = new Lion();

        // zk.feed(t);
        // zk.feed(l);
        zk.feed(t);
    }
}

class Animal2 {
    String name;

    void setName(String name) {
        this.name = name;
    }
}

class Tiger extends Animal2 implements Predator {
    public String getFood() {
        return "apple";
    }
}

class Lion extends Animal2 implements Predator {
    public String getFood() {
        return "banana";
    }
}

class Zookeeper {
    void feed(Predator predator) {
        System.out.println("feed " + predator.getFood());
    }

    // void feed(Tiger tiger) {
    // System.out.println("feed apple");
    // }

    // void feed(Lion lion) {
    // System.out.println("feed banana");
    // }
}