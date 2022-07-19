import java.util.*;

public class Average_Marks {
    public static void main(String[] args) {
        Scanner b = new Scanner(System.in)
        String str = b.next();
        int m1 = b.nextInt();
        int m2 = b.nextInt();
        int m3 = b.nextInt();
        int avg = ((m1 + m2 + m3)/3);
        System.out.println(str);
        System.out.println(avg);
    }
}
