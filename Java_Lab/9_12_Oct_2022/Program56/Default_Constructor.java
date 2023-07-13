class Parameterized {
    Parameterized(int b, String s) {
        System.out.println("This is the Parameterized Constructor of De-fault Class. \n");
        System.out.println("Operating within the Parameterized Con-structor to Print the Data Member Value. \n");
        System.out.println("This is the " + b + "nd Java Lab Class in " + s);
    }
}

public class Default_Constructor {
    public static void main(String[] args) {
        Parameterized obj = new Parameterized(2, "September.");
    }
}