import java.util.*;

/*
2. Write a Java program that asks the user to enter his/her name and greets them
with “Hello, you are coding for PCC-CS593 Lab.” message.
*/

public class A1_Question_2 {
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
