class Emp {
        
    String emp_name="Prajwal";
    int emp_id=21;
    long emp_salary=100000;
    
}

class Department {
    String dept_name="IT";
    int dept_id=101;
    
    
}
public class Employee {
    public static void main(String[] args) {
        Emp e1 = new Emp();
        
        Department d1 = new Department();
    

        System.out.println("Employee Details:");
        System.out.println("Name: " + e1.emp_name);
        System.out.println("ID: " + e1.emp_id);
        System.out.println("Salary: " + e1.emp_salary);

        System.out.println("Department Details:");
        System.out.println("Name: " + d1.dept_name);
        System.out.println("ID: " + d1.dept_id);
    }
}