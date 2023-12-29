import java.util.Scanner;
class Employee {
    protected String empName;
    protected int empId;
    protected String address;
    protected String mailId;
    protected String mobileNo;
    protected double basicPay;
    public Employee(String empName, int empId, String address, String mailId, String mobileNo, double basicPay) {
        this.empName = empName;
        this.empId = empId;
        this.address = address;
        this.mailId = mailId;
        this.mobileNo = mobileNo;
        this.basicPay = basicPay;
    }
    public void generatePaySlip() {
        double da = 0.97 * basicPay;
        double hra = 0.1 * basicPay;
        double pf = 0.12 * basicPay;
        double staffClubFund = 0.001 * basicPay;
        double grossSalary = basicPay + da + hra;
        double netSalary = grossSalary - pf - staffClubFund;
        System.out.println("Pay Slip for Employee ID: " + empId);
        System.out.println("Employee Name: " + empName);
        System.out.println("Address: " + address);
        System.out.println("Mail ID: " + mailId);
        System.out.println("Mobile No: " + mobileNo);
        System.out.println("Basic Pay: " + basicPay);
        System.out.println("Dearness Allowance (DA): " + da);
        System.out.println("House Rent Allowance (HRA): " + hra);
        System.out.println("Provident Fund (PF): " + pf);
        System.out.println("Staff Club Fund: " + staffClubFund);
        System.out.println("Gross Salary: " + grossSalary);
        System.out.println("Net Salary: " + netSalary);
        System.out.println("----------------------------");
    }
}
class Programmer extends Employee {
    public Programmer(String empName, int empId, String address, String mailId, String mobileNo, double basicPay) {
        super(empName, empId, address, mailId, mobileNo, basicPay);
    }
}
class AssistantProfessor extends Employee {
    public AssistantProfessor(String empName, int empId, String address, String mailId, String mobileNo, double basicPay) {
        super(empName, empId, address, mailId, mobileNo, basicPay);
    }
}
class AssociateProfessor extends Employee {
    public AssociateProfessor(String empName, int empId, String address, String mailId, String mobileNo, double basicPay) {
        super(empName, empId, address, mailId, mobileNo, basicPay);
    }
}
class Professor extends Employee {
    public Professor(String empName, int empId, String address, String mailId, String mobileNo, double basicPay) {
        super(empName, empId, address, mailId, mobileNo, basicPay);
    }
}
public class PayrollSystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Creating instances of different employee types
        Programmer programmer = new Programmer("John Doe", 101, "123 Main St", "john@example.com", "1234567890", 50000);
        AssistantProfessor assistantProfessor = new AssistantProfessor("Alice Smith", 201, "456 Oak St", "alice@example.com", "9876543210", 60000);
        AssociateProfessor associateProfessor = new AssociateProfessor("Bob Johnson", 301, "789 Pine St", "bob@example.com", "5678901234", 70000);
        Professor professor = new Professor("Eva Davis", 401, "101 Cedar St", "eva@example.com", "2345678901", 80000);
        // Generating pay slips for each employee
        programmer.generatePaySlip();
        assistantProfessor.generatePaySlip();
        associateProfessor.generatePaySlip();
        professor.generatePaySlip();
        scanner.close();
    }
}
