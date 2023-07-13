import java.util.Scanner;

public class Find_Character_Case {

  public static void main(String[] args) {
    System.out.println("Please enter any character:");
    Scanner scanner = new Scanner(System.in);
    char ch = scanner.next().charAt(0);
    if (ch >= 'A' && ch <= 'Z') System.out.println("1"); else if (
      ch >= 'a' && ch <= 'z'
    ) System.out.println("0"); else System.out.println("-1");
  }
}
