public class AudioBook implements Resource{

    private String title;

    public AudioBook(String title) {
        this.title = title;
    }

    @Override
    public String getTitle() {
        return title;
    }

    @Override
    public void borrow(String name) {
        System.out.println("Student: " + name);
        System.out.println("Borrowing audio book: " + getTitle());
    }
}
