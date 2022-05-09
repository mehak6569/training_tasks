//Use if-else to find greatest between three numbers
import java.util.Scanner;

public class hw1 {
    public static void main(String[] args){
        int a, b, c, max;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter three numbers: ");
        
        a = sc.nextInt();
        b = sc.nextInt();
        c = sc.nextInt();
        if (a > b && a > c) {
            max = a;
        }
        else if (b > a && b > c) {
            max = b;
        }
        else {
            max = c;
        }

        System.out.println("The greatest number is: " + max);
    }
}
