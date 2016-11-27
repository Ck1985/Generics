package generics;

/**
 * Created by Dell Vostro 5459 on 11/27/2016.
 */
class Employee{
    private String name;
    private int salary;
    public Employee(String name, int salary){
        this.name = name;
        this.salary = salary;
    }
    public String getName(){
        return this.name;
    }
    public void setName(String name){
        this.name = name;
    }
    public int getSalary(){
        return this.salary;
    }
    public void setSalary(int salary){
        this.salary = salary;
    }
}
class CompAEmp extends Employee{
    public CompAEmp(String nameA, int salaryA){
        super(nameA, salaryA);
    }
}
class CompBEmp extends Employee{
    public CompBEmp(String nameB, int salaryB){
        super(nameB, salaryB);
    }
}
class EmployeeUtil<T extends Employee>{
    private T employee;
    public EmployeeUtil(T employee){
        this.employee = employee;
    }
    public int getSalary(){
        return employee.getSalary();
    }
    public boolean checkSalary(EmployeeUtil<?> otherEmp){
        return(this.getSalary() == otherEmp.getSalary());
    }
}
public class MyWildcardUsing {
    public static void main(String[] args){
        EmployeeUtil<CompAEmp> emp_1 = new EmployeeUtil<>(new CompAEmp("John", 2000));
        EmployeeUtil<CompBEmp> emp_2 = new EmployeeUtil<>(new CompBEmp("Peter", 3000));
        EmployeeUtil<CompAEmp> emp_3 = new EmployeeUtil<>(new CompAEmp("Mary", 4000));
        System.out.println(emp_1.checkSalary(emp_2));
        System.out.println(emp_2.checkSalary(emp_3));
    }
}
