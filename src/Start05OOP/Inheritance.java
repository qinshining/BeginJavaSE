package Start05OOP;

public class Inheritance {
    public static void main(String[] args) {
        Animal animal = new Dog();
        animal.move();
//        Animal a2 = animal;
//        a2.move();
    }
}

abstract class Animal {

    public void move() {
        System.out.println("animal move");
    }

    public abstract void eat();

    protected void sleep() {

    }
}

class Dog extends Animal {
    public void move() {
        System.out.println("dog move");
    }

    @Override
    public void eat() {
        System.out.println("dog eat");
    }

    @Override
    public void sleep() {
        super.sleep();
    }
}
