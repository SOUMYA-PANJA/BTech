package OtherPackage; //Declaring a package 

import ExamplePackage.Calculate; //importing a user defined package

public class Example {
    public static void main(String args[]) {
        Calculate obj = new Calculate();
        System.out.println(obj.add(300, 700));
    }
}