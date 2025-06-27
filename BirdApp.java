abstract class Bird {
    abstract void fly();
}

class Eagle extends Bird {
    void fly() {
        System.out.println("Eagle is flying high in the sky.");
    }
}

class Penguin extends Bird {
    void fly() {
        System.out.println("Penguins cannot fly but can swim well.");
    }
}

public class BirdApp {
    public static void main(String[] args) {
        Bird eagle = new Eagle();
        Bird penguin = new Penguin();

        eagle.fly();
        penguin.fly();
    }
}
