package org.example;

import Dao.StudentDao;
import POJO.Student;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

public class SelectStudentById {

    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );

        ApplicationContext context=new ClassPathXmlApplicationContext("spring-config.xml");
//        Student student=(Student) context.getBean("student");
//        System.out.println(student);
//        StudentDao.insertStudent(student);
//        System.out.println("inserted"+student);

        Student student=StudentDao.getStudent("101");
//        List<Student> students= StudentDao.getAllStudents();
//        for (Student student: students)
        System.out.println(student);



    }
}
