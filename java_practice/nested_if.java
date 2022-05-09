import java.util.Scanner;

public class nested_if {
    public static void main (String[] args){
        int a;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        a = sc.nextInt();

        if(a>=0){
            if(a<10){
                System.out.println("less than 10");
            }
            else{
                System.out.println("greater than 10");
            }
        }
        else{
            System.out.println("less than 0");
        }
    }
    
}
