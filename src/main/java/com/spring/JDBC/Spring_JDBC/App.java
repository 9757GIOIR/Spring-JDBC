package com.spring.JDBC.Spring_JDBC;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

import com.spring.JDBC.Spring_JDBC.Dao.StudentDao;
import com.spring.JDBC.Spring_JDBC.entities.Student;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
  // Spring JDBC Template
        
        ApplicationContext context= new ClassPathXmlApplicationContext("com/spring/JDBC/Spring_JDBC/Conf.xml");
        StudentDao student=context.getBean("studentDao",StudentDao.class);
//        Student st= new Student(2,"Balaji","Nanded");
//        
//        int result=student.updates(st);
//        
//        
//        
//        System.out.println("Number of record"+result);
//        
//      
      
       List<Studnet>studentt=studentDao.getAllStudents();
       
    }
    
}
