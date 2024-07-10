package StreamAPI;

import java.util.*;

public class StreamAPI {

    public static void main(String[] args) {
        List<Employee> list = new ArrayList<Employee>();

        list.add(new Employee(1, "Doszhan", "Konysuly", 19, 600000));
        list.add(new Employee(2, "Kairat", "Nurtas", 35, 2500000));
        list.add(new Employee(3, "Nikolai", "Baskov", 40, 123456));
        list.add(new Employee(4, "Nursultan", "Nazarbaev", 70, 5000000));
        list.add(new Employee(5, "Nurislam", "Sairanbek", 6, 5000));
        list.add(new Employee(6, "Erke", "Esmakhan", 40, 500000));
        list.add(new Employee(7, "Aidyn", "Rakhymbaev", 43, 9999999));
        list.add(new Employee(8, "Timur", "Turlov", 40, 8888888));
        list.add(new Employee(9, "Orlan", "Galiy", 19, 600000));
        list.add(new Employee(10, "Danil", "Preskurel", 21, 600000));


        list.stream()
                .min(Comparator.comparing(Employee::getAge))
                .ifPresent(val -> System.out.println(val.getFirst_name()));



        Employee employee1 = new Employee(10, "Danil", "Preskurel", 21, 600000);
        Employee employee2 = new Employee(10, "Danil", "Preskurel", 21, 600000);
        System.out.println(employee1.hashCode());
        System.out.println(employee2.hashCode());
        HashMap<Employee, Integer> hashMap = new HashMap<Employee, Integer>();
        employee1.setAge(20);
        hashMap.put(employee1, 1);
        System.out.println(hashMap.get(employee2));



} }
