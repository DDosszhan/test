package Encapsulation;

public class Test {
    public static void main(String[] args) {
        Employee Doszhan = new Employee(1, "Doszhan", 19);
        System.out.print(Doszhan.getId()+". ");
        System.out.println(Doszhan.getName());
        System.out.println(Doszhan.getAge()+" years old");
    }
}
