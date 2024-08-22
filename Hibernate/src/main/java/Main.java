import config.FactoryConfiguration;
import config.FactoryConfigurationCar;
import embed.FullCarName;
import embed.FullName;
import entity.Car;
import entity.Student;
import org.hibernate.Session;
import org.hibernate.Transaction;

public class Main {
    public static void main(String[] args) {
/*        Session session = FactoryConfiguration.getInstance().getSession();

        FullName fullName = new FullName("Chamath","Dilshan");
        Student student = new Student(1,fullName,"Panadura");
        Transaction transaction = session.beginTransaction();
        //session.save(student);
        //session.update(student);
        //session.delete(student);
        Student student1 = session.get(Student.class, 1);
        System.out.println(student1);

        transaction.commit();
        session.close();*/

        Session session1 = FactoryConfigurationCar.getInstance().getSession();

        FullCarName fullCarName = new FullCarName("Toyota","Aqua");
        Car car = new Car(1,fullCarName,"Red");
        Transaction transaction1 = session1.beginTransaction();
        //session1.save(car);
        //session1.update(car);
        //session1.delete(car);
        Car car1 = session1.get(Car.class, 1);
        System.out.println(car1);

        transaction1.commit();
        session1.close();
    }
}
