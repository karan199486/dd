package interest_calculator;

public class RDAccount extends Account {
	
	int noOfDays;
	int age;

	public void setNoOfDays(int noOfDays) throws Exception{
		
		if(noOfDays < 0)
			throw new Exception("negative duration");
		this.noOfDays = noOfDays;
	}


	public RDAccount(double amount, int age, int noOfDays) throws Exception
	{
		setAmount(amount);
		setAge(age);
		setNoOfDays(noOfDays);
	    double ir = calInterestRate();
	    setInterestRate(ir);
	}
	
	
	private void setAge(int age2) {
		
		
		age = age2;
		
	}


	private double calInterestRate() {
		
		double ir = 0;
		double months = noOfDays/30.0;
		if(months > 0 && months <= 6)
			ir = 7.5;
		else if(months > 6  && months <= 9)
			ir = 7.75;
		else if(months > 9 && months <= 12)
			ir = 8;
		else if(months > 12 && months <= 15)
			ir = 8.25;
		else if(months > 15 && months <= 18)
			ir = 8.5;
		else 
			ir = 8.75;
		
		if(age > 60)
			ir += 0.5;
		
		return ir;
	}


	@Override
	double calculateInterest() {
		
		return amount * interestRate * 0.01;
	}

}
