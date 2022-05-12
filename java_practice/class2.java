class Student {
    int roll_no;
    String name;
    String qual;

    Student(int roll_no, String name, String qual) {
        this.roll_no = roll_no;
        this.name = name;
        this.qual = qual;
    }

    void display() {
        System.out.println("Roll Number : " + roll_no);
        System.out.println("Name : " + name);
        System.out.println("Qualification : " + qual);
    }
}

public class class2 {
    public static void main(String[] args) {
        Student student1 = new Student(1, "John", "MCA");
        Student student2 = new Student(2, "Mary", "BCA");

        student1.display();
        System.out.println("\n");
        student2.display();
        
    }
}
