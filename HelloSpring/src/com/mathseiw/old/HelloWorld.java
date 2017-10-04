package com.mathseiw.old;

import org.springframework.beans.factory.annotation.Value;

public class HelloWorld {
    @Value("${Test Hello}")
    private String message;

    public void setMessage(String message){
       this.message  = message;
    }
    public void getMessage(){
       System.out.println("Your Message : " + message);
    }
 }