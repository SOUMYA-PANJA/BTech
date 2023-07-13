import java.util.Scanner;

public class A3_Question_3 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter maximunm stars in a line: ");
        int n = sc.nextInt() - 1;
        int i;
        for (i = 0; i < n; i++){
            for (int j = 0; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
            if ((i+1)%3 == 0 ){
                for (int j = 0; j <= i; j++) {
                    System.out.print("*");
                }
                System.out.println();
            }
        }
        for (; i >= 0; i--){
            for (int j = 0; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
            if ((i+1)%3 == 0 ){
                for (int j = 0; j <= i; j++) {
                    System.out.print("*");
                }
                System.out.println();
            }
        }
    }
}
