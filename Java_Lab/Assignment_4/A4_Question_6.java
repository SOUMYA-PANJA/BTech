import java.util.Scanner;

public class A4_Question_6 {
    static void ternarySort(int arr[]){
        int first = 0, last = arr.length - 1;
        for (int i = 1; i < arr.length - 1; i++) {
            if(arr[i] == 0){
                int temp = arr[first];
                arr[first] = arr[i];
                arr[i] = temp;
                first++;
            }
            if(arr[i] == 2){
                int temp = arr[last];
                arr[last] = arr[i];
                arr[i] = temp;
                last--;
            }
            if(arr[i] == 0){
                int temp = arr[first];
                arr[first] = arr[i];
                arr[i] = temp;
                first++;
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
        ternarySort(arr);
        System.out.print("\nElements in the array: ");
        for (int i = 0; i < n; i++) {
            System.out.printf("%d ", arr[i]);
        }
    }
}
