package ExamplePackage;

public class Calculate {
    public int add(int p, int q) {
        return p + q;
    }

    public static void main(String args[]) {
        Calculate obj = new Calculate();
        System.out.println(obj.add(70, 12));
    }
}