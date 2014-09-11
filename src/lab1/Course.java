/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package lab1;

/**
 *
 * @author emitchell7
 */
public class Course {
     private String courseName;
    private String courseNumber;
    private double credits; 
    
    public static void main(String[] args) {
    
    
        
    }
    
private String getCourseName() {
        return courseName;

    }

private String getCapitalizedCourseName() {
        return this.getCourseName().toUpperCase();
    }


private double getCredits() {
        return credits;
    }


 public String getCourseNumber() {
        return courseNumber;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public void setCourseNumber(String courseNumber) {
        this.courseNumber = courseNumber;
    }

    public void setCredits(double credits) {
        this.credits = credits;
    }
 
 
 

}
