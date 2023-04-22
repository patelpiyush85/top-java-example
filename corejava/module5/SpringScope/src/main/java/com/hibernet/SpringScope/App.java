package com.hibernet.SpringScope;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.bean.Student;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        ApplicationContext a=new ClassPathXmlApplicationContext("Beans.xml");
       Student s1=(Student)a.getBean("s1");
       s1.setId(1);
       s1.setFname("piyush");
       s1.setLname("patel");
       s1.setEmail("patelpiyush838@gmail.com");
       System.out.println(s1);
       
       Student s2=(Student)a.getBean("s1");
       System.out.println(s2);
    }
}
