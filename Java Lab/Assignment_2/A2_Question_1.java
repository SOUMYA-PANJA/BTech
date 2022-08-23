import java.util.Scanner;

public class A2_Question_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter your basic salary: ");
        double Basic_Salary = sc.nextDouble();
        double HRA = Basic_Salary * 30 / 100;
        double DA = Basic_Salary;
        double Total_Salary = Basic_Salary + HRA + DA - 3000;
        if (Total_Salary >= 50000){
            System.out.println("Grade A");
        }
        else if (Total_Salary >= 30000) {
            System.out.println("Grade B");
        }
        else if (Total_Salary <= 20000){
            System.out.println("Grade C");
        }
    }
}
