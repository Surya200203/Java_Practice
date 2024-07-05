package Project.EmployeePayrollSystem;

public abstract class Employee {

    private String name;
    private Integer id;


    public Employee(String name, Integer id){
        this.id = id;
        this.name = name;
    }

    public Integer getId() {
        return id;
    }

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

    public void setId(Integer id){
        this.id = id;
    }

    public abstract void calculateSalary();

}

