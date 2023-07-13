import java.util.Scanner;

public class A4_Question_5 {
    static void plus1Multi2(int arr[]){
        for (int i = 0; i < arr.length; i++) {
            if(i % 2 == 0){
                arr[i] *= 2;
            }
            else{
                arr[i] += 1;
            }
        }
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
        plus1Multi2(arr);
        System.out.print("\nElements in the array: ");
        for (int i = 0; i < n; i++) {
            System.out.printf("%d ", arr[i]);
        }
    }
}
