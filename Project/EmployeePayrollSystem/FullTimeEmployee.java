package Project.EmployeePayrollSystem;

public class FullTimeEmployee extends Employee {

    private Integer monthlySalary ;

    public FullTimeEmployee(String name, Integer id,Integer monthlySalary){
        super(name,id);
        this.monthlySalary = monthlySalary;
    }

    public Integer getMonthlySalary(){
        return monthlySalary;
    }

    public void setMonthlySalary(Integer monthlySalary){
        this.monthlySalary = monthlySalary;
    }

    @Override
    public void calculateSalary() {

    }
}
