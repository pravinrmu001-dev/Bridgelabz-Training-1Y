import java.util.Scanner;
public class Bonuses {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your Salary ");
        int s = sc.nextInt();
        System.out.print("Enter year of Service ");
        int y = sc.nextInt();
        if(y>=5){
            double bonus = 0.05*s;
            System.out.println(bonus);
        }
        else{
            System.out.println("candidate is not applicable");
        }
    }
}
