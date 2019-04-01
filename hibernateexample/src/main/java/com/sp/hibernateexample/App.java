package com.sp.hibernateexample;


import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {

		StandardServiceRegistry sr = new StandardServiceRegistryBuilder().configure("hibernate.cfg.xml").build();
		Metadata meta = new MetadataSources(sr).getMetadataBuilder().build();
		
		SessionFactory factory = meta.getSessionFactoryBuilder().build();
		Session session = factory.openSession();
		Transaction t = session.beginTransaction();
		
		Patient p = new Patient();
		p.setPatientid(101);
		p.setPatientname("xyz");
		
		InPatient ip = new InPatient();
		ip.setPeramount(500.65);
		ip.setPerprice(1000);
		
		OutPatient op = new OutPatient();
		op.setAmount(1000);
		op.setPrice(1111);
		session.save(p);
		
		t.commit();
		session.close();
    }
}
