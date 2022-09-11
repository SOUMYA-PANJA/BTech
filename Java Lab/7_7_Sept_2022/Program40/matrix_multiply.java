import java.util.Scanner;

public class matrix_multiply {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum = 0;
        System.out.print("Enter dimentsions for A: ");
        int rowsA = sc.nextInt();
        int colsA = sc.nextInt();
        int a[][] = new int[rowsA][colsA];

        System.out.println("Enter elements of A:");
        for (int i = 0; i < rowsA; i++) {
            for (int j = 0; j < colsA; j++) {
                a[i][j] = sc.nextInt();
            }
        }
        System.out.print("Enter dimentsions for B: ");
        int rowsB = sc.nextInt();
        int colsB = sc.nextInt();
        int b[][] = new int[rowsB][colsB];
        int c[][] = new int[rowsA][colsB];
        if(colsA != rowsB){
            System.out.println("These matrix can't be multiplied with each other.");
        }
        else {
            System.out.println("Enter elements of B:");
            for (int i = 0; i < rowsB; i++) {
                for (int j = 0; j < colsB; j++) {
                    b[i][j] = sc.nextInt();
                }
            }
            for (int i = 0; i < rowsA; i++) {
                for (int j = 0; j < colsB; j++) {
                    for (int k = 0; k < rowsB; k++) {
                        sum = sum+a[i][k]*b[k][j];
                    }
                    c[i][j] = sum;
                    sum = 0;
                }
            }
            System.out.println("Matrix A * Matrix B");
            for (int i = 0; i < rowsA; i++) {
                for (int j = 0; j < colsB; j++) {
                    System.out.print(c[i][j]+" ");
                }
                System.out.println();
            }
        }
    }
}
