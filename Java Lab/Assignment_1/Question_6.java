import java.util.Scanner;

public class Question_6 {
    public static void main(String[] args) {
        int given_number = 13;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your number: ");
        int user_number = sc.nextInt();
        if(user_number < given_number){
            System.out.println("The given number is greater then the user number.");
        }
        else{
            System.out.println("The given number is not greater then the user number.");
        }
    }
}
