package tp1.ejercicio8;

public class Worker  extends Employee{

    private String workArea;

    public Worker(String workArea) {
        this.workArea = workArea;
    }

    public Worker(String name, int age, double salary, boolean availiable, String workArea) {
        super(name, age, salary, availiable);
        this.workArea = workArea;
    }

    public String getWorkArea() {
        return workArea;
    }

    public void setWorkArea(String workArea) {
        this.workArea = workArea;
    }

    public void workInArea(){
        System.out.println(this.getName() + " is actually working on: " + this.getWorkArea());
    }

}