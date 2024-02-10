package domain;
import java.util.ArrayList;
public class BlockSection {
    private String blockCode;
    private String description;
    private String adviser;
    private int totalStudents;

    private ArrayList<Student> studentList;

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

    public void setBlockCode(String blockCode) {
        this.blockCode = blockCode;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setAdviser(String adviser) {
        this.adviser = adviser;
    }

    public void setStudentList(ArrayList<Student> studentList) {
        this.studentList = studentList;
    }

    public void setTotalStudents(int totalStudents) {
        this.totalStudents = totalStudents;
    }
}
