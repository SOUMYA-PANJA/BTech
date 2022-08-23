import java.util.Scanner;

public class A2_Question_5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("1. AI & ML\n2. IOT Cybersecurity\n");
        System.out.print("Enter your choice: ");
        int ch = sc.nextInt();
        System.out.println("Further career choices:\n");
        if(ch == 1){
            System.out.println("1. AI Engineer\n2. NLP Scientist\n3. Data Scientist\n4. Computer Vision Scientist");
        }
        else if(ch == 2){
            System.out.println("1. IOT Engineer\n2. Network Administrator\n3. Cybersecurity Expert\n4. Ethical Hacker");
        }
        else{
            System.out.println("Invalid Option");
        }
    }
}
