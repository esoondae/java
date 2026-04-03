package jump2java;

class Animal3 {
    String name;

    void setName(String name) {
        this.name = name;
    }
}

class Dog3 extends Animal3 {
    void sleep() {
        System.out.println(this.name + " zzz");
    }
}

class HouseDog1 extends Dog3 {
    void sleep() {
        System.out.println(this.name + " zzz in house");
    }

    void sleep(int hour) {
        System.out.println(this.name + " zzz in house for " + hour + " hours");
    }
}

public class S5_0504 {
    public static void main(String[] args) {
        HouseDog1 houseDog = new HouseDog1();
        houseDog.setName("happy");
        houseDog.sleep();
        houseDog.sleep(3);
    }
}
