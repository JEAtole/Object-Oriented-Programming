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

            String rowCourse = courseInfo.nextLine();
            String[] rowCourseSpecific = rowCourse.split(",");

            if(studentNumber.equals(rowCourseSpecific[0])) {
                Course course = new Course();

                course.setCourseCode(rowCourseSpecific[1].trim());
                course.setDescription(rowCourseSpecific[2].trim());
                course.setUnit(Integer.parseInt(rowCourseSpecific[3].trim()));
                course.setDay(rowCourseSpecific[4].trim());
                course.setTime(rowCourseSpecific[5].trim());

                courseList.add(course);

            }
        }

        courseInfo.close();

    }

    public ArrayList<Course> getCourseList() {
        return courseList;
    }

}
