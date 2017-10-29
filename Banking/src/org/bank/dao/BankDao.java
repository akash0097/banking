package org.bank.dao;

import org.bank.model.User;
import org.bank.util.HibernateUtil;
import org.hibernate.Query;
import org.hibernate.Session;

public class BankDao implements IBankDao {
	
	@Override
	public User getUserByUserNameAndPassword(String userName, String userPassword) {
		Session session = HibernateUtil.getSession();
		User user = null;
		Query query = session.createSQLQuery("from User where userName=:userName and userPassword=:userPassword");
		query.setString("userName", userName);
		query.setString("userPassword", userPassword);
		
		user = (User) query.uniqueResult();
		return user;
	}
	

}
