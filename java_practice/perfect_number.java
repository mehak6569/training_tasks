import java.util.Scanner;
public class perfect_number {
    public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        n = sc.nextInt();
        int sum = 1;
        for(int i = 2; i <= n/2; i++){
            if(n % i == 0){
                sum = sum + i;
            }
            
        }
        if(sum == n){
            System.out.println(n + " is a perfect number.");
        }
        else{
            System.out.println(n + " is not a perfect number.");
        }
    }

}
