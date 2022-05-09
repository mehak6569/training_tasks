import java.io.*;

public class if_else_if {
    public static void main(String[] args){
        double x;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        try {
            System.out.print("Enter your percentage: ");
            x = Double.parseDouble(br.readLine());

            if(x >= 90) {
                System.out.println("Excellent");
            }
            else if(x >= 80) {
                System.out.println("Very Good");
            }
            else if(x >= 70) {
                System.out.println("Good");
            }
            else if(x >= 60) {
                System.out.println("Average");
            }
            else {
                System.out.println("Fail");
            }
        } catch (Exception e){}
    }
}
