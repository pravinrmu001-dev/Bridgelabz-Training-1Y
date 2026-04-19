import java.util.*;

public class StockPriceLogger {
    public static void main(String[] args) {
        List<Double> stockPrices = Arrays.asList(245.50, 247.80, 243.10, 249.00, 250.75);

        stockPrices.forEach(price -> System.out.println("Stock Price: " + price));
    }
}