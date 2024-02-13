package domain;
import java.util.ArrayList;
public class BlockSection {
    private final String blockCode;
    private final String description;
    private final String adviser;
    private int totalStudents;

    private ArrayList<Student> studentList;

    public BlockSection(String blockCode, String description, String adviser) {
        this.blockCode = blockCode;
        this.description = description;
        this.adviser = adviser;
    }

    public String toString() {
        StringBuilder result = new StringBuilder();

        result.append("Block Section: ").append(blockCode).append("\n")
                .append("Block Section Description: ").append(description).append("\n")
                .append("Class Adviser: ").append(adviser).append("\n\n")
                .append("Total Number of Students: ").append(totalStudents).append("\n\n");

        for(Student student: studentList) {
            result.append(student);

        }

        return result.toString();

    }

    public String getBlockCode() {
        return blockCode;
    }

    public void setStudentList(ArrayList<Student> studentList) {
        this.studentList = studentList;
    }

    public void setTotalStudents(int totalStudents) {
        this.totalStudents = totalStudents;
    }
}
