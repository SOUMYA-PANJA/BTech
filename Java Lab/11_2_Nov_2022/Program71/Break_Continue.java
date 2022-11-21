public class Break_Continue {
    public static void main(String[] args) { // Break and continue using if-else and do-while loops
        int i = 0;
        for (i = 0; i < 50; i++) {
            System.out.println(i);
            System.out.println("Breaking the law (loop)! \n");
            if (i == 2) {
                System.out.println("Ending the loop. \n");
                break;
            }
        } // int i=0;
        do {
            System.out.println(i);
            System.out.println("Again breaking the law (loop)! \n");
            if (i == 2) {
                System.out.println("Ending the loop. \n");
                break;
            }
            i++;
        } while (i < 5);
        System.out.println("Loop ends here. \n");
        for (i = 0; i < 50; i++) {
            if (i == 2) {
                System.out.println("Ending the loop. \n");
                continue;
            }
            System.out.println(i);
            System.out.println("Continuing the law (loop)! \n");
        } // int i=0;
        do {
            i++;
            if (i == 2) {
                System.out.println("Ending the loop. \n");
                continue;
            }
            System.out.println(i);
            System.out.println("Again continuing the law (loop)! \n");
        } while (i < 5);
        System.out.println("Loop ends here. \n");
    }
}