package oppgave11_8;

import java.util.ArrayList;
import java.util.Date;

public class Account extends Transaction {
	private int id;
	private double balance;
	private double annualIntrestRate;
	private String name;
	private ArrayList<Transaction> transactions = new ArrayList();
	
	private Date dateCreated;

	public Account(){
		id = 0;
		balance = 0;
		annualIntrestRate = 0.0;
		name = "jon doe";
		dateCreated = new Date();
		
	}
	public Account(int id, double balance, String name){
		this.id = id;
		this.balance= balance;
		annualIntrestRate = 0.0;
		this.name = name;
		dateCreated = new Date();
	}
	public Account(double balance){
		id =0;
		this.balance = balance;
		annualIntrestRate= 0.0;
		
		dateCreated = new Date();
	}
	public int getId(){
		return id;
	}
	public double getBalance(){
		return balance;
	}
	public double getAnnualIntrestRate(){
		return annualIntrestRate;
	}
	public Date getDateCreated(){
		return dateCreated;
	}
	public void setId(int id){
		this.id = id;
	}
	public void setBalance(double balance){
		this.balance = balance;
	}
	public void setAnnualIntrestRate(double annualIntrestRate){
		this.annualIntrestRate = annualIntrestRate;
	}
	public void deposit(double deposit, String description){
		double newBalance = balance + deposit;
		setBalance(newBalance);
		transactions.add(new Transaction('D', deposit, newBalance, description));
	}
	public void withdraw(double withdraw, String description){
		double newBalance = balance - withdraw;
		setBalance(newBalance);
		transactions.add(new Transaction('W', withdraw, newBalance, description));
	}
	public String getName(){
		return name;
	}
	public void setName(String name){
		this.name=name;
	}
	public ArrayList<Transaction> getTransaction(){
		return transactions;
	}
}