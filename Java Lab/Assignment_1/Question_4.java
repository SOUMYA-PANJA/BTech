import java.lang.Math;
import java.util.Scanner;

/*
4. Evaluate the following expressions using Java program by taking user inputs:
((b^2- 4ac)+(b^2+ 4ac))^2 / 2ab
*/

public class Question_4 {
    static void evaluate(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter value of a: ");
        int a = sc.nextInt();
        System.out.print("Enter value of b: ");
        int b = sc.nextInt();
        System.out.print("Enter value of c: ");
        int c = sc.nextInt();

        double val = (double)(((b * b) - (4 * a * c)) + ((b * b) + (4 * a * c)));
        double total = (Math.pow(val, 2))/(2 * a * b);
        System.out.println("The value is: "+total);
    }
    public static void main(String[] args) {
        evaluate();
    }
}
