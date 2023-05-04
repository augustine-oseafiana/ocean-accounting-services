package com.ocean.accounting.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ocean.accounting.bean.UserBean;
import com.ocean.accounting.dao.OceanAccountingDao;

@Service
public class OceanAccountingService {
	
	
	@Autowired
	OceanAccountingDao oceanAccountingDao;
	
	public List<UserBean> listUsers(){
		
		List<UserBean> users = this.oceanAccountingDao.listusers();
		
		return users;
		
	}
	
	public void createUser(UserBean user) {
		
		this.validateUser(user);
		
		this.oceanAccountingDao.createUser(user);
		
	}
	
	public UserBean findUser(int idUser) {
		
		return this.oceanAccountingDao.fineUser(idUser);
		
	}
	private void validateUser(UserBean user) {
		
		if (user.getFirstName().isEmpty() ||
			user.getLastName().isEmpty()||
			user.getUsername().isEmpty()) {
			throw new RuntimeException("Invalid User Data:" + user);
		}
		
	}

}
