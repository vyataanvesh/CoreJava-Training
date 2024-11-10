package constructors;

public class ValidationsInConstructor {

    int age = 13;
    public static void main(String args[]){
        new ValidationsInConstructor();
    }

    public ValidationsInConstructor(){
        if(age < 21){
            System.out.println("Below approved age limit");
        }
    }
}
