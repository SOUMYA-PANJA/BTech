import java.util.Scanner;

public class A3_Question_4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float sum = 0;
        System.out.println("Enter marks: ");
        for (int i = 0; i < 6; i++) {
            System.out.print("Subject "+(i+1)+": ");
            sum += sc.nextFloat();
        }
        System.out.println(String.format("Average: %.2f",(sum/6f)));
        System.out.println(String.format("Percentage: %.2f",(sum/6f))+"%");
    }
}
