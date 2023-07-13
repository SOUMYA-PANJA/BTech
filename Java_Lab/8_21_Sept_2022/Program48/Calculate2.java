public class Calculate2 {
    int multiply(int a, int b){
        return a*b;
    }
    int multiply(int a, int b, int c){
        return a*b*c;
    }

    public static void main(String[] args) {
        Calculate2 obj = new Calculate2();
        int c = obj.multiply(5, 4);
        int d = obj.multiply(5, 4, 3);
        System.out.println("Multiply Method - Two Argumantsr: \n"+c);
        System.out.println("Multiply Method - Three Argumetns: \n"+d);
    }
}
