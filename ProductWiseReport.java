public class ProductWiseReport {
    Transaction[] transactions;

    ProductWiseReport(Transaction[] transactions) {
        this.transactions = transactions;
    }

    public void generateReport() {
        System.out.println("Product-Wise Report:");

        for (int i = 0; i < transactions.length; i++) {
            String productName = transactions[i].getProductName();
            int totalQuantity = 0;

            for (int j = 0; j < transactions.length; j++) {
                if (transactions[j].getProductName().equals(productName)) {
                    totalQuantity += transactions[j].getQuantity();
                }
            }

            System.out.println("Product: " + productName + ", Units Sold: " + totalQuantity);
        }
    }
}
s