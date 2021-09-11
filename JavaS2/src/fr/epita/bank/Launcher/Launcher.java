package fr.epita.bank.Launcher;

import fr.epita.bank.datamodel.Customer;
import fr.epita.bank.datamodel.SavingAccount;

import java.sql.SQLOutput;

public class Launcher {
    public static void main(String[] args) {
//        Customer customer = new Customer();
//        customer.name = "test";
        SavingAccount savingAccount = new SavingAccount(22980, 0.005);
        savingAccount.withDraw(300);

        double  interests = savingAccount.computeInterest();
        System.out.println(interests);


    }
}
