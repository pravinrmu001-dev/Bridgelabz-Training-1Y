import java.util.Scanner;

public class AreaOfCircle{
	 public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
		double Area,radius;
		System.out.println("Enter radius: ");
		radius=sc.nextDouble();

		Area = Math.PI * radius*radius;
		System.out.println("Area of circle is" +Area);
	}
}	
		