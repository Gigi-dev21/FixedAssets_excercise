public class CreditCard implements Valuable {
    private String cardName;
    private double debt;

    public CreditCard(String cardName) {
        this.cardName = cardName;
        this.debt = 0;
    }

    public void charge(double amount) {
        debt += amount;
    }

    public void pay(double amount) {
        if (amount <= debt) {
            debt -= amount;
        } else {
            debt = 0;
        }
    }

    public double getValue() {
        return -debt; // Negative because it's a liability
    }

    public String getCardName() {
        return cardName;
    }
}
