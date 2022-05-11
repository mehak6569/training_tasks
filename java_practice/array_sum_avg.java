import java.util.Scanner;

public class array_sum_avg {
    public static void main(String[] args){
        int a[] = new int[5];
        Scanner sc = new Scanner(System.in);
        for(int i = 0; i < 5; i++) {
            System.out.print("Enter a number : ");
            a[i] = sc.nextInt();
        }
        int sum = 0;
        for (int i = 0; i < 5; i++){
            sum = sum + a[i];
        }
        System.out.println("Sum of all elements is : " + sum);

        int avg = sum / a.length;
        System.out.println("Average of all elements is : " + avg);
    }
}
