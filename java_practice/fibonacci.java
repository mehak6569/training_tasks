import java.util.Scanner;
public class fibonacci {
    public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : ");
        n = sc.nextInt();

        int a = 0;
        int b = 1;
        int c = 0;

        System.out.print(a + " " + b );
    
        for (int i = 2; i < n; i++) {
            c = a + b;
            a = b;
            b = c;
            System.out.print(" " + c);
        }
    }

}
