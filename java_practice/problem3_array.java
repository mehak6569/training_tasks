import java.util.Scanner;

// WAP to get the two element from an array where the sum is equal to 10

public class problem3_array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter the number of elements in the array : ");
        int n = sc.nextInt();

        int a[] = new int[n];

        for (int i = 0; i < n; i++){
            System.out.print("Enter the element : ");
            a[i] = sc.nextInt();
        }

        for (int i = 0; i < a.length - 1; i++) {
            for (int j = i + 1; j < a.length; j++){
                if (a[i] + a[j] == 10) {
                    System.out.println(a[i] + " + " + a[j] + " = " + (a[i] + a[j]));
                }
            }
        }
        
    }
    
}
