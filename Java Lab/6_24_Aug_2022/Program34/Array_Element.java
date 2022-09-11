import java.util.Scanner;

public class Array_Element {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number to be check: ");
        int check = sc.nextInt();
        System.out.println("Enter size of the array: ");
        int n = sc.nextInt();
        int a[] = new int[n];
        boolean checker = true;

        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        for (int i = 0; i < n; i++) {
            if(a[i] == check){
                checker = true;
                break;
            }
            else{
                checker = false;
            }
        }
        if(checker == true){
            System.out.println("The element is present in the array.");
        }
        else{
            System.out.println("The element is not present in the array.");
        }
    }
}
