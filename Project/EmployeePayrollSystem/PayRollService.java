package Project.EmployeePayrollSystem;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class PayRollService {

    List<Employee> empoyeeList;

    public PayRollService(){
        empoyeeList = new ArrayList<>();
    };

    public void addEmployee(Employee e){
        empoyeeList.add(e);
        System.out.println("Employee added successfully");
    }

    public void removeEmployee(Integer id){
        Employee empToRemove = null;
        for(Employee e : empoyeeList){
            if(Objects.equals(e.getId(), id)){
                empToRemove = e;
                break;
            }
        }
        if(empToRemove != null){
            empoyeeList.remove(empToRemove);
            System.out.println("Employee Removed Successfully");
        }else{
            System.out.println("Employee doesn't exist");
        }
    }

    public void displayEmployee(){
        for(Employee e : empoyeeList){
            System.out.println(e);
        }
    }
}
