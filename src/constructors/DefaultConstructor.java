package constructors;

public class DefaultConstructor {

    int a;
    String b;

    public static void main(String[] args){
        new DefaultConstructor();
    }
    public DefaultConstructor(){
        System.out.println("This is a default constructor");
        System.out.println("Value of a = " +a);
        System.out.println("Value of b = " +b);
    }
//    In this example, we define a DefaultConstructor class with a default constructor.
//    When we create a new DefaultConstructor object in the main method (new DefaultConstructor();),
//    the default constructor is called, and the statements are printed.
//
//    So, why and when should you use a default constructor?
//    The short answer is: whenever you want to create a new object without passing any initial values.
//    The default constructor allows you to create an object with default values
//    (e.g., null for objects, 0 for numeric types, false for booleans).
}
