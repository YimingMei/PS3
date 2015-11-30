import java.util.Date;	
import java.text.Date;

public class Account {
	private int id = 0;
	private double balance = 0;
	private double annualInterestRate = 0;
	private Date dateCreated;

	//A no-arg constructor
	Account(){
	}
	
	//A constructor with the specified id and initial balance
	Account(int newId, double newBalance, double newAnnualInterestRate) {
	    id = newId;
	    balance = newBalance;
	    annualInterestRate = newAnnualInterestRate;
	}
	
	//Accessor and mutator methods for id, balance, and annualInterestRate 
	public int getId() {
	    return id;
	}
	public double getBalance() {
	    return balance;
	}
	public double getAnnualInterestRate() {
	    return annualInterestRate;
	}
	public void setId(int newId) {
	    id = newId;
	}
	public void setBalance(double newBalance) {
	    balance = newBalance;
	}
	public void setAnnualInterestRate(double newAnnualInterestRate) {
	    annualInterestRate = newAnnualInterestRate;
	}

	//Accessor method for dateCreated
	public void setDateCreated(Date newDateCreated) {
	    dateCreated = newDateCreated;
	}
	
	//Define the methods
	double getMonthlyInterestRate() {
	    return annualInterestRate/12;
	}
	
	double withdraw(double amount) {
	    return balance -= amount;
	}   
	
	double deposit(double amount) {
	    return balance += amount;   
	}
	

}
	

