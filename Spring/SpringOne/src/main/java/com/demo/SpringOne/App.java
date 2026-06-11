package com.demo.SpringOne;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        
        ApplicationContext cont = new ClassPathXmlApplicationContext("config.xml");
        Customer cu = (Customer) cont.getBean("cust1");
        System.out.println(cu);
    }
}
