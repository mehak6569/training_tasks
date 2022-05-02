import java.io.*;

public class squareRoots {
    public static void main(String[] args) {
        int a, b, c, d;
        double r1, r2;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        try{
            System.out.print("Enter a: ");
            a = Integer.parseInt(br.readLine());

            System.out.print("Enter b: ");
            b = Integer.parseInt(br.readLine());

            System.out.print("Enter c: ");
            c = Integer.parseInt(br.readLine());

            d = b*b - 4*a*c;

            if (d >= 0) {
                r1 = (-b + Math.sqrt(d)) / (2*a);
                r2 = (-b - Math.sqrt(d)) / (2*a);
                System.out.println("The roots are " + r1 + " and " + r2);
            }
            else {
                System.out.println("The roots are imaginary");
            }
        } catch (IOException e) {
            System.out.println("IOException");
        }
    }
}