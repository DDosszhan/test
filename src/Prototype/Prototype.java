package Prototype;

interface Vehicle extends Cloneable {
    Vehicle clone();
    void drive();
}

class Car implements Vehicle {

    private String model;

    public Car(String model) {
        this.model = model;
    }

    @Override
    public Vehicle clone() {
        return new Car(this.model);
    }

    @Override
    public void drive() {
        System.out.println("Driving a car: " + model);
    }

    @Override
    public String toString() {
        return "Car model: " + model;
    }

    public void setModel(String model) {
        this.model = model;
    }
}

class Bus implements Vehicle {
    private String model;

    public Bus(String model) {
        this.model = model;
    }

    @Override
    public Vehicle clone() {
        return new Bus(this.model);
    }

    @Override
    public void drive() {
        System.out.println("Driving a bus: " + model);
    }

    @Override
    public String toString() {
        return "Bus model: " + model;
    }
}


public class Prototype {
    public static void main(String[] args) {
        Car car1 = new Car("Mersedes");
        Vehicle car2 = car1.clone();

        car1.setModel("BMW");

        System.out.println(car1);
        System.out.println(car2);
    }
}
