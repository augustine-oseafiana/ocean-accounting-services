package com.ocean.accounting.bean;

import java.util.Date;

public class UserBean {
	
	int idUser;
	String firstName;
	String lastName;
	String username;
	String password;
	String maritalStatus;
	Date birth;
	String gender;
	String homeaddress;
	String city;
	String province;
	String postCode;
	String country;
	String phone;
	String email;
	
	public UserBean(int idUser, String firstName, String lastName, String username, String password,
			String maritalStatus, Date birth, String gender,String homeaddress, String city, String province, String postCode,
			String country, String phone, String email) {
		super();
		this.idUser = idUser;
		this.firstName = firstName;
		this.lastName = lastName;
		this.username = username;
		this.password = password;
		this.maritalStatus = maritalStatus;
		this.birth = birth;
		this.gender = gender;
		this.homeaddress = homeaddress;
		this.city = city;
		this.province = province;
		this.postCode = postCode;
		this.country = country;
		this.phone = phone;
		this.email = email;
	}

	public int getIdUser() {
		return idUser;
	}

	public void setIdUser(int idUser) {
		this.idUser = idUser;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getMaritalStatus() {
		return maritalStatus;
	}

	public void setMaritalStatus(String maritalStatus) {
		this.maritalStatus = maritalStatus;
	}

	public Date getBirth() {
		return birth;
	}

	public void setBirth(Date birth) {
		this.birth = birth;
	}
	
	public Date getHomeAddress() {
		return birth;
	}

	public void setHomeAddress(String homeaddress) {
		this.homeaddress = homeaddress;
	}


	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getProvince() {
		return province;
	}

	public void setProvince(String province) {
		this.province = province;
	}

	public String getPostCode() {
		return postCode;
	}

	public void setPostCode(String postCode) {
		this.postCode = postCode;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Override
	public String toString() {
		return "UserBean [idUser=" + idUser + ", firstName=" + firstName + ", lastName=" + lastName + ", username="
				+ username + ", password=" + password + ", maritalStatus=" + maritalStatus + ", birth=" + birth
				+ ", gender=" + gender + ", homeaddress=" + homeaddress + ", city=" + city + ", province=" + province
				+ ", postCode=" + postCode + ", country=" + country + ", phone=" + phone + ", email=" + email + "]";
	}

	
	
	

}
