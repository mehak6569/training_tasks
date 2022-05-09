import java.io.*;
import java.util.Scanner;
import java.lang.Math;

public class for_loop {
    public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        n = sc.nextInt();

        int sum = 0; 
        for (int i = 1; i<=n; i++){
            sum = sum + (int) Math.pow(i, i); 
            System.out.println(i + " iteration: " + sum);
        }

        System.out.println("Result : " + sum);

        // System.out.println("Sum of first " + n + " integers : "  + sum);
        // System.out.println("Product of first " + n + " integers : "  + product);
        // System.out.println("Subtraction : "  + diff);
    }
}
