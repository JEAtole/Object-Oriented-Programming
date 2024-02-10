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

            String rowStudent = studentInfo.nextLine();
            String[] rowStudentSpecific = rowStudent.split(",");

            if(blockCode.equals(rowStudentSpecific[0])) {

                Student student = new Student();

                student.setStudentNumber(rowStudentSpecific[1].trim());
                student.setName(rowStudentSpecific[2].trim());
                student.setProgram(rowStudentSpecific[3].trim());

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
