import java.util.Scanner;

// WAP to get the maximum sum of two element from the array 

public class problem4_array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter the number of elements in the array : ");
        int n = sc.nextInt();

        int a[] = new int[n];

        for (int i = 0; i < n; i++){
            System.out.print("Enter the element : ");
            a[i] = sc.nextInt();
        }

        int max_sum = 0;
        

        for (int i = 0; i < a.length - 1; i++) {
            for (int j = i + 1; j < a.length; j++){
                if (a[i] + a[j] > max_sum) {
                    max_sum = a[i] + a[j];
                }
            }
        }
        System.out.println("Maximum sum is : " + max_sum);
    }
    
}
