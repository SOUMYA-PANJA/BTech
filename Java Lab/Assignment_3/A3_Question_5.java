import java.util.Scanner;

public class A3_Question_5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a sentence: ");
        String str = sc.nextLine();
        int a = 0, e = 0, i = 0, o = 0, u = 0;
        for (int j = 0; j < str.length(); j++) {
            if (str.charAt(j) == 'a'){
                a++;
            }
            if (str.charAt(j) == 'e'){
                e++;
            }
            if (str.charAt(j) == 'i'){
                i++;
            }
            if (str.charAt(j) == 'o'){
                o++;
            }
            if (str.charAt(j) == 'u'){
                u++;
            }
        }
        System.out.println("Total number of vowels: "+(a+e+i+o+u));
        System.out.println("Number of a, e, i, o and u are present "+a+", "+e+", "+i+", "+o+" and "+u+" respectively");
    }
}
