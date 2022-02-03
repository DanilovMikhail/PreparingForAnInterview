package Paragraph;

import Paragraph.Entity.Student;
import org.hibernate.Session;
import java.util.List;

public class MainApp51 {

    public static void main(String[] args){

//      Добавление 1000 записей по студентам
        StudentDAO studentDAO = new StudentDAO();
        Session currSession = studentDAO.openCurrentSession();

        currSession.beginTransaction();
        for (int i = 1; i <= 1000; i++){

            Student student = new Student("Студент " + i, false);
            studentDAO.save(student);

        }
        currSession.getTransaction().commit();

//        удаление студента с id = 3
        currSession.beginTransaction();
        studentDAO.delete(studentDAO.findById(3));
        currSession.getTransaction().commit();

//        редактирование студента с id = 10
        currSession.beginTransaction();
        Student student10 = studentDAO.findById(10);
        student10.setName("10 Студент 10");
        student10.setMark(true);
        studentDAO.update(student10);
        currSession.getTransaction().commit();

//        вывод всех студентов
        List<Student> students = studentDAO.findAll();

        for (Student student : students){
            student.display();
        }

        studentDAO.closeCurrentSession();

    }
}
