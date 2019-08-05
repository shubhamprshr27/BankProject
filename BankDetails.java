/**
 * 
 */

/**
 * @author shparashar
 *
 */
public class BankDetails extends PersonalDetails {
	private final Integer empID;
	private Integer BankBalance;
	private Integer ParentAccNumber;
	
	public BankDetails(Integer empID) {
		super();
		this.empID = empID;
	}
	
	public Integer getEmpID() {
		return empID;
	}
	
	public Integer getParentAccNumber() {
		return ParentAccNumber;
	}

	public void setParentAccNumber(Integer parentAccNumber) {
		ParentAccNumber = parentAccNumber;
	}
	
	public Integer getBankBalance() {
		return BankBalance;
	}

	public void setBankBalance(Integer bankBalance) {
		BankBalance = bankBalance;
	}

	@Override
	public Boolean verifyNumber(Integer phoneNumber){
		if(phoneNumber<10000){
			return false;
		}
		return true;
	}
}
