import java.util.*;

public class Linear_Search {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int array[] = {10, 40, 50, 87, 45, 67, 45};
        int size = array.length;
        System.out.print("Enter value: ");
        int value = sc.nextInt();
        int num = -1;
        for (int i = 0; i < size; i++){
            if (array[i] == value){
                num = i;
                break;
            }
        }
        if (num >= 0){
            System.out.println("Found at index: "+num);
        }else{
            System.out.println("The value is not find.");
        }
    }
}
