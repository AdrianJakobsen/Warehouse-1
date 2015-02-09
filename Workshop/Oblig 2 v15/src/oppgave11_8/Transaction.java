package oppgave11_8;

import java.util.Date;

public class Transaction {
	
	protected Date date;
	protected char typeOfTransaction;
	protected double amount;
	protected double balance;
	protected String description;
	
	public Transaction(){
	}
	
	public Transaction(char type, double amount, double balance, String description){
		this.typeOfTransaction = type;
		this.amount = amount;
		this.balance = balance;
		this.description = description;
	}
	public Date getDate(){
		return date;
	}
}
