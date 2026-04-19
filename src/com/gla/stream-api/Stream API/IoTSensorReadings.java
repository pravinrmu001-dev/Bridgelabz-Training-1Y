import java.util.*;

public class SensorReadings {
    public static void main(String[] args) {
        List<Double> readings = Arrays.asList(22.5, 30.2, 18.7, 35.0, 27.3);

        double threshold = 25.0;

        readings.stream()
                .filter(r -> r > threshold)
                .forEach(r -> System.out.println("Reading: " + r));
    }
}