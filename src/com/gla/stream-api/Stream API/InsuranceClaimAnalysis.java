import java.util.*;
import java.util.stream.*;

class Claim {
    String type;
    double amount;

    Claim(String type, double amount) {
        this.type = type;
        this.amount = amount;
    }

    public String getType() {
        return type;
    }

    public double getAmount() {
        return amount;
    }
}

public class InsuranceAnalysis {
    public static void main(String[] args) {
        List<Claim> claims = Arrays.asList(
                new Claim("Health", 5000),
                new Claim("Auto", 12000),
                new Claim("Health", 8000),
                new Claim("Home", 15000),
                new Claim("Auto", 7000),
                new Claim("Health", 6000)
        );

        Map<String, Double> avgClaim = claims.stream()
                .collect(Collectors.groupingBy(
                        Claim::getType,
                        Collectors.averagingDouble(Claim::getAmount)
                ));

        avgClaim.forEach((type, avg) ->
                System.out.println(type + " -> Average Claim: " + avg));
    }
}