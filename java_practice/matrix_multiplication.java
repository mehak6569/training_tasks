// Matrix Multiplication

import java.util.Scanner;

public class matrix_multiplication {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m, n, p, q;
        System.out.println("Enter the number of rows and columns of first matrix : ");
        m = sc.nextInt();
        n = sc.nextInt();
        System.out.println("Enter the number of rows and columns of second matrix : ");
        p = sc.nextInt();
        q = sc.nextInt();

        if(n != p) {
            System.out.println("Multiplication not possible");
            return;
        }

        int a[][] = new int[m][n];
        int b[][] = new int[p][q];
        int c[][] = new int[m][q];

        System.out.println("Enter the elements of first matrix : ");
        for(int i = 0; i < m; i++) {
            for(int j = 0; j < n; j++) {
                System.out.print("Enter a number : ");
                a[i][j] = sc.nextInt();
            }
        }

        System.out.println("\nEnter the elements of second matrix : ");
        for(int i = 0; i < p; i++) {
            for(int j = 0; j < q; j++) {
                System.out.print("Enter a number : ");
                b[i][j] = sc.nextInt();
            }
        }

        for(int i = 0; i<m; i++) {
            for(int j=0; j<q; j++) {
                c[i][j] = 0;
                for(int k = 0; k<n; k++) {
                    c[i][j] = c[i][j] + (a[i][k] * b[k][j]);
                }
            }
        }

        System.out.println("\nMultiplication of the two matrices : ");
        for(int i = 0; i < m; i++) {
            for(int j = 0; j < q; j++) {
                System.out.print(c[i][j] + " ");
            }
            System.out.println();
        }
    }

}
