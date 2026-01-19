import java.util.Scanner;

public class Perimeter{
	 public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
		double Peri,length,width,a;
		
		System.out.println("Enter length: ");
		length=sc.nextDouble();
		
		System.out.println("Enter width: ");
		width=sc.nextDouble();
		
		a= length + width;
		Peri = 2 * a;
		System.out.println("Perimeter=" +Peri);
	}
}	
		