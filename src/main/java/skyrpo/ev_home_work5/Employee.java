package skyrpo.ev_home_work5;

import java.util.Objects;

public class Employee {
    private String fio;
    private int department;
    private int salary;
    private String firstName;
    private String lastName;
    static int counter;

    public Employee(String fio, int department, int salary, String firstName, String lastName) {
        this.fio = fio;
        this.department = department;
        this.salary = salary;
        this.firstName = firstName;
        this.lastName = lastName;
        counter++;
    }
    public String getFio() {
        return fio;
    }

    public int getDepartment() {
        return department;
    }

    public int getSalary() {
        return salary;
    }

    public static int getCounter() {
        return counter;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return firstName.equals(employee.firstName) && lastName.equals(employee.lastName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(firstName, lastName);
    }


    @Override
    public String toString() {
        return "ФИО: " + this.fio + " Отдел: " + this.department + " Зарплата: " + this.salary ;
    }

  //  public static abstract String getEmployee(Integer number);
}
