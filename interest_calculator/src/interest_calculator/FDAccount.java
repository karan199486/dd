package interest_calculator;

public class FDAccount extends Account {

	int noOfDays;
	int ageOfACHolder;
	
	public FDAccount(double amount, int noOfDays, int ageOfACHolder) throws Exception
	{
		setNoOfDays(noOfDays);
		setAgeOfACHolder(ageOfACHolder);
		setAmount(amount);
		double ir = calInterestRate();
		setInterestRate(ir);
		
	}
	
	private double calInterestRate() {
		
		double ir = 0;
		if(amount > 10000000)
		{
			if(noOfDays >= 7 && noOfDays <= 14)
				ir = 6.5;
			else if(noOfDays >= 15 && noOfDays <= 29)
				ir = 6.75;
			else if(noOfDays >= 30 && noOfDays <= 45)
				ir = 6.75;
			else if(noOfDays >= 46 && noOfDays <= 60)
				ir = 8;
			else if(noOfDays >= 61 && noOfDays <= 184)
				ir = 8.5;
			else if(noOfDays >= 185 && noOfDays <= 365)
				ir = 10.0;
		}
		else
		{
			
			if(noOfDays >= 7 && noOfDays <= 14)
				ir = 4.5;
			else if(noOfDays >= 15 && noOfDays <= 29)
				ir = 4.75;
			else if(noOfDays >= 30 && noOfDays <= 45)
				ir = 5.5;
			else if(noOfDays >= 46 && noOfDays <= 60)
				ir = 7;
			else if(noOfDays >= 61 && noOfDays <= 184)
				ir = 7.5;
			else if(noOfDays >= 185 && noOfDays <= 365)
				ir = 8;
			
			if(ageOfACHolder > 60)
				ir += 0.5;
		}
			
		return ir;
	}

	public int getNoOfDays() {
		return noOfDays;
	}

	public void setNoOfDays(int noOfDays) throws Exception {
		
		if(noOfDays < 0)
			throw new Exception("negative noOfDays");
		this.noOfDays = noOfDays;
	}

	public int getAgeOfACHolder() {
		return ageOfACHolder;
	}

	public void setAgeOfACHolder(int ageOfACHolder) throws Exception{
		
		if(ageOfACHolder < 0)
			throw new Exception("negative age");
		this.ageOfACHolder = ageOfACHolder;
	}

	
	
	@Override
	double calculateInterest() 
	{
		double interest = amount * interestRate * 0.01;
		return interest;
	}

}
