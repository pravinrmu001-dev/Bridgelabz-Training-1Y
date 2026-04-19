import java.util.*;

class Patient {
    int id;

    Patient(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }
}

public class PatientIDPrinting {
    public static void main(String[] args) {
        List<Patient> patients = new ArrayList<>();

        patients.add(new Patient(101));
        patients.add(new Patient(102));
        patients.add(new Patient(103));
        patients.add(new Patient(104));

        patients.stream()
                .map(Patient::getId)
                .forEach(System.out::println);
    }
}