
public class SBI implements Loan
{
	
	//FOr full scale convert this to array
	BankDetails bankDetails;
    @Override
    public String HouseLoan(Integer LoanAmount, Integer Time) {
        // TODO Auto-generated method stub
        int MinBankBalance=1000000;
        int MaxTimePeriod=5;
        int InterestRate=6;
        String InterestRateType="CI";
        int bankbalance = bankDetails.getBankBalance();
        System.out.println("Result is:" + LoanChecker.CheckCriteria(MinBankBalance, bankbalance, MaxTimePeriod, Time, LoanAmount, InterestRate, InterestRateType));
        return null;
    }

    @Override
    public String EducationLoan(Integer LoanAmount, Integer Time) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public String PersonalLoan(Integer LoanAmount, Integer Time) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public String TravelLoan(Integer LoanAmount, Integer Time) {
        // TODO Auto-generated method stub
        return null;
    }
    
    public BankDetails getBankDetails() {
		return bankDetails;
	}

	public void setBankDetails(BankDetails bankDetails) {
		this.bankDetails = bankDetails;
	}
	
    public static void main(String [] args){
    	SBI sbi = new SBI();
    	Integer empID = 1234;
    	sbi.bankDetails = new BankDetails(empID);
    	sbi.bankDetails.setFirstName("S");
    	sbi.bankDetails.setLastName("h");
    	sbi.bankDetails.setPhoneNumber(12345678);
    	sbi.bankDetails.setParentAccNumber(123456);
    	sbi.bankDetails.setBankBalance(2000000);
    	Integer Time= 2;
    	Integer LoanAmount = 1200000;
    	sbi.HouseLoan(LoanAmount, Time);
    }


    
}