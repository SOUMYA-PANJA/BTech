import  java.util.*;
import java.util.ArrayList;

public class JavaExample {
    public static void main(String[] args) {
        ArrayList<String> alist = new ArrayList<String>();
        alist.add("Linear Algebra");
        alist.add("Analytic Geometry");
        alist.add("Graph Theory");
        alist.add("Vector Calculus");
        alist.add("Gaussian and Mixture Model");
        alist.add("Continuous Optimization");
        System.out.println(alist+"\n");
        alist.add(3,"Matrix Decompositon");
        System.out.println(alist+"\n");
        alist.remove("Continuous Optimization");
        System.out.println(alist+"\n");
    }
}
