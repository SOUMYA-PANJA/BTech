import java.util.*;

/*
3. Write a program to calculate the percentage of a given student in the 10th board exam.
His marks from 5 subjects must be taken as input from the keyboard. (Marks are out of 100).
*/

public class A1_Question_3 {
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
