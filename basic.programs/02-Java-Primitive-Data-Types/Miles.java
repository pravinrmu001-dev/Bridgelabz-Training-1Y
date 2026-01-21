import java.util.Scanner;

public class Miles{
	 public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
		double km,miles;
		
		System.out.println("Enter km: ");
		km=sc.nextDouble();
		
		miles = km * 0.621371;
		System.out.println("Convert=" +miles);
	}
}	
