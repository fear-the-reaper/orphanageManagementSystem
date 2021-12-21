package services;

import businessLogic.ContactInfo;
import businessLogic.Donor;
import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;

//SINGLETON!
public class FactoryProvider {
    public static SessionFactory factory;

    public static SessionFactory getFactory() {
        if (factory == null) {
            Configuration config = new Configuration().configure("hibernate.cfg.xml");
            config.addAnnotatedClass(Donor.class);
            config.addAnnotatedClass(ContactInfo.class);
            ServiceRegistry reg = new StandardServiceRegistryBuilder().applySettings(config.getProperties()).build();
            factory = config.buildSessionFactory(reg);
        }
        return factory;
    }

    public static void closeFactory(){
        if (factory.isOpen()){
            factory.close();
        }
    }
}
