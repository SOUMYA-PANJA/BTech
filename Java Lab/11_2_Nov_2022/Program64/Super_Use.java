class First {
    int a;

    public int getA() {
        return a;
    }

    First(int a) {
        this.a = a;
    }

    public int returnone() {
        return 1;
    }
}

class Second extends First {
    Second(int c) {
        super(c);
        System.out.println("This is a constructor. \n");
    }
}

public class Super_Use {
    public static void main(String[] args) {
        First e = new First(1024);
        Second d = new Second(5);
        System.out.println(e.getA());
    }
}