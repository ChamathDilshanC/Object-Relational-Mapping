package config;

import entity.Car;
import entity.Student;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class FactoryConfigurationCar {
    public static FactoryConfigurationCar factoryConfiguration;
    private  final SessionFactory sessionFactory;

    private FactoryConfigurationCar(){
        Configuration configuration = new Configuration().configure().addAnnotatedClass(Car.class);
        sessionFactory = configuration.configure().buildSessionFactory();
    }

    public static FactoryConfigurationCar getInstance(){
        if(factoryConfiguration == null) factoryConfiguration = new FactoryConfigurationCar();
        return factoryConfiguration;
    }

    public Session getSession(){
        return sessionFactory.openSession();
    }
}
