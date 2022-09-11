public class All_For_Loops {
    public static void main(String[] args) {
        float[] marks ={98.5f, 89.5f, 99.5f, 86.5f};
        String[] students = {"Mike", "Bob", "Dustin", "Will"};
        System.out.println("Number of Students are:"+students.length+"\n");
        System.out.println(students[0]);
        System.out.println(students[1]);
        System.out.println(students[2]);
        System.out.println(students[3]);
        System.out.println("\n");

        System.out.println("Printing Marks using Naive Way: \n");
        System.out.println(marks[0]);
        System.out.println(marks[1]);
        System.out.println(marks[2]);
        System.out.println(marks[3]);
        System.out.println("\n");

        System.out.println("Printing Marks using General for Loop: \n");
        for (int i = 0; i < marks.length; i++) {
            System.out.println(marks[i]);
        }
        System.out.println("\n");

        System.out.println("Printing Marks using for Loop in Reverse Order: \n");
        for (int i = (marks.length - 1); i >= 0; i--) {
            System.out.println(marks[i]);
        }
        System.out.println("\n");

        System.out.println("Printing Marks using for each Loop: \n");
        for(float element: marks){
            System.out.println(element);
        }
    }
}
