package modelo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.AnnotationConfiguration;

public class HibernateUtil {

	private static SessionFactory factory;
	
	private HibernateUtil() {
		AnnotationConfiguration cfg = 
				new AnnotationConfiguration();
		cfg.configure("hibernate.cfg.xml");
		//pega as configurções aqui
		factory = cfg.buildSessionFactory();
	}
	public static Session getSession(){
		if(factory == null){
			HibernateUtil util = new HibernateUtil();
		}
		return factory.openSession();
	}
	
	
}
