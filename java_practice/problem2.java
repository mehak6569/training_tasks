import java.util.Scanner;
import java.io.*;

/*
Alex, Nikil and Sam are three friends playing the ludo game. 
After completing one round they note their points and at the end of the day they calculate the points. 
The one who scores the highest will be considered as the winner. Write a Java program to find who scores the 
highest points and display the output. 

Requirements: The points should be between 0 and 50 (both inclusive), 
else print “<points> is an invalid number’. After finding the winner, 
print “<Name> scores <Points> points and wins the game”. 
Note: In the Sample Input / Output provided, the highlighted text in bold corresponds to the input given by 
the user, and the rest of the text represents the output. Ensure to follow the object-oriented specifications
provided in the question description. Ensure to provide the names for classes, attributes, and methods as 
specified in the question description. Adhere to the code template, if provided. Please do not use System.
exit(0) to terminate the program. 

Sample Input/Output 1: Enter Alex points 10 Enter Nikil points 12 Enter Sam points 25 Sam scored 25 points and 
won the game 
Sample Input/Output 2 Enter Alex points 10 Enter Nikil points -5 -5 is an invalid number 
Sample Input/Output 3 Enter Alex points 60 60 is an invalid number
*/



public class problem2 {
    public static void main(String[] args) {
        int alex, nikil, sam;
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Alex points: ");
        alex = sc.nextInt();

        if(alex < 0 || alex > 50) {
            System.out.println(alex + " is an invalid number");
            System.exit(0);
        }
        
        System.out.print("Enter Nikil points: ");
        nikil = sc.nextInt();

        if(nikil < 0 || nikil > 50) {
            System.out.println(nikil + " is an invalid number");
            System.exit(0);
        }

        System.out.print("Enter Sam points: ");
        sam = sc.nextInt();

        if(sam < 0 || sam > 50) {
            System.out.println(sam + " is an invalid number");
            System.exit(0);
        }


        
        if(alex > nikil && alex > sam) {
            System.out.println("Alex scored " + alex + " points and wins the game.");
        }
        else if(nikil > alex && nikil > sam) {
            System.out.println("Nikil scored " + nikil + " points and wins the game.");
        }
        else if(sam > alex && sam > nikil) {
            System.out.println("Sam scored " + sam + " points and wins the game.");
        }

    }


    
}
