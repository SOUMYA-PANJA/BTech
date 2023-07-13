public class Method_Logics{
    static int logic(int x, int y){
        int z;
        if(x > y){
            z = x+y;
        }
        else{
            z = (x+y)*5;
        }
        x = 566;
        return z;
    }

    public static void main(String[] args) {
        int a = 5;
        int b = 7;
        int c;
        Method_Logics obj = new Method_Logics();
        c = obj.logic(a, b);
        System.out.println(a+"  "+b);
        int a1 = 2;
        int b1 = 3;
        int c1;
        c1 = logic(a1, b1);
        System.out.println(c);
        System.out.println(c1);
    }
}
