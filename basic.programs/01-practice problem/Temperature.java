import java.util.Scanner;

public class Temperature{
	 public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
		double c,f;
		System.out.println("Enter temperature in celsius: ");
		c=sc.nextDouble();
		
		f = (c * 9/5) + 32;
		System.out.println("The temperature in fahrenheit is" +f);
	}
}
