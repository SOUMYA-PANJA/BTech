import java.util.*;

public class Question_1 {
    static void isInteger(float x){
        int i = (int)x;
        x = x - i;
        if (x > 0){
            System.out.println("Entered value is Float");
            return;
        }
        System.out.println("Entered value is Integer.");
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value: ");
        float x = sc.nextFloat();
        isInteger(x);
    }
}
