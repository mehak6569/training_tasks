import java.io.*;
import java.util.Scanner;

public class break_condition {
    public static void main(String[] args) {
        for (int i=1; i<=10; i++) {
            if (i == 3) {
                continue;
            }   
            if (i == 8 ) {
                break;
            }
            System.out.println(i);
        }
    }


}
