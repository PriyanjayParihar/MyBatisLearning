package DbUtil;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.Reader;

public class MyBatisUtil {
    private static SqlSessionFactory factory=null;
    static {
        Reader reader;

        try {
            reader= Resources.getResourceAsReader("myBatis-config.xml");
            factory=new SqlSessionFactoryBuilder().build(reader);
        }
        catch (Exception e){
            System.out.println("Exception in util");
            e.printStackTrace();
        }
    }
    public static SqlSessionFactory getSqlSessionFactory(){
        return factory;
    }

}
