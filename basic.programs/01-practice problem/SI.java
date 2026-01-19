import java.util.Scanner;

public class SI{
	 public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
		double SimpleInterest,Principal,Rate,Time;
		
		System.out.println("Enter Principal: ");
		Principal=sc.nextDouble();
		
		System.out.println("Enter Rate: ");
		Rate=sc.nextDouble();
		
		System.out.println("Enter Time: ");
		Time=sc.nextDouble();

		Simple Interest = (Principal * Rate * Time) / 100;
		System.out.println("Simple Interest=" +SI);
	}
}	
		