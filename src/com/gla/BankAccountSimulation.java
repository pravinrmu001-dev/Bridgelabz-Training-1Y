class BankAccount implements Runnable {

    private String accountHolder;
    private String accountType;

    public BankAccount(String accountHolder, String accountType) {
        this.accountHolder = accountHolder;
        this.accountType = accountType;
    }

    public void run() {
        try {
            for (int i = 1; i <= 3; i++) {
                System.out.println(
                    Thread.currentThread().getName() +
                    " (" + accountType + ")" +
                    " is checking balance... [Priority: " +
                    Thread.currentThread().getPriority() + "]"
                );
                Thread.sleep(2000);
            }
        } catch (InterruptedException e) {
            System.out.println("Thread interrupted");
        }
    }
}

public class Main {
    public static void main(String[] args) {

        BankAccount premiumUser = new BankAccount("Anant", "Premium");
        BankAccount regularUser = new BankAccount("Rahul", "Regular");
        BankAccount basicUser = new BankAccount("Ravi", "Basic");

        Thread t1 = new Thread(premiumUser, "User-1");
        Thread t2 = new Thread(regularUser, "User-2");
        Thread t3 = new Thread(basicUser, "User-3");

        t1.setPriority(10);
        t2.setPriority(5);
        t3.setPriority(1);

        t1.start();
        t2.start();
        t3.start();
    }
}