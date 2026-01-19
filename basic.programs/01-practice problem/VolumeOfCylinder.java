import java.util.Scanner;

public class VolumeOfCylinder{
	 public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
		double Volume,height,radius;
		
		System.out.println("Enter radius: ");
		radius=sc.nextDouble();
		
		System.out.println("Enter height: ");
		height=sc.nextDouble();

		Volume = Math.PI * radius*radius * height;
		System.out.println("Volume of cylinder is" +Volume);
	}
}	
		