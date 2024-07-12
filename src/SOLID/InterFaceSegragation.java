package SOLID;

//interface Worker {
//    void work();
//    void eat();
//    void sleep();
//}

interface Workable {
    void work();
}
interface Sleepable {
    void sleep();
}
interface Eatable{
    void eat();
}

class HumanWorker implements Workable, Sleepable, Eatable {
    @Override
    public void work (){
        System.out.println("Human worker is working");
    }
    @Override
    public void sleep(){
        System.out.println("Human worker is sleeping");
    }
    @Override
    public void eat(){
        System.out.println("Human worker is eating");
    }
}

class RobotWorker implements Workable {
    @Override
    public void work(){
        System.out.println("Robot worker is working");
    }
}


public class InterFaceSegragation {
    public static void main(String[] args) {
        HumanWorker human = new HumanWorker();
        RobotWorker robot = new RobotWorker();

        human.work();
        human.eat();
        human.sleep();
        robot.work();
    }
}
