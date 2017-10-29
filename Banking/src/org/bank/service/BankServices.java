package org.bank.service;

import org.bank.dao.BankDao;
import org.bank.dao.IBankDao;
import org.bank.model.User;

public class BankServices implements IBankServices {
	
	private IBankDao dao = new BankDao();
	
	@Override
	public boolean isValidUser(User user) {
		User user_detail = dao.getUserByUserNameAndPassword(user.getUserName(),user.getUserPassword());
		if(user_detail != null)
			return true;
		
		return false;
	}
	

}
