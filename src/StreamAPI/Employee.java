package StreamAPI;

import java.util.Objects;

public class Employee {
    private int id;
    private String first_name;
    private String last_name;
    private int age;
    private int salary;

    Employee(int id, String first_name, String last_name, int age, int salary) {
        this.id = id;
        this.first_name = first_name;
        this.last_name = last_name;
        this.age = age;
        this.salary = salary;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirst_name() {
        return first_name;
    }

    public void setFirst_name(String first_name) {
        this.first_name = first_name;
    }

    public String getLast_name() {
        return last_name;
    }

    public void setLast_name(String last_name) {
        this.last_name = last_name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return id == employee.id && age == employee.age && salary == employee.salary && Objects.equals(first_name, employee.first_name) && Objects.equals(last_name, employee.last_name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, first_name, last_name, age, salary);
    }
}
