class Calculate{
    int sum(int a, int b){
        return a+b;
    }
}

public class Method_Call {
    public static void main(String[] args) {
        Calculate obj = new Calculate();
        int c = obj.sum(10, 7);
        System.out.println("The result is: "+c);
    }
}
