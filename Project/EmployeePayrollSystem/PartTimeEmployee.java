package Project.EmployeePayrollSystem;

public class PartTimeEmployee extends Employee {

    private Integer hoursWorked;

    public PartTimeEmployee(String name,Integer id,Integer hoursWorked){
        super( name, id);
        this.hoursWorked = hoursWorked;
    }


    public Integer getHoursWorked() {
        return hoursWorked;
    }

    public void setHoursWorked(Integer hoursWorked) {
        this.hoursWorked = hoursWorked;
    }

    @Override
    public void calculateSalary() {
        Integer salary = 200 * this.hoursWorked;
    }
}
