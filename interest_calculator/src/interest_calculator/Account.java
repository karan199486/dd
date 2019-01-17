package interest_calculator;

public abstract class Account 
{
	double interestRate;
	double amount;
	
	public Account() {}
	
	public Account(double interestRate, double amount) throws Exception
	{
		setInterestRate(interestRate);
		setAmount(amount);
	}
	
	public double getInterestRate() {
		return interestRate;
	}

	public void setInterestRate(double interestRate) throws Exception
	{
		
		if(interestRate < 0)
		{
			throw new Exception("negative interestrate");
		}
		this.interestRate = interestRate;
	}

	public double getAmount() {
		return amount;
	}

	public void setAmount(double amount) throws Exception
	{
		if(amount < 0)
		{
			throw new Exception("negative amount");
		}
		this.amount = amount;
	}

	abstract double calculateInterest();
}
