package dao;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Scanner;
import domain.Student;
public class StudentDA {
    private final ArrayList<Student> studentList;

    public StudentDA(String blockCode) throws FileNotFoundException {
        Scanner studentInfo = new Scanner(new FileReader("./src/studentInfo.csv"));
        studentList = new ArrayList<>();

        while(studentInfo.hasNext()) {

            String[] rowStudentInfo = studentInfo.nextLine().split(",");

            if(blockCode.equals(rowStudentInfo[0])) {

                Student student = new Student(rowStudentInfo[1].trim(), rowStudentInfo[2].trim(), rowStudentInfo[3].trim());

                CourseDA courseDA = new CourseDA(student.getStudentNumber());
                student.setCourseList(courseDA.getCourseList());
                student.setTotalUnitsEnrolled(courseDA.getCourseList().size());
                studentList.add(student);
            }

        }

        studentInfo.close();

    }

    public ArrayList<Student> getStudentList() {
        return studentList;
    }

}
