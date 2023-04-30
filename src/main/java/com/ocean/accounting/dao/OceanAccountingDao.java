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
		
		users.add(new UserBean(1,"John","Doe","jdoe","123","Married",oceanutil.parseDate("1984-03-03"),"Male","255 stillwater Drive","Saskatoon","Saskachewan","S7j4m7","Canada","3068800884","augustine.oseafiana@gmail.com"));
		users.add(new UserBean(2,"John","Doe","jdoe","123","Married",oceanutil.parseDate("1984-03-03"),"Male","255 stillwater Drive","Saskatoon","Saskachewan","S7j4m7","Canada","3068800884","augustine.oseafiana@gmail.com"));
		users.add(new UserBean(3,"John","Doe","jdoe","123","Married",oceanutil.parseDate("1984-03-03"),"Male","255 stillwater Drive","Saskatoon","Saskachewan","S7j4m7","Canada","3068800884","augustine.oseafiana@gmail.com"));
	}
    
	public List<UserBean> listusers() {
		return this.users;
	}
}
