public class EJournal implements Resource{

    private String title;

    public EJournal(String title) {
        this.title = title;
    }

    @Override
    public String getTitle() {
        return title;
    }

    @Override
    public void borrow(String name) {
        System.out.println("Student: " + name);
        System.out.println("Borrowing e-journal: " + getTitle());
    }

}
