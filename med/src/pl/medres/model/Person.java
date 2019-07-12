package pl.medres.model;


public class Person {
	private long person_id;
	private String firstNameString;
	private String lastName;
	private String sex;
	private String mobilePhone;
	private String email;
	private User user_idUser;
	
	
	
	
	public Person() {
	}




	public Person(long person_id, String firstNameString, String lastName, String sex, String mobilePhone, String email,
			User user_idUser) {
		this.person_id = person_id;
		this.firstNameString = firstNameString;
		this.lastName = lastName;
		this.sex = sex;
		this.mobilePhone = mobilePhone;
		this.email = email;
		this.user_idUser = user_idUser;
	}




	public long getPerson_id() {
		return person_id;
	}




	public void setPerson_id(long person_id) {
		this.person_id = person_id;
	}




	public String getFirstNameString() {
		return firstNameString;
	}




	public void setFirstNameString(String firstNameString) {
		this.firstNameString = firstNameString;
	}




	public String getLastName() {
		return lastName;
	}




	public void setLastName(String lastName) {
		this.lastName = lastName;
	}




	public String getSex() {
		return sex;
	}




	public void setSex(String sex) {
		this.sex = sex;
	}




	public String getMobilePhone() {
		return mobilePhone;
	}




	public void setMobilePhone(String mobilePhone) {
		this.mobilePhone = mobilePhone;
	}




	public String getEmail() {
		return email;
	}




	public void setEmail(String email) {
		this.email = email;
	}




	public User getUser_idUser() {
		return user_idUser;
	}




	public void setUser_idUser(User user_idUser) {
		this.user_idUser = user_idUser;
	}

	
	



	@Override
	public String toString() {
		return "Person [person_id=" + person_id + ", firstNameString=" + firstNameString + ", lastName=" + lastName
				+ ", sex=" + sex + ", mobilePhone=" + mobilePhone + ", email=" + email + ", user_idUser=" + user_idUser
				+ "]";
	}




	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((email == null) ? 0 : email.hashCode());
		result = prime * result + ((firstNameString == null) ? 0 : firstNameString.hashCode());
		result = prime * result + ((lastName == null) ? 0 : lastName.hashCode());
		result = prime * result + ((mobilePhone == null) ? 0 : mobilePhone.hashCode());
		result = prime * result + (int) (person_id ^ (person_id >>> 32));
		result = prime * result + ((sex == null) ? 0 : sex.hashCode());
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
		Person other = (Person) obj;
		if (email == null) {
			if (other.email != null)
				return false;
		} else if (!email.equals(other.email))
			return false;
		if (firstNameString == null) {
			if (other.firstNameString != null)
				return false;
		} else if (!firstNameString.equals(other.firstNameString))
			return false;
		if (lastName == null) {
			if (other.lastName != null)
				return false;
		} else if (!lastName.equals(other.lastName))
			return false;
		if (mobilePhone == null) {
			if (other.mobilePhone != null)
				return false;
		} else if (!mobilePhone.equals(other.mobilePhone))
			return false;
		if (person_id != other.person_id)
			return false;
		if (sex == null) {
			if (other.sex != null)
				return false;
		} else if (!sex.equals(other.sex))
			return false;
		if (user_idUser == null) {
			if (other.user_idUser != null)
				return false;
		} else if (!user_idUser.equals(other.user_idUser))
			return false;
		return true;
	}
	
	
	
	
	
	

}
