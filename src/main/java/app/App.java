package app;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.service.ServiceRegistry;

import entity.SinhVien;

public class App {
	public static void main(String[] args) {
		ServiceRegistry serviceRegistry = new StandardServiceRegistryBuilder()
				.configure()
				.build();
		
		Metadata metadata = new MetadataSources(serviceRegistry)
				.addAnnotatedClass(SinhVien.class)
				.getMetadataBuilder()
				.build();
		
		SessionFactory sessionFactory = metadata
				.getSessionFactoryBuilder()
				.build();
		
		Session session = sessionFactory.getCurrentSession();
		Transaction transaction = session.getTransaction();
		
		try {
			transaction.begin();
			SinhVien sv = new SinhVien("sv01", "LeQuocPhong", 20);
			session.persist(sv);
			transaction.commit();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
