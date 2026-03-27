import java.time.LocalTime;

class Device implements Runnable {

    private String name;
    private int interval;

    public Device(String name, int interval) {
        this.name = name;
        this.interval = interval;
    }

    public void run() {
        try {
            for (int i = 1; i <= 5; i++) {
                System.out.println(
                    LocalTime.now() + " - " +
                    Thread.currentThread().getName() +
                    " [" + name + "] running... [Priority: " +
                    Thread.currentThread().getPriority() + "]"
                );
                Thread.sleep(interval);
            }
        } catch (InterruptedException e) {
            System.out.println("Interrupted");
        }
    }
}

public class Main {
    public static void main(String[] args) {

        Thread temp = new Thread(new Device("Temperature Sensor", 5000), "Temp-Thread");
        Thread security = new Thread(new Device("Security Camera", 3000), "Security-Thread");
        Thread light = new Thread(new Device("Light Controller", 4000), "Light-Thread");
        Thread door = new Thread(new Device("Door Lock Monitor", 6000), "Door-Thread");

        security.setPriority(10);
        temp.setPriority(7);
        light.setPriority(5);
        door.setPriority(5);

        temp.start();
        security.start();
        light.start();
        door.start();
    }
}