package fr.epita.bank.Launcher;

import fr.epita.bank.datamodel.Customer;
import fr.epita.bank.datamodel.SavingAccount;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Launcher {
    public static void main(String[] args) {

        System.out.println("Hello, Welcome to the Application");
        System.out.println("Please create the user's account details");


        // Asking userdetails from sout and then using scanner to read from console.
        //First user name

        System.out.println("user name:");
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();


        // address for that user
        System.out.println("address of a user:");
        String address = scanner.nextLine();

        // Now, creating a new customer and assigning that value of name and address

        Customer customer = new Customer(name, address);

        System.out.println("Please input the initial balance of a saving account: ");
        double initialBalance = 0;
        String rawBalance = scanner.nextLine();
        try{
            initialBalance = Double.parseDouble(rawBalance);

        }catch (Exception e) {
            e.printStackTrace();
            System.out.println("Insert valid value");
        }

        double initialInterestRate = 0.0005;
        System.out.println("Please insert the interest rate: ");
        double interest = scanner.nextDouble();

        SavingAccount savingAccount = new SavingAccount(initialBalance, initialInterestRate);



        System.out.println("What amount you like to withdraw?: ");
        try{
            int amount = scanner.nextInt();
            savingAccount.withDraw(amount);
        }catch (Exception e){
            System.out.println("Cannot withdraw in  point");
        }

        double  interests = savingAccount.computeInterest();
        System.out.println(interests);


    }
}


//    Create a runnable program in Java
//    Read data from a formatted file and deserialize them in the appropriate data structure using Java
//    UML Class Diagram design
//    Create services to delegate Business Logic implementation
//    Choose the appropriate Java Data Structure to solve a Business Logic requirement
//    Run a statement against a database using Java
//    Define a strategy to handle data access and implement it using Java
//    Implement a complete MCD in Java
//    Setup a complete data access layer in Java to match business requirements