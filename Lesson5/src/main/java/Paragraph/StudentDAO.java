package Paragraph;

import Paragraph.Entity.Student;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import java.util.List;

public class StudentDAO{

    private Session currentSession;

    public StudentDAO(){

    }

    public Session getCurrentSession() {
        return currentSession;
    }

    public void setCurrentSession(Session currentSession) {
        this.currentSession = currentSession;
    }

    public Session openCurrentSession() {
        currentSession = getSessionFactory().openSession();
        return currentSession;
    }

    public void closeCurrentSession() {
        currentSession.close();
    }

    private static SessionFactory getSessionFactory() {

//        Configuration configuration = new Configuration().configure();
//
//        StandardServiceRegistryBuilder builder = new StandardServiceRegistryBuilder()
//                .applySettings(configuration.getProperties());
//
//        SessionFactory sessionFactory = configuration.buildSessionFactory(builder.build());

        SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();

        return sessionFactory;
    }

    public void save(Student student) {
        getCurrentSession().save(student);
    }

    public void update(Student student) {
        getCurrentSession().update(student);
    }

    public Student findById(long id) {
        Student student = (Student) getCurrentSession().get(Student.class, id);
        return student;
    }

    public void delete(Student student) {
        getCurrentSession().delete(student);
    }

    @SuppressWarnings("unchecked")
    public List<Student> findAll() {
        List<Student> students = (List<Student>) getCurrentSession().createQuery("from Student", Student.class).list();
        return students;
    }
}
