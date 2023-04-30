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

}
