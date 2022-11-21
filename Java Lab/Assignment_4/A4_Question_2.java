import java.util.Scanner;

public class A4_Question_2 {
    public static int[] sLargestSmallest(int arr[]){
        int resL = Integer.MIN_VALUE, largest = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > largest) {
                resL = largest;
                largest = arr[i];
            } else if (arr[i] != largest && (resL == Integer.MIN_VALUE || resL < arr[i])) {
                resL = arr[i];
            }
        }
        int resS = Integer.MAX_VALUE, smallest = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if(arr[i] < smallest){
                resS = smallest;
                smallest = arr[i];
            }
            else if (arr[i] != smallest && (resS == Integer.MAX_VALUE || resS > arr[i])) {
                resS = arr[i];
            }
        }
        int res[] = {resS, resL};
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
        int res[] = sLargestSmallest(arr);
        System.out.println("\nSecond smallest: " + res[0]);
        System.out.println("\nSecond largest: " + res[1]);
    }
}
