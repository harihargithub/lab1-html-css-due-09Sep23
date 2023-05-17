package service;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Test {

	public static void main(String[] args) {
		System.out.println("Connecting to database");
		SessionFactory factory = null;
		     factory = new Configuration()
			.configure("hibernate.cfg.xml")
			.buildSessionFactory(); 
			System.out.println("created");
	}

}
