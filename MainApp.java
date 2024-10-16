package atm;

import java.util.Scanner;

public class MainApp 
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		Bank d = new Atm(); // UPCASTING
//		Atm b = new Atm(); // Object Creation
		boolean start = true;
		while(start)
		{
			System.out.println("Welcome To The ATM");
			System.out.println("Press 1 To Withdraw the amount");
			System.out.println("Press 2 To Depoist the amount");
			System.out.println("Press 3 To Show the balance");
			System.out.println("Press 4 To Exit");
			int n = sc.nextInt();
			{
				switch(n)
				{
					case 1: 
					{
						System.out.println("You have choosen the withdraw");
						System.out.println("Please enter the amount to withdraw");
						int amount = sc.nextInt();
						//b.withDraw(amount);
						d.withDraw(amount);
					}
					break;
					case 2: 
					{
						System.out.println("You have choosen the Depoist");
						System.out.println("Please enter the amount to Depoist");
						int amount = sc.nextInt();
						//b.depoist(amount);
						d.depoist(amount);
					}
					break;
					case 3:
					{
						System.out.println("You have choosen the Show Balance ");
						//b.showBalance();
						d.showBalance();
					}
					break;
					case 4:
					{
						start = false;
						System.out.println("Thank you! Please visit again");
					}
					break;
					default : System.out.println("Please enter the valid value");
				}
			}
		}
		sc.close();
	}
}
