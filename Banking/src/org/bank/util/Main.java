package org.bank.util;

import org.bank.model.Cards;
import org.hibernate.Session;

public class Main {
	
	public static void main(String[] args) {
		
		Session session = HibernateUtil.getSessionFactory().openSession();
		session.getEntityName(new Cards());
		System.out.println(session.isConnected());
		
	}

}
