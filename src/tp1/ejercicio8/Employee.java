package tp1.ejercicio8;


public class Employee {
    private String name;
    private int age;
    private double salary;
    private boolean availiable;

    public Employee() {
    }

    public Employee(String name, int age, double salary, boolean availiable) {
        this.name = name;
        this.age = age;
        this.salary = salary;
        this.availiable = availiable;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public boolean isAvailiable() {
        return availiable;
    }

    public void setAvailiable(boolean availiable) {
        this.availiable = availiable;
    }

}