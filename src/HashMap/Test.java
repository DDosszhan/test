package HashMap;

import StreamAPI.Employee;

public class Test {
    public static void main(String[] args) {
        HashMap<Employee, String> hashMap = new HashMap<Employee, String>(16);

        Employee employee1 = (new Employee(1, "Doszhan", "Konysuly", 19, 600000));
        Employee employee2 = (new Employee(2, "Kairat", "Nurtas", 35, 2500000));
        Employee employee3 = (new Employee(3, "Nikolai", "Baskov", 40, 123456));
        Employee employee4 = new Employee(1, "Doszhan", "Konysuly", 19, 600000);
        hashMap.put(employee1, "1");
        hashMap.put(employee2, "2");
        hashMap.put(employee3, "3");
        System.out.println(hashMap.get(employee4));
    }
}
