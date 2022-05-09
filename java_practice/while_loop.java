import java.util.Scanner;

public class while_loop {
    public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        n = sc.nextInt();

        int rev = 0;
        int temp = n;
        while (temp != 0) {
            rev = rev * 10;
            rev = rev + temp % 10;
            temp = temp / 10;
        }

        System.out.println("Reverse of " + n + " is " + rev);
    }
}
