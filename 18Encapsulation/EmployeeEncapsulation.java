

class Employee {
    private String eName = "prajwal reddy";
    private String eRole = "cyber security engineer";
    private double salary = 800000;
    private int eId = 25;

    // Getters
    String getEName() {
        return eName;
    }

    String getERole() {
        return eRole;
    }

    double getSalary() {
        return salary;
    }

    int getEId() {
        return eId;
    }

    // Setters
    void setEName(String eName) {
        this.eName = eName;
    }

    void setERole(String eRole) {
        this.eRole = eRole;
    }

    void setSalary(double salary) {
        this.salary = salary;
    }

    void setEId(int eId) {
        this.eId = eId;
    }
}

// Main class to test encapsulation
public class EmployeeEncapsulation {
    public static void main(String[] args) {
        Employee emp = new Employee();

        emp.setEName("Prajwal");
        emp.setERole("FullStack Developer");
        emp.setSalary(60000);
        emp.setEId(125);

        System.out.println("Employee name: " + emp.getEName());
        System.out.println("Role: " + emp.getERole());
        System.out.println("Salary: " + emp.getSalary());
        System.out.println("Employee ID: " + emp.getEId());
    }
}
