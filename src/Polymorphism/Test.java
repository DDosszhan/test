package Polymorphism;


public class Test {


    public static void main(String[] args) {
        //Compile-Time Polymorphism (Method Overloading):
        UniversalAdd un = new UniversalAdd();
        System.out.println(un.add(1,2));
        System.out.println(un.add(3.5,4.5));


        //Change type to Animal to show
        Animal animal1 = new Animal();
        Animal dog1 = new Dog();
        Animal cat1 = new Cat();


        MakeSound sound = new MakeSound();

        sound.makeSound(animal1);
        sound.makeSound(dog1);
        sound.makeSound(cat1);

        //Run-Time Polymorphism (Method Overriding):
        animal1.eat();
        cat1.eat();
        dog1.eat();
    }
}
