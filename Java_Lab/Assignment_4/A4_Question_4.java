import java.util.Scanner;

public class A4_Question_4 {
    static int bLargest(int arr[]){
        int res = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if(res < arr[i]){
                res = arr[i];
            }
            if(res > arr[i]){
                return res;
            }
        }
        return res;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.printf("Enter element %d: ", i + 1);
            arr[i] = sc.nextInt();
        }
        System.out.print("Elements in the array: ");
        for (int i = 0; i < n; i++) {
            System.out.printf("%d ", arr[i]);
        }
        System.out.println("\nThe largest element is: " + bLargest(arr));
    }
}
