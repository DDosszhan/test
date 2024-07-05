package Polymorphism;
public class MakeSound {
    public void makeSound(Animal animal) {
        System.out.println("Animal makes sound");
    }
    public void makeSound(Cat cat) {
        System.out.println("Cat meows");
    }
    public void makeSound(Dog dog) {
        System.out.println("Dog woofs");
    }

}

