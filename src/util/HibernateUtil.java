package util;

import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;

public class HibernateUtil {
	
	private static SessionFactory sessionFactory= buildSessionFactory();
	private static ServiceRegistry serviceRegistry;
  
    private static SessionFactory buildSessionFactory() {
        try {
        	// Create the SessionFactory from hibernate.cfg.xml
        	Configuration configuration = new Configuration().configure();
     
            serviceRegistry = new StandardServiceRegistryBuilder().applySettings(
                    configuration.getProperties()).build();
            
            //pour demander à hibernate d'aller chercher le fichier de mapping
            sessionFactory = configuration.buildSessionFactory(serviceRegistry);
            return sessionFactory;
           
        }
        catch (Throwable ex) {
            // Make sure you log the exception, as it might be swallowed
            System.err.println("Initial SessionFactory creation failed." + ex);
            throw new ExceptionInInitializerError(ex);
        }
    }

    // il retourne la session
    public static SessionFactory getSessionFactory() {
        return sessionFactory;
    }


}
