import java.util.Scanner;

public class menu_grade {
    public static void main(String[] args){
        double eng, math, sci, hindi, sst, total, percent;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter marks of English (out of 100): ");
        eng = sc.nextDouble();

        System.out.print("Enter marks of Math (out of 100): ");
        math = sc.nextDouble();

        System.out.print("Enter marks of Science (out of 100): ");
        sci = sc.nextDouble();

        System.out.print("Enter marks of Hindi (out of 100): ");
        hindi = sc.nextDouble();

        System.out.print("Enter marks of SST (out of 100): ");
        sst = sc.nextDouble();

        total = eng + math + sci + hindi + sst;
        percent = (total / 5);

        System.out.println("Total marks: " + total + "/500.0");    
        System.out.println("Percentage: " + percent);

        if(percent >= 90) {
            System.out.println("Grade: A");
        }
        else if(percent >= 80) {
            System.out.println("Grade: B");
        }
        else if(percent >= 70) {
            System.out.println("Grade: C");
        }
        else if(percent >= 60) {
            System.out.println("Grade: D");
        }
        else {
            System.out.println("Fail");
        }

        

        

    }
    
}

