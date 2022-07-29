import java.util.Scanner;

public class Question_5 {
    static char decrypt(char grade){
        for (int i = 0; i < 8;grade--,i++);
        return grade;
    }

    static char encrypt(char grade){
        for (int i = 0; i < 8;grade++,i++);
        return grade;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your grade: ");
        char grade = sc.next().charAt(0);
        grade = encrypt(grade);
        System.out.println("Encrypted Grade: "+grade);
        grade = decrypt(grade);
        System.out.println("Decrypted Grade: "+grade);
    }
}
