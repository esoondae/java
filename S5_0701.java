package jump2java;

class Animal6 {
    String name;

    void setName(String name) {
        this.name = name;
    }
}

class Tiger extends Animal6 {
}

class Lion extends Animal6 {
}

class ZooKeeper {
    void feed(Tiger tiger) {  
        System.out.println("소고기");
    }

    void feed(Lion lion) {  
        System.out.println("닭고기");
    }
}

public class S5_0701 {
    public static void main(String[] args) {
        ZooKeeper zooKeeper = new ZooKeeper();
        Tiger tiger = new Tiger();
        Lion lion = new Lion();
        zooKeeper.feed(tiger);  
        zooKeeper.feed(lion);  
    }
}
