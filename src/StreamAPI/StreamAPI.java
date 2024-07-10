package StreamAPI;

import java.util.*;
import java.util.stream.Collectors;

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


        list = list.stream().sorted( (x, y) -> Integer.compare(x.getSalary(), y.getSalary())).collect(Collectors.toList());

        System.out.println(list.get(9));

        long count = list.stream().count();
        System.out.println(count);

        System.out.println(list.stream().anyMatch(val -> val.getSalary()>999999));



} }
