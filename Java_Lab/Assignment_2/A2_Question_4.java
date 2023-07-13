import java.util.Scanner;

public class A2_Question_4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String weeks[] = {"Monday", "Tuesday", "Wednesday", "Thrusday", "Friday", "Saturday", "Sunday"};
        System.out.print("Enter the week number: ");
        int Week_Number = sc.nextInt();
        System.out.println("The day is: "+weeks[Week_Number - 1]);
    }
}