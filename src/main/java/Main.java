public class Main {
    public static void main(String[] args) {
        Portfolio portfolio = new Portfolio();

        FixedAsset house = new FixedAsset("House", 300000);
        FixedAsset jewelry = new FixedAsset("Jewelry", 15000);

        BankAccount savings = new BankAccount("Savings", 10000);
        savings.deposit(2000);
        savings.withdraw(500);

        CreditCard creditCard = new CreditCard("Visa");
        creditCard.charge(3000);
        creditCard.pay(1000);

        portfolio.addValuable(house);
        portfolio.addValuable(jewelry);
        portfolio.addValuable(savings);
        portfolio.addValuable(creditCard);

        System.out.println("Total Portfolio Value: $" + portfolio.getTotalValue());
    }
}
