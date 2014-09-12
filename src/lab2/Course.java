package lab2;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import javax.swing.JOptionPane;

/**
 *
 * @author sendres1
 */
public interface Course {
//    String courseName;
//    private String courseNumber;
//    private double credits; 
// 
//  public static void main(String[] args) {
//               
//    }

    public abstract String getCourseName();

    public abstract String getCapitalizedCourseName();

    public abstract double getCredits();

    public abstract String getCourseNumber();

    public abstract void setCourseNumber();

    public abstract void setCredits();

    public abstract void setCourseName();

    public abstract String getPrerequisites();

    public abstract void setPrerequisites();

}
