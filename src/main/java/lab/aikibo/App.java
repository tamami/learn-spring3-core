package lab.aikibo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import lab.aikibo.beans.HelloWorld;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	ApplicationContext context = new ClassPathXmlApplicationContext("SpringBeans.xml");
    	
    	HelloWorld obj = (HelloWorld) context.getBean("helloBean");
        System.out.println( "Hello World! --> " + obj.getName());
    }
}
