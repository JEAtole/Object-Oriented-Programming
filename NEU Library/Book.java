public class Book implements Resource{

    private String title;

    public Book(String title) {
        this.title = title;
    }

    @Override
    public String getTitle() {
        return title;
    }

    @Override
    public void borrow(String name) {
        System.out.println("Student: " + name);
        System.out.println("Borrowing book: " + getTitle());
    }
}
