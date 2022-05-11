import java.util.Scanner;

public class array_intro {
    public static void main(String[] args) {
        int a[] = new int[5];
        Scanner sc = new Scanner(System.in);
        for(int i = 0; i < 5; i++) {
            System.out.print("Enter a number : ");
            a[i] = sc.nextInt();
        }
        System.out.println("Array elements are :- ");
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + ", ");
        }
    }
}
