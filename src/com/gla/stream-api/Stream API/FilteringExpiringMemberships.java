import java.util.*;
import java.time.*;

class Member {
    String name;
    LocalDate expiryDate;

    Member(String name, LocalDate expiryDate) {
        this.name = name;
        this.expiryDate = expiryDate;
    }

    public String toString() {
        return name + " | Expiry: " + expiryDate;
    }
}

public class ExpiringMemberships {
    public static void main(String[] args) {
        List<Member> members = Arrays.asList(
                new Member("Anant", LocalDate.now().plusDays(10)),
                new Member("Ravi", LocalDate.now().plusDays(40)),
                new Member("Priya", LocalDate.now().plusDays(25)),
                new Member("Suman", LocalDate.now().plusDays(5))
        );

        LocalDate today = LocalDate.now();
        LocalDate next30Days = today.plusDays(30);

        members.stream()
                .filter(m -> !m.expiryDate.isBefore(today) && !m.expiryDate.isAfter(next30Days))
                .forEach(System.out::println);
    }
}