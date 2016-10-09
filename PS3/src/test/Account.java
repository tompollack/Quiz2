package test;
import java.util.Date;

public class Account 
{
	private int id;
	private double balance;
	private double annualInterestRate;
	private Date dateCreated;
	
	public Account()
	{
		annualInterestRate = 0;
		dateCreated = new Date();
	}
	public Account(int i, double b)
	{
		id = i;
		balance = b;
		annualInterestRate = 0;
		dateCreated = new Date();
	}
	
	public int getId()
	{
		return id;
	}
	public double getBalance()
	{
		return balance;
	}
	public double getAIR()
	{
		return annualInterestRate;
	}
	
	public void setId(int i)
	{
		id=i;
	}
	public void setBalance(double b)
	{
		balance = b;
	}
	public void setAIR(double a)
	{
		annualInterestRate = a;
	}
	public Date getDate()
	{
		return dateCreated;
	}
	public double getMonthlyInterestRate()
	{
		return annualInterestRate/12;
	}
	public void withdraw(double w)throws InsufficientFundsException
	{
		if ((balance-w) <= 0)
			throw new InsufficientFundsException(w);
		else
			balance-=w;
	}
	public void deposit(double w)
	{
		balance+=w;
	}
}