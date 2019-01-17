package interest_calculator;

public class SBAccount extends Account{

	boolean isNormalAcc= false;
	
	SBAccount(double amount, boolean isNormalAcc) throws Exception
	{
		setAmount(amount);
		this.isNormalAcc = isNormalAcc;
		
		double ir = getInterest();
		setInterestRate(ir);
	}

	private double getInterest() {
		
		if(isNormalAcc)
			return 4;
		else
			return 6;
	}

	@Override
	double calculateInterest() 
	{
		
		return amount*interestRate*0.01;
	}
}
