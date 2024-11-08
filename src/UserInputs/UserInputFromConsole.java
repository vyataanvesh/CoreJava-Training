package UserInputs;

import java.util.Scanner;

public class UserInputFromConsole {

    public static void main(String args[]){

        Scanner scanner = new Scanner(System.in);

        System.out.println("Hello, please provide your name?");
        String name = scanner.nextLine();
        System.out.printf("Hey %s, please provide your age? \n",name);
        int age = scanner.nextInt();
        System.out.printf("Account has been created for %s of age %d \n",name,age);

        scanner.close();
    }
}
