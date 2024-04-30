package tp1.ejercicio8;


public class AssistantManager extends  Employee {
    private String department;

    public AssistantManager() {
    }

    public AssistantManager(String name, int age, double salary, boolean availiable) {
        super(name, age, salary, availiable);
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public void departmentWork(){
        System.out.print(this.getName() +" is actually being productive on" + this.department);
    };


}