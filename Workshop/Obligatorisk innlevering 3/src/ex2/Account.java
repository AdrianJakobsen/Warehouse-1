package ex2;

import java.util.Date;

public class Account {
	private int id;
	private double balance;
	private double annualIntrestRate;

	private Date dateCreated;

	public Account(){
		id = 0;
		balance = 0;
		annualIntrestRate = 0.0;

		dateCreated = new Date();
	}
	public Account(int id, double balance){
		this.id = id;
		this.balance= balance;
		annualIntrestRate = 0.0;

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
	public void deposit(double deposit){
		double newBalance = balance + deposit;
		setBalance(newBalance);
	}
	public void withdraw(double withdraw){
		double newBalance = balance - withdraw;
		setBalance(newBalance);
	}
}