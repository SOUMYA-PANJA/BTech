import java.util.Scanner;

public class A2_Question_6 {
    static int fib(int n){
        if (n < 2){
            return n;
        }
        else{
            int a = 0;
            int b = 1;
            for (int i = 1; i < n; i++) {
                int c = a + b;
                a = b;
                b = c;
            }
            return b;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n: ");
        int n = sc.nextInt();
        System.out.println(n+"th fibonacci number is: "+fib(n));
    }
}
