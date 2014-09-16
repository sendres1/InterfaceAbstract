package lab1;

/**
 * Describe responsibilities here.
 *
 * @author      sendres1
 * @version     1.00
 */
public class IntroJavaCourse extends Course{
//    String courseName;
//    private String courseNumber;
//    private double credits;
    private String prerequisites;

    public IntroJavaCourse(String courseName, String courseNumber) {
//        this.courseName = courseName;
        this.setCourseName(courseName);
        this.setCourseNumber(courseNumber);
//        this.courseNumber = courseNumber;
    }

//    public String getCourseNumber() {
//        return courseNumber;
//    }

//    public void setCourseNumber(String courseNumber) {
//        this.courseNumber = courseNumber;
//    }

//    public double getCredits() {
//        return credits;
//    }


    @Override
    public String getPrerequisites() {
        return prerequisites;
    }

    @Override
    public void setPrerequisites(String prerequisites) {
        this.prerequisites = prerequisites;
    }

  

}
