package org.example;

import Dao.StudentDao;
import POJO.Student;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class UpdateStudent {

    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );

        ApplicationContext context=new ClassPathXmlApplicationContext("spring-config.xml");
        Student student=StudentDao.getStudent("101");
        System.out.println(student);
        StudentDao.updateStudent(new Student("101", "ravi ", "M" , 554588524));
        student=StudentDao.getStudent("101");
        System.out.println(student);






    }

}
