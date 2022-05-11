import java.util.Scanner;

public class palindrome_number {
    public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        n = sc.nextInt();

        int rev = 0;
        int temp = n;
        for ( ; temp != 0; temp = temp / 10) {
            rev = rev * 10;
            rev = rev + temp % 10;
            
        }

        System.out.println("Reverse : "+rev);
        
        if(rev == n) {
            System.out.println(n + " is a palindrome number.");
        }
        else {
            System.out.println(n + " is not a palindrome number.");
        }
    }
}
