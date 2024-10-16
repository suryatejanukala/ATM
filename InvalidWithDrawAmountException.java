package atm;

public class InvalidWithDrawAmountException extends RuntimeException
{
	public String toString()
	{
		return getClass() + " Invalid valid amount to withdraw";
	}
}
