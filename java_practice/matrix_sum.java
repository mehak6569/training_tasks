import java.util.Scanner;

public class matrix_sum {
    public static void main(String[] args) {
        int a[][] = new int[2][2];
        int b[][] = new int[2][2];
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the elements of first matrix : ");
        for(int i = 0; i < a.length; i++) {
            for(int j = 0; j < a.length; j++) {
                System.out.print("Enter a number : ");
                a[i][j] = sc.nextInt();
            }
        }

        System.out.println("\nEnter the elements of second matrix : ");
        for(int i = 0; i < b.length; i++) {
            for(int j = 0; j < b.length; j++) {
                System.out.print("Enter a number : ");
                b[i][j] = sc.nextInt();
            }
        }
        

        System.out.println("\nSum of the two matrices : ");
        for(int i = 0; i < 2; i++) {
            for(int j = 0; j < 2; j++) {
                System.out.print(a[i][j] + b[i][j] + " ");
            }
            System.out.println();
        }
    }

    
}
