public class TestProgram {
    public static void main(String[] args) {
        Student student = new Student("Ellen");

        Resource book = new Book("Design Patterns");
        Resource journal = new Journal("Computer Science Journal");
        Resource audioBook = new AudioBook("The Pragmatic Programmer");
        Resource eJournal = new EJournal("Digital Libraries");

        student.borrowResource(book);
        System.out.println("----------------------------------------");
        student.borrowResource(journal);
        System.out.println("----------------------------------------");
        student.borrowResource(audioBook);
        System.out.println("----------------------------------------");
        student.borrowResource(eJournal);
    }
}
