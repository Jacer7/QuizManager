package fr.epita.bank.datamodel;

public class SavingAccount extends Account {

    double  interestRate;

    public double computeInterest(){
        return interestRate * balance;
    }

    public void withDraw(int moneyAmount){
        balance = balance - moneyAmount;
    }

   public SavingAccount(double initialBalance, double initialInterestRate){
        balance = initialBalance;
        interestRate = initialInterestRate;

   }

   // it's a rule in java that once there is empty in the .... then we need create an empty....
   public SavingAccount(){

   }

}

