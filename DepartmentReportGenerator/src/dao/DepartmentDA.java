package dao;
import domain.Department;
import domain.Employee;
import java.io.FileReader;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.io.FileNotFoundException;

public class DepartmentDA {

    public DepartmentDA(){
        try{
            Scanner departmentFile = new Scanner(new FileReader("src/dep.csv"));
            departmentFile.nextLine();

            while (departmentFile.hasNext()){
                String[] depData = departmentFile.nextLine().split(",");

                Department department = new Department(depData[0].trim(), depData[1].trim(), new HashMap<>());

                Scanner deptEmpFile = new Scanner(new FileReader("src/deptEmp.csv"));

                deptEmpFile.nextLine();

                while (deptEmpFile.hasNext()) {
                    String[] depEmpData = deptEmpFile.nextLine().split(",");

                    if (depData[0].equals(depEmpData[0])) {
                        EmployeeDA employeeDA = new EmployeeDA(depEmpData[1].trim(), Double.parseDouble(depEmpData[2]));
                        department.getEmployeeMap().putAll(employeeDA.getEmployeeMap());

                    }
                }

                double depTotalSalary = 0;
                for(Map.Entry<String, Employee> entryMap : department.getEmployeeMap().entrySet()){
                    depTotalSalary += entryMap.getValue().getSalary();
                }
                department.setDepTotalSalary(depTotalSalary);
                printReport(department);
            }

        } catch (FileNotFoundException e){
            throw new RuntimeException(e);
        }
    }

    private void printReport(Department department){

        System.out.println();
        System.out.println("Department code: " + department.getDepCode());
        System.out.println("Department name: " + department.getDepName());
        System.out.println("Department Total Salary: " + String.format("%,.2f",department.getDepTotalSalary()));
        System.out.println("--------------------- Details -------------------------");
        System.out.println(String.format("%-10s","EmpNo") + String.format("%-25s","Employee Name") + "Salary");
        for (Map.Entry<String, Employee> entryMap : department.getEmployeeMap().entrySet()){
            System.out.println(String.format("%-10s",entryMap.getValue().getEmpNo()) +
                               String.format("%-25s",entryMap.getValue().getLastName() + ", " + entryMap.getValue().getFirstName()) +
                               String.format("%,.2f",entryMap.getValue().getSalary()));
        }

    }

}
