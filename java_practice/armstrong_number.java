import java.util.Scanner;

public class armstrong_number {
    public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        n = sc.nextInt();
        int len = String.valueOf(n).length();

        int sum = 0;
        int temp = n;
        while(temp > 0) {
            int x = temp % 10;
            sum = sum + (int) Math.pow(x, len);
            temp = temp / 10;
        }

        if(sum == n) {
            System.out.println(n + " is an Armstrong number.");
        }
        else {
            System.out.println(n + " is not an Armstrong number.");
        }
    }


    
}
