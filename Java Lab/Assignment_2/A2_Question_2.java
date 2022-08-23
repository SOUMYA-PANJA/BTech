import java.util.Scanner;

public class A2_Question_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double marks[] = new double[3];
        double sum = 0;
        for (int i = 0; i < 3; i++) {
            System.out.print("Enter marks for "+(i+1)+"th subject: ");
            marks[i] = sc.nextDouble();
            sum += marks[i];
        }
        if((sum/3) >= 40){
            boolean flag = false;
            for (int i = 0; i < 3; i++) {
                if(marks[i] < 33){
                    flag = true;
                }
                if (flag){
                    System.out.println("Fail");
                    break;
                }
            }
            if (flag == false) {
                System.out.println("Pass");
            }
        }
        else{
            System.out.println("Fail");
        }
    }
}
