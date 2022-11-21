class Employee {
    int id;
    int salary;
    String name;

    public void PrintDetails() {
        System.out.println("Your EMP ID is " + id);
        System.out.println("Your Name is " + name);
    }

    public int getSalary() {
        return salary;
    }
}

public class Custom_Class {
    public static void main(String[] args) { 
        System.out.println("Employee is the Custom Class"); 
        Employee GH = new Employee(); // Instantiating a new Employee Object 
        System.out.println("Employee Class Object GH Called"); 
        Employee YB = new Employee(); // Instantiating a new Employee Object 
        System.out.println("Employee Class Object YB Called"); 
        // Setting Attributes for GH 
        GH.id = 1000024;GH.salary = 1000026; 
        GH.name = "Geoffrey E. Hinton"; 
        // Setting Attributes for YB 
        YB.id = 1000042; YB.salary = 1000062; 
        YB.name = "Yoshua Bengio"; 
        System.out.println("\n"); // Printing the Attributes 
        GH.PrintDetails(); YB.PrintDetails(); 
        int salary1 = GH.getSalary(); 
        int salary2 = YB.getSalary(); 
        System.out.println("Geoffrey E. Hinton's Salary:" + salary1 + "\n"); 
        System.out.println("Yoshua Bengio's Salary:" + salary2 + "\n"); 
    } 
}