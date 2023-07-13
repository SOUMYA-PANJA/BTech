class Employee { // First constructor
    Employee(String s, int i) {
        System.out.println("The name of the first employee is : \n" + s);
        System.out.println("The id of the first employee is : \n" + i);
    } // Constructor overloaded

    Employee(String s, int i, int salary) {
        System.out.println("The name of the second employee is : \n" + s);
        System.out.println("The id of the second employee is : \n" + i);
        System.out.println("The salary of second employee is : \n" + sal - ary);
    }
}

class CO {
    public static void main(String[] args) {
        Employee ob1 = new Employee("GH \n", 1);
        Employee ob2 = new Employee("YB \n", 2, 10000);
    }
}