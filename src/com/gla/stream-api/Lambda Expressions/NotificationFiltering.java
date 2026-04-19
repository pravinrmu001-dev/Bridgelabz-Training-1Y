import java.util.*;
import java.util.function.Predicate;

class Alert {
    String type;
    String message;

    Alert(String type, String message) {
        this.type = type;
        this.message = message;
    }

    public String toString() {
        return type + ": " + message;
    }
}

public class NotificationFiltering {
    public static void main(String[] args) {
        List<Alert> alerts = new ArrayList<>();

        alerts.add(new Alert("EMERGENCY", "Heart rate critical"));
        alerts.add(new Alert("INFO", "Daily checkup reminder"));
        alerts.add(new Alert("WARNING", "Blood pressure high"));
        alerts.add(new Alert("EMERGENCY", "Oxygen level low"));

        Predicate<Alert> emergencyOnly = a -> a.type.equals("EMERGENCY");
        Predicate<Alert> warningAndAbove = a -> a.type.equals("EMERGENCY") || a.type.equals("WARNING");

        System.out.println("Emergency Alerts:");
        filterAlerts(alerts, emergencyOnly);

        System.out.println("\nWarning & Emergency Alerts:");
        filterAlerts(alerts, warningAndAbove);
    }

    public static void filterAlerts(List<Alert> alerts, Predicate<Alert> condition) {
        for (Alert a : alerts) {
            if (condition.test(a)) {
                System.out.println(a);
            }
        }
    }
}