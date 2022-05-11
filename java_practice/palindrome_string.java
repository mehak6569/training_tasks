import java.io.*;
public class palindrome_string {
    public static void main(String[] args) {
        String str = "";

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        try {
            System.out.print("Enter a string: ");
            str = br.readLine();

            String rev = "";
            for (int i = str.length() - 1; i >= 0; i--) {
                rev = rev + str.charAt(i);
            }

            if (str.equals(rev)) {
                System.out.println("The string is a palindrome.");
            } else {
                System.out.println("The string is not a palindrome.");
            }
        } catch (Exception e){}

    }

}
