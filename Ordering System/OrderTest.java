public class OrderTest {

    public static void main(String[] args) {

        OrderCalculator calculator = new DefaultOrderCalculator();
        OrderPlacer placer = new DefaultOrderPlacer();
        InvoiceGenerator invoiceGenerator = new DefaultInvoiceGenerator();
        EmailNotifier emailNotifier = new DefaultEmailNotifier();

        Order order = new OrderAction(calculator, placer, invoiceGenerator, emailNotifier);
        double total = order.calculateTotal(10.0, 2);
        System.out.println("Order total: $" + total);
        order.placeOrder("John Doe", "123 Main St.");
        order.generateInvoice("order_123.pdf");
        order.sendEmailNotification("johndoe@example.com");

    }

}
