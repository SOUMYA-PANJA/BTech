import java.util.Scanner;

public class ArraySumProductAvg {
    public static void main(String[] args) {
        int a[], sum = 0, prod = 1, avg, num;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of array elements: ");
        num = sc.nextInt();
        a = new int[num];
        System.out.println("Enter the array elements: ");
        for (int i = 0; i < num; i++) {
            System.out.print("Enter the "+(i+1)+" element: ");
            a[i] = sc.nextInt();
        }
        for (int i = 0; i < num; i++) {
            sum += a[i];
            prod *= a[i];
        }
        avg = sum/num;
        System.out.println("Sum of array elements is: "+sum);
        System.out.println("Product of array elements is: "+prod);
        System.out.println("Average of array elements is: "+avg);
    }
}
