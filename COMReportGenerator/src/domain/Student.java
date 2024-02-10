package domain;
import java.util.ArrayList;
public class Student {
    private String studentNumber;
    private String name;
    private String program;
    private int totalUnitsEnrolled;
    private ArrayList<Course> courseList;

    public String toString() {
        String studentOutput = "Student number: " + studentNumber + "\n" +
                "Student name: " + name + "\n" +
                "Program: " + program + "\n" +
                "Total Units Enrolled: " + totalUnitsEnrolled + "\n";

        studentOutput += "\nSchedule\n" +
                         String.format("%-13.13s","Course Code") +
                         String.format("%-25.25s","Description") +
                         String.format("%-7.7s","Unit") +
                         String.format("%-6.6s","Day") +
                         String.format("%-14.14s","Time") +"\n";

        StringBuilder studentOutputBuilder = new StringBuilder(studentOutput);
        for(Course course: courseList) {
            studentOutputBuilder.append(course);
        }
        studentOutputBuilder.append("\n");
        studentOutput = studentOutputBuilder.toString();
        return studentOutput;
    }

    public String getStudentNumber() {
        return studentNumber;
    }

    public void setStudentNumber(String studentNumber) {
        this.studentNumber = studentNumber;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setProgram(String program) {
        this.program = program;
    }

    public void setCourseList(ArrayList<Course> courseList) {
        this.courseList = courseList;
    }

    public void setTotalUnitsEnrolled(int totalUnitsEnrolled) {
        this.totalUnitsEnrolled = totalUnitsEnrolled;
    }
}
