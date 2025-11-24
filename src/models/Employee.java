package models;

public class Employee extends Person{
    private String employeeId;
    private String role;
    private double salary;

    public Employee(int id, String Name, String email, int phone, String role, String employeeId, double salary){
        super(id, Name, email, phone);
        this.employeeId = employeeId;
        this.role = role;
        this.salary = salary;
    }
    public String getEmployeeId(){
        return employeeId;
    }
    public String getRole(){
        return role;
    }

    public double getSalary(){
        return salary;
    }

    public void setEmployeeId(String employeeId){
        this.employeeId = employeeId;
    }

    public void setRole(String role){
        this.role = role;
    }

    public void setSalary(double salary){
        if(salary > 0){
            this.salary = salary;
        }
    }

    public String toString(){
        return String.format("Employee: %s (ID: %s) - Role: %s, Salary: $%.2f",
                getName(), employeeId, role, salary);
    }
}