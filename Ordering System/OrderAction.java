public class OrderAction implements Order{

    private OrderCalculator orderCalculator;
    private OrderPlacer orderPlacer;
    private InvoiceGenerator invoiceGenerator;
    private EmailNotifier emailNotifier;

    public OrderAction(OrderCalculator orderCalculator, OrderPlacer orderPlacer, InvoiceGenerator invoiceGenerator, EmailNotifier emailNotifier) {
        this.orderCalculator = orderCalculator;
        this.orderPlacer = orderPlacer;
        this.invoiceGenerator = invoiceGenerator;
        this.emailNotifier = emailNotifier;
    }

    @Override
    public double calculateTotal(double price, int quantity) {
        return orderCalculator.calculateTotal(price, quantity);
    }

    @Override
    public void placeOrder(String customerName, String address) {
        orderPlacer.placeOrder(customerName, address);
    }

    @Override
    public void generateInvoice(String fileName) {
        invoiceGenerator.generateInvoice(fileName);
    }

    @Override
    public void sendEmailNotification(String email) {
        emailNotifier.sendEmailNotification(email);
    }
}
