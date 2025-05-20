import java.util.ArrayList;
import java.util.List;

public class Portfolio {
    private List<Valuable> items;

    public Portfolio() {
        items = new ArrayList<>();
    }

    public void addValuable(Valuable item) {
        items.add(item);
    }

    public double getTotalValue() {
        double total = 0;
        for (Valuable item : items) {
            total += item.getValue();
        }
        return total;
    }
}
