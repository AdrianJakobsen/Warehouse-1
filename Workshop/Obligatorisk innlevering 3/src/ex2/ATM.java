package ex2;

import java.util.Scanner;


public class ATM {
	static Account[] arrayOfAccounts;
	static Account account = new Account();

	public static void main(String[] args) {

		arrayOfAccounts = new Account[10];
		for(int i = 0; i<arrayOfAccounts.length; i++){
			arrayOfAccounts[i] = new Account(500.0);
		}
		Scanner scan = new Scanner(System.in);

		boolean exit = true;

		while(exit == true){
			System.out.println("Enter an id: ");
			int id = scan.nextInt()-1;
			boolean menu = true;

			if(id<arrayOfAccounts.length && id>=0){
				for(int j = 0; j<arrayOfAccounts.length; j++){
					account = arrayOfAccounts[id];

					while(menu == true){

						System.out.println("Main menu: \n1: check balance \n2: withdraw");
						System.out.println("3: deposit \n4:exit \nEnter a choice: ");
						int choice = scan.nextInt(); 
						switch(choice){

						case 1: 
							System.out.println("The current balance is: " + account.getBalance()+"\n");
							break;
						case 2: 
							System.out.println("Enter an amount to withdraw: ");
							double withdrawAmount = scan.nextDouble();
							if((account.getBalance()-withdrawAmount)<0){
								System.out.println("The amount you try to withdraw is more than is on the account.\n");
								break;
							}else{
								account.withdraw(withdrawAmount);
								break;
							}
						case 3: 
							System.out.println("Enter an amount to deposit: ");
							double depositAmount = scan.nextDouble();
							account.deposit(depositAmount);
							break;
						case 4:
							menu = false;
							break;
						default:
							System.out.println("Invalid command\n");
							break;
						}
					}
				}
			}
			else{
				System.out.println("The selected account does not exist\n");
				break;

			}
		}
	}
}
