/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package lab2;

import lab1.*;

/**
 *
 * @author sendres1
 */
public class Startup {
    
     public static void main(String[] args) {
    
 //   new Course = new IntroJavaCourse(courseName, courseNumber)
    
  //  Course course1 = new IntroJavaCourse("course1", "11111");
    Course AbstractAdvancedJavaSuperClass = new AdvancedJavaCourse("AdvancedJava", "-003");
    Course AbstractJavaSuperClass = new IntroJavaCourse("IntroJava", "-002");
    Course AbstractProgramClass = new IntroToProgrammingCourse("Intro", "-001");

    AbstractAdvancedJavaSuperClass.setCredits(4);
    AbstractJavaSuperClass.setCredits(4.0);
    AbstractProgramClass.setCredits(4.0);
      
    //this is a test
    
     AbstractAdvancedJavaSuperClass.setPrerequisites(AbstractJavaSuperClass.getCourseNumber());
    AbstractJavaSuperClass.setPrerequisites(AbstractProgramClass.getCourseNumber());
    
    System.out.println(AbstractProgramClass.getCapitalizedCourseName()
           + "  "       +     AbstractProgramClass.getCourseNumber()       );
    
    System.out.println(AbstractJavaSuperClass.getCourseName()
    + "  "       +     AbstractJavaSuperClass.getCourseNumber()   
    + "  "       +     AbstractJavaSuperClass.getPrerequisites());
    
    System.out.println(AbstractAdvancedJavaSuperClass.getCourseName()
            + "  "       +     AbstractAdvancedJavaSuperClass.getCourseNumber() 
                         +      AbstractAdvancedJavaSuperClass.getPrerequisites()   );
}
}
