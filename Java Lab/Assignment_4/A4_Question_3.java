import java.util.ArrayList;

class Students{
}

public class A4_Question_3 {
    public static void main(String[] args) {
        ArrayList A = new ArrayList();
        A.add(new Students());
        A.add(new Students());
        A.add(new Students());
        A.add(new Students());
        A.add(new Students());
        ArrayList B = new ArrayList();
        B.add(new Students());
        B.add(new Students());
        B.add(new Students());
        System.out.println("---Initially---");
        System.out.println("Number of student with A elective paper: " + A.size());
        System.out.println("Number of student with C elective paper: " + B.size());
        System.out.println("--------------\n");
        B.add((Students)A.remove(0));
        B.add((Students)A.remove(0));
        A.add((Students)B.remove(0));
        A.add((Students)B.remove(0));
        System.out.println("Two students switch there paper from A to B and simultaneously from B to A\n");
        System.out.println("---Now---");
        System.out.println("Number of student with A elective paper: " + A.size());
        System.out.println("Number of student with C elective paper: " + B.size());
        System.out.println("---------");
    }
}
