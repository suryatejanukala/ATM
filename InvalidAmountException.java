package atm;

public class InvalidAmountException extends RuntimeException
{
	public String toString()
	{
		return getClass() +" Invalid Amount Exception ";
	}
}
