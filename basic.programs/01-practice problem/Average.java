import java.util.Scanner;

public class Average{
	 public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
		float n1,n2,n3;
		
		System.out.println("Enter 1st no.: ");
		n1=sc.nextDouble();
		
		System.out.println("Enter 2nd no.: ");
		n2=sc.nextDouble(); 
		
		System.out.println("Enter 3rd no.: ");
		n3=sc.nextDouble();
		
		float average= (n1+n2+n3)/3;

		System.out.println("Average=" +average);
	}
}	
		