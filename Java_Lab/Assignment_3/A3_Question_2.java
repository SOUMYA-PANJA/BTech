import java.util.Arrays;
import java.util.Scanner;

public class A3_Question_2 {
    static void swap(char arr[], int a, int b){
        char temp = arr[b];
        arr[b] = arr[a];
        arr[a] = temp;
    }

    static void anagram(char arr[], int i){
        if (i == arr.length - 1){
            String s = new String(arr);
            System.out.println(s);
            return;
        }
        for (int j = i; j < arr.length; j++) {
            swap(arr, i, j);
            anagram(arr, i+1);
            swap(arr, i, j);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a word: ");
        char []str = sc.next().toCharArray();

        System.out.println("The possible anaagrams are:");
        anagram(str, 0);
    }
}
