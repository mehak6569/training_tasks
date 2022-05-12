// Class creation
// Constructor 
// Method overloading


class MyType {
    int x;
    String name;
    MyType() {
        System.out.println("Constructor called");
    }
    
    MyType(int x) {
        this.x = x;
        System.out.println("Parameterised constructor " + x);
    }

    MyType(String name){
        this.name = name;
        System.out.println("Parameterised constructor called for name " + name);
    }
}

public class class_intro {
    public static void main(String[] args) {
        MyType obj = new MyType();
    }
    
}


