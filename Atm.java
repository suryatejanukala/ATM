package atm;
import java.util.Scanner;
public class Atm implements Bank
{
	Scanner sc = new Scanner(System.in);
	int initialAmount=1000;
	@Override
	public void depoist(int amount)
	{
		if(amount>0)
		{
			System.out.println("The Current Account Balance is : " +initialAmount);
			initialAmount = initialAmount + amount;
			System.out.println("Amount Depoisted Succesfully");
			System.out.println("The Account Balance After Depoist : " +initialAmount);
		}
		else
		{
			try
			{
				throw new InvalidAmountException();
			}
			catch(InvalidAmountException e)
			{
				System.out.println("Please Enter Valid Amount To Depoist");
				amount = sc.nextInt();
			}
		}
	}
	@Override
	public void withDraw(int amount)
	{
		if(initialAmount>0 && amount<=initialAmount)
		{
			System.out.println("The Current Account Balance is : " +initialAmount);
			initialAmount = initialAmount - amount;
			System.out.println("Amount Withdrawn Succesfully");
			System.out.println("The Account Balance After Withdraw : " +initialAmount);
		}
		else
		{
			try 
			{
				throw new InvalidWithDrawAmountException();
			}
			catch(InvalidWithDrawAmountException e)
			{
				System.out.println("Please enter valid amount to Withdraw");
				amount = sc.nextInt();
			}
		}
	}
	@Override
	public void showBalance()
	{
		System.out.println("The Current Account Balance is : " + initialAmount);
	}
}
