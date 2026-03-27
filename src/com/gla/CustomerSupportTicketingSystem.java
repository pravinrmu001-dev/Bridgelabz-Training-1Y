import java.util.*;

class Ticket extends Thread {

    private static int counter = 1;
    private static long totalTime = 0;
    private static int totalTickets = 0;
    private static Map<Integer, List<Long>> waitTimes = new HashMap<>();

    private int ticketId;
    private String type;
    private int priority;
    private int queuePosition;

    public Ticket(String type, int priority, int queuePosition) {
        this.ticketId = counter++;
        this.type = type;
        this.priority = priority;
        this.queuePosition = queuePosition;
        totalTickets++;
        waitTimes.putIfAbsent(priority, new ArrayList<>());
    }

    public void run() {
        try {
            long start = System.currentTimeMillis();

            System.out.println("Start -> Ticket#" + ticketId +
                    " Type: " + type +
                    " Agent: " + getName() +
                    " Priority: " + priority +
                    " QueuePos: " + queuePosition);

            int processTime = new Random().nextInt(5) + 1;
            Thread.sleep(processTime * 1000);

            long end = System.currentTimeMillis();
            long duration = end - start;

            synchronized (Ticket.class) {
                totalTime += duration;
                waitTimes.get(priority).add(duration);
            }

            System.out.println("Complete -> Ticket#" + ticketId +
                    " Type: " + type +
                    " Agent: " + getName() +
                    " Time: " + (duration / 1000) + "s");

        } catch (InterruptedException e) {
            System.out.println("Interrupted");
        }
    }

    public static void printStats() {
        System.out.println("\nTotal Processing Time: " + (totalTime / 1000) + " seconds");

        for (Map.Entry<Integer, List<Long>> entry : waitTimes.entrySet()) {
            List<Long> list = entry.getValue();
            long sum = 0;
            for (long t : list) sum += t;
            if (!list.isEmpty()) {
                System.out.println("Priority " + entry.getKey() +
                        " Avg Time: " + (sum / list.size()) / 1000 + " seconds");
            }
        }
    }
}

public class Main {
    public static void main(String[] args) throws Exception {

        List<Ticket> tickets = new ArrayList<>();

        tickets.add(new Ticket("Critical Bug", 10, 1));
        tickets.add(new Ticket("Feature Request", 4, 2));
        tickets.add(new Ticket("General Query", 2, 3));
        tickets.add(new Ticket("Feedback", 1, 4));
        tickets.add(new Ticket("Critical Bug", 10, 5));
        tickets.add(new Ticket("Feature Request", 4, 6));
        tickets.add(new Ticket("General Query", 2, 7));
        tickets.add(new Ticket("Feedback", 1, 8));
        tickets.add(new Ticket("Critical Bug", 10, 9));
        tickets.add(new Ticket("Feature Request", 4, 10));

        for (int i = 0; i < tickets.size(); i++) {
            tickets.get(i).setName("Agent-" + (i + 1));
            tickets.get(i).setPriority(tickets.get(i).getPriority());
        }

        tickets.sort((a, b) -> b.getPriority() - a.getPriority());

        for (Ticket t : tickets) t.start();
        for (Ticket t : tickets) t.join();

        Ticket.printStats();
    }
}