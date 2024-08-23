public class MonthlySalesReport {
    Transaction[] transactions;

    MonthlySalesReport(Transaction[] transactions) {
        this.transactions = transactions;
    }

    public void generateReport() {
        double totalRevenue = 0;
        int totalTransactions = transactions.length;

        for (int i = 0; i < totalTransactions; i++) {
            totalRevenue += transactions[i].getTotal();
        }

        System.out.println("Monthly Sales Report:");
        System.out.println("Total Revenue: $" + totalRevenue);
        System.out.println("Total Transactions: " + totalTransactions);
    }
}
