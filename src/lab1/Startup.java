/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package lab1;

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

    System.out.println(AbstractProgramClass.getCapitalizedCourseName()
           + "  "       +     AbstractProgramClass.getCourseNumber()       );
    System.out.println(AbstractJavaSuperClass.getCourseName()
    + "  "       +     AbstractJavaSuperClass.getCourseNumber()       );
    System.out.println(AbstractAdvancedJavaSuperClass.getCourseName()
            + "  "       +     AbstractAdvancedJavaSuperClass.getCourseNumber()       );
}
}
