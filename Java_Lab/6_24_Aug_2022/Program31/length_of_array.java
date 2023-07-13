import java.util.Arrays;

public class length_of_array {
    public static void main(String[] args) {
        int a[] = {1,2,3,4,5,6,7,8,9,0};
        System.out.println(a.length);
        System.out.println(Arrays.stream(a).max().getAsInt());
    }
}
