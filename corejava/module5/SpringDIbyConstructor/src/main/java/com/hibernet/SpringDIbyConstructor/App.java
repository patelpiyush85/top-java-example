package com.hibernet.SpringDIbyConstructor;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.bean.Student;

/**
 * Hello world!
 *
 */
public class App 
{
    private static char[] s1;

	public static void main( String[] args )
    {
        ApplicationContext a=new ClassPathXmlApplicationContext("Beans.xml");
        Student s=(Student)a.getBean("s1");
        System.out.println(s);
        
    }
}
