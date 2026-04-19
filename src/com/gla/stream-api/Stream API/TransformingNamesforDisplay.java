import java.util.*;

public class TransformNames {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Anant", "Ravi", "Priya", "Suman", "Amit");

        names.stream()
             .map(String::toUpperCase)
             .sorted()
             .forEach(System.out::println);
    }
}