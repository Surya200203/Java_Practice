package Project.SimpleATMMachine;

import java.util.Scanner;

class ATM{

    double balance;
    int pin = 1234;

    public void checkPin(int pin){
        if(this.pin == pin){
            menu();
        }else{
            System.out.println("Wrong Pin ... Try Again");
        }
    }

    public void menu(){
        System.out.println("1. Check Balance");
        System.out.println("2. Withdraw Money");
        System.out.println("3. Deposit Money");
        System.out.println("4. Exit");
        System.out.println("Enter your choice :- ");

        Scanner sc = new Scanner(System.in);
        int choice = sc.nextInt();

        switch (choice){
            case 1:
                checkBalance();
                break;
            case 2:
                withdrawMoney();
                break;
            case 3:
                depositMoney();
                break;
            case 4:
                exit();
                break;
            default:
                System.out.println("You entered wrong choice ... enter again..");
                menu();
        }
    }

    public void checkBalance(){
        System.out.println("Balance :- "+balance);
        menu();
    }

    public void withdrawMoney(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter amount to withdraw :- ");
        int amount = sc. nextInt();

        if(amount < balance ){
            balance -= amount;
            System.out.println("Amount withdraw successfully");
        }else{
            System.out.println("Insufficient Balance !");
        }
        menu();
    }

    public void depositMoney(){
        System.out.println("Enter amount to deposit :- ");
        Scanner sc =  new Scanner(System.in);
        int deposit_amount =  sc.nextInt();

        balance += deposit_amount;
        menu();
    }

    public void exit(){
        System.out.println("THANK YOU");
    }
}



public class MainClass {
    public static void main(String[] args) {
        ATM atm = new ATM();
        Scanner sc =  new Scanner(System.in);
        System.out.println("WELCOME");
        System.out.println("Enter your PIN  : ");
        int pin = sc.nextInt();
        atm.checkPin(pin);
    }

}
