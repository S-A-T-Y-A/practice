package com.practice.QuickStart;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.practice.QuickStart.springloosecouple.Human;
import com.practice.QuickStart.springloosecouple.Male;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	
    ApplicationContext ac=new ClassPathXmlApplicationContext("bean.xml");
    Human hum=(Human)ac.getBean("human");//=ac.getBean(Male.class)
    
    
//        Human human=new Male();
        System.out.println(hum.gender());
    }
}
