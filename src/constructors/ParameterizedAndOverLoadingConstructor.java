package constructors;

public class ParameterizedAndOverLoadingConstructor {

    public static void main(String args[]){

        new ParameterizedAndOverLoadingConstructor("Java");
        new ParameterizedAndOverLoadingConstructor("Python", 2);
    }

    public ParameterizedAndOverLoadingConstructor(String language){
        System.out.println("Language chosen is " +language);
    }

    public ParameterizedAndOverLoadingConstructor(String language, int preference){
        System.out.println(language  + " language is chosen as preference " + preference );
    }
}
