import java.util.Scanner;

public class Power{
	 public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
		int base,exponent;
		
		System.out.println("Enter base no.: ");
		base=sc.nextInt();
		
		System.out.println("Enter exponent no.: ");
		exponent=sc.nextInt();

		System.out.println("Result=" +Math.pow(base, exponent));
	}
}	
		