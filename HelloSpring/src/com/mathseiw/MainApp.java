package com.mathseiw;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.*;

public class MainApp {
   public static void main(String[] args) {
      ApplicationContext ctx = 
         new AnnotationConfigApplicationContext(HelloWorldConfig.class);
   
      HelloWorld helloWorld = ctx.getBean(HelloWorld.class);
      helloWorld.setMessage("Helloooooo");
      helloWorld.getMessage();
      
      HelloWorld helloWorld2 = ctx.getBean(HelloWorld.class);
      helloWorld2.getMessage();
   }
}