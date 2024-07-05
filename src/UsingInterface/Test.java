package UsingInterface;

import UsingAbstractClass.Cat;
import UsingAbstractClass.Dog;

public class Test {
    public static void main(String[] args) {
        UsingAbstractClass.Dog dog1 = new Dog();
        Cat cat1 = new Cat();

        dog1.makeSound();
        dog1.sleep();
        cat1.makeSound();
        cat1.sleep();
    }
}
