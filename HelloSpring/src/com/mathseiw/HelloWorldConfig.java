package com.mathseiw;
import org.springframework.context.annotation.*;

@Configuration
public class HelloWorldConfig {
   @Bean 
   @Scope("prototype")
   public HelloWorld helloWorld(){
      return new HelloWorld();
   }
}