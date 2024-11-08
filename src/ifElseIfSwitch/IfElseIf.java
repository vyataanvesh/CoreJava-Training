package ifElseIfSwitch;

import java.util.Scanner;

public class IfElseIf {
    public static void main(String args[]) {

        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        int age = scanner.nextInt();

        if (age < 21)
            System.out.printf("%s of age %d is below prescribed agelimit of 21-35\n",name, age);
        else if (age > 35) {
            System.out.printf("%s of age %d is above prescribed agelimit of 21-35\n", name, age);


        }

        else{
            System.out.printf("%s of age %d is in prescribed agelimit of 21-35\n",name, age);
            System.out.printf(" extra statement %s of age %d is below prescribed agelimit of 21\n",name, age);
        }
    }
}
