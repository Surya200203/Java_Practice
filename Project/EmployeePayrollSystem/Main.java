package Project.EmployeePayrollSystem;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.println("========================= Employee Payroll System =====================");
        Scanner sc = new Scanner(System.in);
        boolean i = true;
        PayRollService prs = new PayRollService();

        while(i){
            System.out.println("==================== Menu =========================");
            System.out.println("1. Add  Employee");
            System.out.println("2. Remove Employee");
            System.out.println("3. Display Employees");
            System.out.println(("4. Exit"));
            System.out.print("Enter your choice from above : ");
            int choice = sc.nextInt();

            switch (choice){
                case 1:
                    System.out.println("==== Employee Type ====");
                    System.out.println("1. Full Time");
                    System.out.println("2. Part Time");
                    System.out.print("Enter choice from above :");
                    int emptype = sc.nextInt();
                    if(emptype == 1){
                        System.out.println("Enter name of Employee : ");
                        String name = sc.next();
                        System.out.println("Enter ID of Employee : ");
                        Integer id = sc.nextInt();
                        System.out.println("Enter monthly Salary :");
                        Integer monthlySalary = sc.nextInt();

                        Employee e = new FullTimeEmployee(name, id,monthlySalary);
                        prs.addEmployee(e);
                    } else if (emptype == 2) {
                        System.out.println("Enter name of Employee : ");
                        String name = sc.next();
                        System.out.println("Enter ID of Employee : ");
                        Integer id = sc.nextInt();
                        System.out.println("Enter hours worked  :");
                        Integer hrsWorked = sc.nextInt();

                        Employee e = new PartTimeEmployee(name, id, hrsWorked);
                        prs.addEmployee(e);
                    }
                    break;
                case 2:
                    System.out.println("Enter Employee ID to remove : ");
                    int empID = sc.nextInt();
                    prs.removeEmployee(empID);
                    break;
                case 3:
                    System.out.println("All Employees are : ");
                    prs.displayEmployee();
                case 4:
                    System.out.println("THANK YOU");
                    i = false;
            }
        }
    }
}
