public class Calculate1 {
    int multiply(int a, int b){
        return a*b;
    }
    double multiply(double a, double b){
        return a*b;
    }

    public static void main(String[] args) {
        Calculate1 obj = new Calculate1();
        int c = obj.multiply(5, 4);
        double d = obj.multiply(5.1, 4.2);
        System.out.println("Multiply Method - Returns Integer: \n"+c);
        System.out.println("Multiply Method - Returns Double: \n"+d);
    }
}
