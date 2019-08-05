/**
 * 
 */

/**
 * @author shparashar
 *
 */
public class Address {
	
	private String City;
	private Integer HouseNo;
	private String Area;
	private String Street;
	
	public Address(String city, Integer houseNo, String area, String street) {
		super();
		City = city;
		HouseNo = houseNo;
		Area = area;
		Street = street;
	}
	public String getCity() {
		return City;
	}
	public void setCity(String city) {
		City = city;
	}
	public Integer getHouseNo() {
		return HouseNo;
	}
	public void setHouseNo(Integer houseNo) {
		HouseNo = houseNo;
	}
	public String getArea() {
		return Area;
	}
	public void setArea(String area) {
		Area = area;
	}
	public String getStreet() {
		return Street;
	}
	public void setStreet(String street) {
		Street = street;
	}
	@Override
	public String toString() {
		return "Address [City=" + City + ", HouseNo=" + HouseNo + ", Area=" + Area + ", Street=" + Street + "]";
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((Area == null) ? 0 : Area.hashCode());
		result = prime * result + ((City == null) ? 0 : City.hashCode());
		result = prime * result + ((HouseNo == null) ? 0 : HouseNo.hashCode());
		result = prime * result + ((Street == null) ? 0 : Street.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Address other = (Address) obj;
		if (Area == null) {
			if (other.Area != null)
				return false;
		} else if (!Area.equals(other.Area))
			return false;
		if (City == null) {
			if (other.City != null)
				return false;
		} else if (!City.equals(other.City))
			return false;
		if (HouseNo == null) {
			if (other.HouseNo != null)
				return false;
		} else if (!HouseNo.equals(other.HouseNo))
			return false;
		if (Street == null) {
			if (other.Street != null)
				return false;
		} else if (!Street.equals(other.Street))
			return false;
		return true;
	}
	
}
