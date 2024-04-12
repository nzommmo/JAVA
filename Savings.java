//Base Class
class Account{
int accountNumber;
String accountHolder;
double Balance;

//Account Constructor to initialize Account data members
Account(int accountnumber,String accountholder,double balance){
accountNumber = accountnumber;
accountHolder = accountholder;
Balance = balance;
}
//Method to deposit money to the account
public void deposit(double amount){
Balance += amount;
}//end of deposit method
//Method to Withdraw money from the account
public void withdraw(double amount){
Balance -= amount;
}//end of withdraw method
}//end of class Account

//SUbclass SavingsAccount
class SavingsAccount extends Account{
double interestRate;
//constructor for SavingsAccount
public SavingsAccount(int accountNumber,String accountHolder,double Balance,double interestRate){
super(accountNumber,accountHolder,Balance);
this.interestRate = interestRate;
}//end of SavingsAccount Constructor
//overriding method
public void deposit(double amount){
super.deposit(amount);
Balance += Balance * (interestRate/100);
}//end of overriding deposit method
public void withdraw(double amount){
super.withdraw(amount);
Balance += Balance;
}//end of withdraw method
}//end of subclass Savings Account

public class Savings{
public static void main(String [] args){
//create a savings account
SavingsAccount savingsAccount = new SavingsAccount(123456,"Eric Nzomo",1000,5);
//Depositing and displaying balance
savingsAccount.deposit(500);
savingsAccount.withdraw(1000);
System.out.println(savingsAccount.accountNumber);
System.out.println(savingsAccount.accountHolder);
System.out.println("Balance after deposit with interest: " + savingsAccount.Balance);


}//end of main method
}//end of main class Savings
