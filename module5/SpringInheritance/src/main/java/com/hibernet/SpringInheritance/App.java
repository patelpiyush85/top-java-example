package com.hibernet.SpringInheritance;

import org.springframework.context.support.AbstractApplicationContext;
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
    	
    	AbstractApplicationContext a=new ClassPathXmlApplicationContext("Beans.xml");
    	Student s=(Student)a.getBean("s2");
        System.out.println("SID: "+s.getSid());
        System.out.println("FIRST NAME :"+s.getFname());
        System.out.println("LAST NAME :"+s.getLname() );
        System.out.println("EMAIL :"+s.getEmail());
       a.registerShutdownHook();
    }
}
