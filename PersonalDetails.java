import java.util.ArrayList;

/**
 * 
 */

/**
 * @author shparashar
 *
 */
public abstract class PersonalDetails {

	/**
	 * @param args
	 */
	protected String FirstName;
	protected String LastName;
	protected Integer phoneNumber;
	protected ArrayList<Address> Addresses;

	public String getFirstName() {
		return FirstName;
	}

	public void setFirstName(String firstName) {
		FirstName = firstName;
	}

	public String getLastName() {
		return LastName;
	}

	public void setLastName(String lastName) {
		LastName = lastName;
	}
	
	public Integer getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(Integer phoneNumber) {
		if(verifyNumber(phoneNumber)){
			this.phoneNumber = phoneNumber;
		}
		else{
			System.err.println("Wrong Phone number format");
		}
	}
	
	public ArrayList<Address> getAddresses() {
		return Addresses;
	}

	public void setAddresses(ArrayList<Address> addresses) {
		Addresses = addresses;
	}
	
	abstract public Boolean verifyNumber(Integer phoneNumber);
}
