import java.util.Scanner;

public class function_intro {
    static int sum(int x, int y) {
        return (x + y);
    }

    static int sum(int x, int y, int z) {
        return (x + y + z);
    }

    static double sum(double x, double y) {
        return (x + y);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter two integers : ");
        int x = sc.nextInt();
        int y = sc.nextInt();

        System.out.println("Sum is : " + sum(x, y));

        double a = 10.6;
        double b = 34.64;
        System.out.println("Sum is : " + sum(a, b));

        System.out.print("Enter three integers : ");
        int x1 = sc.nextInt();
        int y1 = sc.nextInt();
        int z1 = sc.nextInt();

        System.out.println("Sum is : " + sum(x1, y1, z1));




    }

}
