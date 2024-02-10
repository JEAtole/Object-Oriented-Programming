package domain;
public class Course {
    private String courseCode;
    private String description;
    private Integer unit;
    private String day;
    private String time;

    public String toString() {
        String courseOutput = "";

        courseOutput += String.format("%-13.13s",courseCode) +
                        String.format("%-25.25s",description) +
                        String.format("%-7.7s",unit) +
                        String.format("%-6.6s",day) +
                        String.format("%-14.14s",time) +"\n";
        return courseOutput;
    }

    public void setCourseCode(String courseCode) {
        this.courseCode = courseCode;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setUnit(Integer unit) {
        this.unit = unit;
    }

    public void setDay(String day) {
        this.day = day;
    }

    public void setTime(String time) {
        this.time = time;
    }

}
