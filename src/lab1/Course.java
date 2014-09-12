/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package lab1;

import javax.swing.JOptionPane;

/**
 *
 * @author emitchell7
 */
public abstract class Course {
    private String courseName;
    private String courseNumber;
    private double credits; 
    
    public static void main(String[] args) {
    
    
        
    }
    
public final String getCourseName() {
        return courseName;

    }

public final String  getCapitalizedCourseName() {
        return this.getCourseName().toUpperCase();
    }


public final double getCredits() {
        return credits;
    }


 public final String getCourseNumber() {
        return courseNumber;
    }

//    public void setCourseName(String courseName) {
//        this.courseName = courseName;
//    }
//
//    public void setCourseNumber(String courseNumber) {
//        this.courseNumber = courseNumber;
//    }
//
//    public void setCredits(double credits) {
//        this.credits = credits;
//    }
 
 
  public final void setCourseNumber(String courseNumber) {
        if(courseNumber == null || courseNumber.length() == 0) {
            JOptionPane.showMessageDialog(null,
                    "Error: courseNumber cannot be null of empty string");
            System.exit(0);
        }
        this.courseNumber = courseNumber;
    }

//    public double getCredits() {
//        return credits;
//    }

    public void setCredits(double credits) {
        if(credits < 0.5 || credits > 4.0) {
            JOptionPane.showMessageDialog(null,
                    "Error: credits must be in the range 0.5 to 4.0");
            System.exit(0);
        }
        this.credits = credits;
    }

//    public String getCourseName() {
//        return courseName;
//    }

    public final void setCourseName(String courseName) {
        if(courseName == null || courseName.length() == 0) {
            JOptionPane.showMessageDialog(null,
                    "Error: courseName cannot be null of empty string");
            System.exit(0);
        }
        this.courseName = courseName;
    }

//    void setPrerequisites(String courseNumber) {
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
//    }

//  this procedure should be overriden in classes that have prereqs.    
     public String getPrerequisites() {
        return null;
 //            return = " ";
    }

    
    
     public void setPrerequisites(String prerequisites) {
        if(prerequisites == null || prerequisites.length() == 0) {
            JOptionPane.showMessageDialog(null,
                    "Error: prerequisites cannot be null of empty string");
            System.exit(0);
        }
//        this.prerequisites = prerequisites;
    }

}
