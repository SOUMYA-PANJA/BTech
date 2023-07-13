class Base1 {
    Base1() {
        System.out.println("This is a base class default construc-tor.");
    }

    Base1(int x) {
        System.out.println("This is a overloaded parameterized con-structor with value of x as: " + x);
    }
}

class Derived1 extends Base1 {
    Derived1() {
        System.out.println("This is a derived class default construc-tor.");
    }

    Derived1(int x, int y) {
        super(x);
        System.out.println("This is a overloaded parameterized con-structor of Derived with value of y as: " + y);
    }
}

class ChildOfDerived extends Derived1 {
    ChildOfDerived() {
        System.out.println("This is a child of derived constructor");
    }

    ChildOfDerived(int x, int y, int z) {
        super(x, y);
        System.out.println("This is a parameterized constructor of De-rived with value of z as: " + z);
    }
}

public class CI {
    public static void main(String[] args) {
        ChildOfDerived cd = new ChildOfDerived(12, 13, 15);
    }
}