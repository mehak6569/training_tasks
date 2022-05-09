// Rahul is planning to buy a new sim card for his new phone. He wishes to buy a phone number where
// sum of odd numbers in phone number must be equal to the even numbers present in the phone number.
// Write a Java code to help him to find the right phone number. 

// Requirements: · Use long datatype for Phone number. · 

// If the sum of the odd numbers and sum of the even numbers in the phone number are equal, 
// print as “Sum of odd and even are equal”. · 

// If the sum of the even numbers is greater than the sum of the odd numbers in the phone number, 
// then print as “Sum of even is greater than sum of odd”. ·

// If the sum of the odd numbers is greater than the sum of the even numbers in the phone number, 
// then print as “Sum of odd is greater than sum of even”. 

import java.util.Scanner;

public class problem1 {
    public static void main(String[] args) {
        long phoneNumber;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a phone number: ");
        phoneNumber = sc.nextLong();

        int odd_sum = 0 , even_sum = 0;

        while (phoneNumber != 0) {
            if (phoneNumber % 2 == 0) {
                even_sum = even_sum + (int) (phoneNumber % 10);
            } 
            else {
                odd_sum = odd_sum + (int) (phoneNumber % 10);
            }
            phoneNumber = phoneNumber / 10;
        }

        if(odd_sum == even_sum) {
            System.out.println("Sum of odd and even are equal.");
        }

        else if(odd_sum > even_sum) {
            System.out.println("Sum of odd is greater than sum of even.");
        }

        else {
            System.out.println("Sum of even is greater than sum of odd.");
        }
    }


    
}
