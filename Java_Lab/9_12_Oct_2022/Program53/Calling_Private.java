class Employee {
    private int id;
    private String name;
}

public class Calling_Private {
    public static void main(String[] args) {
        Employee emp1 = new Employee();
        emp1.id = 100024;
        emp1.name = "Richard Feynman";
    }
}