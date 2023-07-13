import java.util.Arrays;

public class Array_List {
    public static void main(String[] args) {
        Object[] src = {"C", "C++", "Java", "Pearl", "Python", "Ruby"};
        String[] dest = new String[src.length];
        System.arraycopy(src, 0, dest, 0, src.length);
        System.out.println(Arrays.toString(dest));
    }
}
