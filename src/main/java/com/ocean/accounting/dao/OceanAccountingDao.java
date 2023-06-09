package com.ocean.accounting.dao;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.ocean.accounting.bean.UserBean;
import com.ocean.accounting.util.oceanutil;

@Repository
public class OceanAccountingDao {
	
	List<UserBean> users;
	
	public OceanAccountingDao() {
		this.users = new ArrayList<UserBean>();
		
		users.add(new UserBean(1,"John","Doe","jdoe","123","Married",oceanutil.parseDate("1984-03-03"),"Male","255 stillwater drive","Saskatoon","Saskachewan","S7j4m7","Canada","3068800884","augustine.oseafiana@gmail.com"));
		users.add(new UserBean(2,"John","Doe","jdoe","123","Married",oceanutil.parseDate("1984-03-03"),"Male","255 stillwater drive","Saskatoon","Saskachewan","S7j4m7","Canada","3068800884","augustine.oseafiana@gmail.com"));
		users.add(new UserBean(3,"John","Doe","jdoe","123","Married",oceanutil.parseDate("1984-03-03"),"Male","255 stillwater drive","Saskatoon","Saskachewan","S7j4m7","Canada","3068800884","augustine.oseafiana@gmail.com"));
	}
    
	public List<UserBean> listusers() {
		return this.users;
	}
	/*The synchronized keyword prevents concurrency.This ensures
	 * that the idUser(max) is unigue. In a real world scenario the 
	 * id is created by other mean like for example a database
	 * identity field.
	*/
	public synchronized void createUser(UserBean user) {
		
	  int max =	this.users.stream()
		                .mapToInt(u->u.getIdUser())
		                .max().orElse(0);
	
	  user.setIdUser(++max);
	  
	  this.users.add(user);
		
	}
	
	public UserBean fineUser(int idUser) {
		
		return this.users.stream()
				       .filter(u->u.getIdUser()==idUser)
				       .findAny().orElse(null);
		
	}
	
	public void updateUser(UserBean user) {
		
		UserBean currentUser = this.fineUser(user.getIdUser());
		
		if (currentUser!= null) {
			currentUser.setFirstName(user.getFirstName());
			currentUser.setLastName(user.getLastName());
			currentUser.setUsername(user.getUsername());
			currentUser.setMaritalStatus(user.getMaritalStatus());
			currentUser.setBirth(user.getBirth());
			currentUser.setGender(user.getGender());
			currentUser.setCity(user.getCity());
			currentUser.setProvince(user.getProvince());
			currentUser.setPostCode(user.getPostCode());
			currentUser.setCountry(user.getCountry());
			currentUser.setPhone(user.getPhone());
			currentUser.setEmail(user.getEmail());
		}
		
	}
	
	public void deleteUser(int idUser) {
		
		this.users.removeIf(u->u.getIdUser()==idUser);
		
	}
}
