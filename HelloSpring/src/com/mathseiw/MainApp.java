package com.mathseiw;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {
   public static void main(String[] args) {
      ConfigurableApplicationContext context = 
         new ClassPathXmlApplicationContext("Beans.xml");

      // Let us raise a start event.
      context.start();
      
      ApplicationContext ctx = 
              new AnnotationConfigApplicationContext(HelloWorldConfig.class);
        
           HelloWorld helloWorld = ctx.getBean(HelloWorld.class);
      helloWorld.getMessage();

      // Let us raise a stop event.
      context.stop();
   }
}