package dao;
import domain.Employee;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.HashMap;
import java.util.Scanner;

public class EmployeeDA {

    private HashMap<String, Employee> employeeMap;

    public EmployeeDA(String empNo, double salary){
        try{
            Scanner employeeFile = new Scanner(new FileReader("src/emp.csv"));

            employeeMap = new HashMap<>();
            employeeFile.nextLine();

            while (employeeFile.hasNext()){
                String[] employeeData = employeeFile.nextLine().split(",");

                if (empNo.equals(employeeData[0].trim())){

                    Employee employee = new Employee(employeeData[0],
                            employeeData[1].trim(),
                            employeeData[2].trim(),
                            salary);

                    employeeMap.put(empNo,employee);

                }
            }

        } catch (FileNotFoundException e){
            throw new RuntimeException(e);
        }
    }

    public HashMap<String, Employee> getEmployeeMap(){
        return employeeMap;
    }

}
