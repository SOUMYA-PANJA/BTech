class Rec{
    int stop;
    public Rec(int s){
        this.stop = s;
    }
    public Rec(){
        this.stop = 0;
    }
    public void start_iterative(){
        for (int i = 0; i < this.stop; i++){
            System.out.println("Statement iteration Number: "+Integer.toString(i));
        }
    }
    public void start_recursive(int limit){
        if (limit <= this.stop){
            System.out.println("Statement iternation number: "+Integer.toString(limit));
        }
    }
}

class Factorial extends Rec{
    int rec_temp;
    public Factorial(int s){
        this.stop = 3;
    }
    public void start_iterative() {
        int val = 1;
        for (int i = 1; i <= this.stop; i++){
            val = val*i;
        }
        System.out.printf("Iterative factorial for %d = %d\n", this.stop, val);
    }
    public void start_recursive(int val, int result){
        if(val == 1){
            System.out.printf("Recursive factorial %d = %d\n", this.stop, result);
        }
        else{
            this.start_recursive(val-1, result*val);
        }
    }
    public void start_recursive(){
        this.start_recursive(this.stop, 1);
    }
}

public class Demo {
    public static int factorial(int N){
        if (N == 1){
            return 1;
        }
        return Demo.factorial(N -1)*N;
    }

    public static void main(String[] args) {
        Rec r = new Rec(5);
        System.out.println("Iterative");
        r.start_iterative();
        System.out.println("Recursive");
        r.start_recursive();
        Factorial fr = new Factorial();
        System.out.println("Iterative");
        fr.start_iterative();
        System.out.println("Recursive");
        fr.start_recursive();
        System.out.printf(" 1! = %d, 2! = %d, 10! = %d, \n", Demo.factorial(1), Demo.factorial(2), Demo.factorial(10));
    }
}
