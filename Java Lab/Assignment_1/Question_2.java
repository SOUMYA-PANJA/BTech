import java.util.*;

public class Question_2 {
    static void greet(String name){
        System.out.println("Hello, "+name+". "+"You are coding for PCC-CS593 Lab");
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String name = sc.next();
        greet(name);
    }
}
