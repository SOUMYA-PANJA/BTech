import java.util.*;

public class Question_3 {
    static void percentage(){
        Scanner sc = new Scanner(System.in);
        float sum = 0;
        for (int i = 0; i < 5; i++) {
            System.out.print("Enter your marks for subject "+(i+1)+": ");
            sum = sum + sc.nextFloat();
        }
        System.out.println("Your percentage is: "+(sum/5));
    }
    public static void main(String[] args) {
        percentage();
    }
}
