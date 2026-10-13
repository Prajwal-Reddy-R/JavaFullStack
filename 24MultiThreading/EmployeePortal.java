
class Employee extends Thread {
    String name;
    int id;
    String department;
    double salary;

    Employee(String name, int id, String department, double salary) {
        this.name = name;
        this.id = id;
        this.department = department;
        this.salary = salary;
    }
    public void run() {
        System.out.println("Employee Name: " + name);
        System.out.println("Employee ID: " + id);
        System.out.println("Employee Department: " + department);
        System.out.println("Employee Salary: " + salary);
    }
}

class Application extends Thread {
    String role;
    String Resume;
    String address;
    String ctc;

    Application(String role, String Resume, String address, String ctc) {
        this.role = role;
        this.Resume = Resume;
        this.address = address;
        this.ctc = ctc;
    }
    public void run() {
        System.out.println("Application Role: " + role);
        System.out.println("Application Resume: " + Resume);
        System.out.println("Application Address: " + address);
        System.out.println("Application CTC: " + ctc);
    }
}

class Company extends Thread {
        String companyName;
        String jobtitle;
        String companyAddress;
        String companyContact;

        Company(String companyName, String jobtitle, String companyAddress, String companyContact) {
            this.companyName = companyName;
            this.jobtitle = jobtitle;
            this.companyAddress = companyAddress;
            this.companyContact = companyContact;
        }
        public void run() {
            System.out.println("Company Name: " + companyName);
            System.out.println("Job Title: " + jobtitle);
            System.out.println("Company Address: " + companyAddress);
            System.out.println("Company Contact: " + companyContact);
        }
    }



public class EmployeePortal {
    public static void main(String[] args) throws InterruptedException {
        Employee e1 = new Employee("Prajwal", 21, "IT", 100000);
        Application a1 = new Application("Software Engineer", "Resume.pdf", "123 Main St", "120000");
        Company c1 = new Company("TechCorp", "Software Engineer", "456 Tech Ave", "9876543210");

        e1.start();
        e1.join();

        a1.start();
        a1.join();

        c1.start();
    }
    
}
