public class POSMain {
    public static void main(String[] args) {
        Transaction[] transactions = {
            new Transaction("Product A", 3, 10.0),
            new Transaction("Product B", 2, 20.0),
            new Transaction("Product A", 1, 10.0),
            new Transaction("Product C", 5, 15.0)
        };

        MonthlySalesReport monthlySalesReport = new MonthlySalesReport(transactions);
        monthlySalesReport.generateReport();

        ProductWiseReport productWiseReport = new ProductWiseReport(transactions);
        productWiseReport.generateReport();
    }
}
