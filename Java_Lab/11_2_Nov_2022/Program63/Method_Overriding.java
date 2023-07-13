class A {
    public int a;

    public int method1() {
        return 4;
    }

    public void method2() {
        System.out.println("This is method 2 of class A");
    }
}

class B extends A {
    public void method2() {
        System.out.println("This is method 2 of class B. \n");
    }

    public void method3() {
        System.out.println("This is method 3 of class B. \n");
    }
}

public class Method_Overriding {
    public static void main(String[] args) {
        A a = new A();
        a.method2();
        B b = new B();
        b.method2();
    }
}