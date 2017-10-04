package com.tutorialspoint;

import org.springframework.beans.factory.annotation.Value;

public class Student {
    @Value("${10}")
    private Integer age;
    private String lalala;
    private Integer id;

    public void setAge(Integer age) {
       this.age = age;
    }
    public Integer getAge() {
       return age;
    }
    public void setlalala(String lala) {
       this.lalala = lala;
    }
    public String getlalala() {
       return lalala;
    }
    public void setId(Integer id) {
       this.id = id;
    }
    public Integer getId() {
       return id;
    }
 }