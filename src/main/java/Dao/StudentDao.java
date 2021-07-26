package Dao;

import DbUtil.MyBatisUtil;
import POJO.Student;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

import java.util.List;

public class StudentDao {
    public static void insertStudent(Student student){
        SqlSessionFactory factory= MyBatisUtil.getSqlSessionFactory();
//        System.out.println(factory+""+factory==null);
        SqlSession session=factory.openSession();
//        System.out.println(session+""+session==null);
        session.insert("insert",student);
        session.commit();
        session.close();
    }
    public static Student getStudent(String ID){

        SqlSessionFactory factory= MyBatisUtil.getSqlSessionFactory();
        SqlSession session=factory.openSession();
        Student student= (Student) session.selectOne("select", ID );
        session.commit();
        session.close();
        return student;
    }
    public static List<Student> getAllStudents(){
        SqlSessionFactory factory= MyBatisUtil.getSqlSessionFactory();
        SqlSession session=factory.openSession();
        List<Student> students=session.selectList("selectAll");
        session.commit();
        session.close();
        return students;
    }
    public static void updateStudent(Student student){
        SqlSessionFactory factory= MyBatisUtil.getSqlSessionFactory();
        SqlSession session=factory.openSession();
        System.out.println(student);
        session.update("updateStudent",student);
        session.commit();
        session.close();
    }
    public static void deleteStudent(String id){
        SqlSessionFactory factory= MyBatisUtil.getSqlSessionFactory();
        SqlSession session=factory.openSession();
        session.delete("deleteStudent",id);
        session.commit();
        session.close();
    }
}
