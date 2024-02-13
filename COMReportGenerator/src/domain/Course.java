package domain;
public class Course {
    private final String courseCode;
    private final String description;
    private final Integer unit;
    private final String day;
    private final String time;

    public Course(String courseCode, String description, Integer unit, String day, String time) {
        this.courseCode = courseCode;
        this.description = description;
        this.unit = unit;
        this.day = day;
        this.time = time;
    }

    public String toString() {
        String courseOutput = "";

        courseOutput += String.format("%-13.13s",courseCode) +
                        String.format("%-25.25s",description) +
                        String.format("%-7.7s",unit) +
                        String.format("%-6.6s",day) +
                        String.format("%-14.14s",time) +"\n";
        return courseOutput;
    }

}
