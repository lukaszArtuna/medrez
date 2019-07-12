package pl.medres.model;

public class Address {
	
	private Long address_idLong;
	private String street;
	private String streetCodeString;
	private String cityString;
	private User user_idUser;
	
	
	
	
	public Address() {
	}




	public Address(Long address_idLong, String street, String streetCodeString, String cityString, User user_idUser) {
		this.address_idLong = address_idLong;
		this.street = street;
		this.streetCodeString = streetCodeString;
		this.cityString = cityString;
		this.user_idUser = user_idUser;
	}




	@Override
	public String toString() {
		return "Address [address_idLong=" + address_idLong + ", street=" + street + ", streetCodeString="
				+ streetCodeString + ", cityString=" + cityString + ", user_idUser=" + user_idUser + "]";
	}




	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((address_idLong == null) ? 0 : address_idLong.hashCode());
		result = prime * result + ((cityString == null) ? 0 : cityString.hashCode());
		result = prime * result + ((street == null) ? 0 : street.hashCode());
		result = prime * result + ((streetCodeString == null) ? 0 : streetCodeString.hashCode());
		result = prime * result + ((user_idUser == null) ? 0 : user_idUser.hashCode());
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
		if (address_idLong == null) {
			if (other.address_idLong != null)
				return false;
		} else if (!address_idLong.equals(other.address_idLong))
			return false;
		if (cityString == null) {
			if (other.cityString != null)
				return false;
		} else if (!cityString.equals(other.cityString))
			return false;
		if (street == null) {
			if (other.street != null)
				return false;
		} else if (!street.equals(other.street))
			return false;
		if (streetCodeString == null) {
			if (other.streetCodeString != null)
				return false;
		} else if (!streetCodeString.equals(other.streetCodeString))
			return false;
		if (user_idUser == null) {
			if (other.user_idUser != null)
				return false;
		} else if (!user_idUser.equals(other.user_idUser))
			return false;
		return true;
	}
	
	
	
	

}
