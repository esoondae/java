package jump2java;

class Animal2 {
    String name;

    void setName(String name) {
        this.name = name;
    }
}

class Dog2 extends Animal2 {
    void sleep() {
        System.out.println(this.name+" zzz");
    }
}

class HouseDog extends Dog2 {
}

public class S5_0503 {
    public static void main(String[] args) {
        HouseDog houseDog = new HouseDog();
        houseDog.setName("안녕하세요");
        houseDog.sleep();
    }
}
