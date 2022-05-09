import java.util.Scanner;

public class if_else_menu {
    public static void main(String[] args){
        int choice;
        double a, b;
        Scanner sc = new Scanner(System.in);
        System.out.println("1. Addition \n2. Subtraction \n3. Multiplication \n4. Division \n5. Exit");
        

        do {
            System.out.println("\nEnter your choice (1-5):");
            choice = sc.nextInt();
            

            if (choice == 5){
                System.out.println("Goodbye!");
            }

            else{
                System.out.println("Enter two numbers: ");
                a = sc.nextDouble();
                b = sc.nextDouble();

                if (choice == 1){
                    System.out.println("The sum is: " + (a + b));
                }
                else if (choice == 2){
                    System.out.println("The difference is: " + (a - b));
                }
                else if (choice == 3){
                    System.out.println("The product is: " + (a * b));
                }
                else if (choice == 4){
                    System.out.println("The quotient is: " + (a / b));
                }
                else {
                    System.out.println("Invalid choice!");
                }
            }
        } while(choice != 5);

    }
    
}
