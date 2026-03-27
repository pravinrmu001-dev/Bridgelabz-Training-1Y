class Activity extends Thread {

    private String task;
    private int startDelay;
    private int cycles;
    private int interval;

    public Activity(String name, String task, int startDelay, int cycles, int interval) {
        super(name);
        this.task = task;
        this.startDelay = startDelay;
        this.cycles = cycles;
        this.interval = interval;
    }

    public void run() {
        try {
            Thread.sleep(startDelay);

            for (int i = 1; i <= cycles; i++) {
                System.out.println(getName() + " [" + task + "] State: " + getState());
                Thread.sleep(interval);
            }

            System.out.println(getName() + " [" + task + "] Completed");
        } catch (InterruptedException e) {
            System.out.println("Interrupted");
        }
    }
}

public class Main {
    public static void main(String[] args) throws Exception {

        Activity entry = new Activity("Entry-Thread", "Student Entry", 0, 5, 2000);
        Activity question = new Activity("Question-Thread", "Question Distribution", 5000, 3, 2000);
        Activity attendance = new Activity("Attendance-Thread", "Attendance Marking", 10000, 3, 2000);
        Activity collection = new Activity("Collection-Thread", "Answer Collection", 15000, 3, 2000);

        question.setPriority(10);
        attendance.setPriority(8);
        collection.setPriority(7);
        entry.setPriority(5);

        System.out.println(entry.getName() + " State: " + entry.getState());
        System.out.println(question.getName() + " State: " + question.getState());
        System.out.println(attendance.getName() + " State: " + attendance.getState());
        System.out.println(collection.getName() + " State: " + collection.getState());

        entry.start();
        question.start();
        attendance.start();
        collection.start();

        Thread.sleep(1000);

        System.out.println(entry.getName() + " State: " + entry.getState());
        System.out.println(question.getName() + " State: " + question.getState());
        System.out.println(attendance.getName() + " State: " + attendance.getState());
        System.out.println(collection.getName() + " State: " + collection.getState());

        entry.join();
        question.join();
        attendance.join();
        collection.join();

        System.out.println("All activities completed");
    }
}