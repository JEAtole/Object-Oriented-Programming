package domain;

public class Employee {
    String empNo;
    String lastName;
    String firstName;
    double salary;

    public Employee(String empNo, String lastName, String firstName, double salary) {
        this.empNo = empNo;
        this.lastName = lastName;
        this.firstName = firstName;
        this.salary = salary;
    }

    public String getEmpNo() {
        return empNo;
    }

    public void setEmpNo(String empNo) {
        this.empNo = empNo;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public Double getSalary() {
        return salary;
    }

    public void setSalary(Double salary) {
        this.salary = salary;
    }
}
