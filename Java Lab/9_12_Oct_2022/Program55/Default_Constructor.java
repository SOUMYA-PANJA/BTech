class Default {
    Default() {
        System.out.println("This is the Default Constructor of Default Class. \n");
        long a = 36523;
        System.out.println("Operating within the Default Constructor to Print the Data Member Value. \n");
        System.out.println("Value of a is: " + a);
    }
}

public class Default_Constructor {
    public static void main(String[] args) {
        Default obj = new Default();
    }
}