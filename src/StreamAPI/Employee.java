package StreamAPI;

import java.util.Objects;

public class Employee {
    private int id;
    private String firstName;
    private String lastName;
    private int age;
    private int salary;

    public Employee(int id, String first_name, String last_name, int age, int salary) {
        this.id = id;
        this.firstName = first_name;
        this.lastName = last_name;
        this.age = age;
        this.salary = salary;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
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
        return id == employee.id && age == employee.age && salary == employee.salary && Objects.equals(firstName, employee.firstName) && Objects.equals(lastName, employee.lastName);
    }

    @Override
    public int hashCode() {
        int result = 17; // Arbitrary prime number
        result = 31 * result + id;
        result = 31 * result + (firstName != null ? firstName.hashCode() : 0);
        result = 31 * result + (lastName != null ? lastName.hashCode() : 0);
        result = 31 * result + age;
        result = 31 * result + salary;
        return result;
    }


    @Override
    public String toString() {
        return String.format("Employee{id=%d, first_name='%s', last_name='%s', age=%d, salary=%d}",
                id, firstName, lastName, age, salary);
    }
}
