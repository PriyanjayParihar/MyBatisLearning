package org.example;

import Dao.StudentDao;
import POJO.Student;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DeleteStudent {
    public static void main( String[] args ) {
        System.out.println("Hello World!");

        ApplicationContext context = new ClassPathXmlApplicationContext("spring-config.xml");
        Student student = StudentDao.getStudent("101");
        System.out.println(student);
        StudentDao.deleteStudent("101");
        student = StudentDao.getStudent("101");
        System.out.println(student);


    }


    }
