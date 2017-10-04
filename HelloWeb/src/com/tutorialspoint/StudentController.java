package com.tutorialspoint;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class StudentController {
    @RequestMapping( value = "/student", method = RequestMethod.GET )
    public ModelAndView student() {
        return new ModelAndView( "student", "command", new Student() );
    }

    @RequestMapping( value = "/addStudent", method = RequestMethod.POST )
    @ExceptionHandler({SpringException.class})
    public String addStudent(Student student,ModelMap model ) throws Exception {
        model.addAttribute( "name", student.getlalala() );
        if( student.getAge() < 10 ){
            throw new SpringException("Given age is too low");
         } else {
            model.addAttribute("age", student.getAge());
         }
        if( student.getId() < 5 ){
            throw new Exception("ID trop faible");
         } else {
             model.addAttribute( "id", student.getId() );
         }
       
        model.addAttribute( "student", student );

        return "resultTest";
    }
}