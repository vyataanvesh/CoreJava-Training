package methods;

public class Bank {

     int currentBalanceAmount = 500;

    public static void main(String[] args) {

        greetCustomer("Mr.Test");

        Bank bankObject = new Bank();

        System.out.println("Total available balance is $" +bankObject.getCurrentBalanceAmount());
        System.out.println("Total Amount deposited is $" + bankObject.deposit(500));
        System.out.println("Total available balance is $" +bankObject.getCurrentBalanceAmount());
        System.out.println("Withdrawal amount is $" +bankObject.withdrawal(100) + " and remaining total balance is $" + bankObject.getCurrentBalanceAmount());

    }

    public static void greetCustomer(String name){
        System.out.println("Hello " +name  +" Welcome");
    }

    public int getCurrentBalanceAmount(){
        return currentBalanceAmount;
    }

    public int deposit(int depositAmount){
        currentBalanceAmount = currentBalanceAmount + depositAmount;
        return depositAmount;
    }

    public int withdrawal(int withdrawalAmount){
        currentBalanceAmount = currentBalanceAmount - withdrawalAmount;
        return withdrawalAmount;
    }

}