
public class LoanChecker
{
    public static int CompoundInterestCalculator(int LoanAmount,int TimePeriod,int InterestRate)
    {
        return (int) (LoanAmount*Math.pow((1+InterestRate/100),2*TimePeriod));
    }
    
    public static int SimpleInterestCalculator(int LoanAmount,int TimePeriod,int InterestRate)
    {
        return LoanAmount*(1+InterestRate*TimePeriod);
    }
    public static String CheckCriteria(int MinBankBalance,int BankBalance,int MaxTimePeriod,int TimePeriod,int LoanAmount,int InterestRate,String InterestRateType)
    {
        if(MinBankBalance>BankBalance || MaxTimePeriod<TimePeriod)
        {
            if(InterestRateType.equals("CI"))
            {
                if(CompoundInterestCalculator(LoanAmount,TimePeriod,InterestRate)<10000000)
                    return "Loan Not Passed";
                else return "Loan Passed";
            }
            else
            {
                if(SimpleInterestCalculator(LoanAmount,TimePeriod,InterestRate)<10000000)
                    return "Loan Not Passed";
                else return "Loan Passed";
            }
        }
        return "Loan Not Passed";
        
    }
}