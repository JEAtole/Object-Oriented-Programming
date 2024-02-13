package dao;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Scanner;
import domain.Course;
public class CourseDA {
    private final ArrayList<Course> courseList;

    public CourseDA(String studentNumber) throws FileNotFoundException {
        Scanner courseInfo = new Scanner(new FileReader("./src/scheduleInfo.csv"));
        courseList = new ArrayList<>();

        while(courseInfo.hasNext()) {

            String[] rowCourseInfo = courseInfo.nextLine().split(",");

            if(studentNumber.equals(rowCourseInfo[0])) {

                Course course = new Course(rowCourseInfo[1].trim(),
                        rowCourseInfo[2].trim(),
                        Integer.parseInt(rowCourseInfo[3].trim()),
                        rowCourseInfo[4].trim(),
                        rowCourseInfo[5].trim());
                courseList.add(course);

            }
        }

        courseInfo.close();

    }

    public ArrayList<Course> getCourseList() {
        return courseList;
    }

}
