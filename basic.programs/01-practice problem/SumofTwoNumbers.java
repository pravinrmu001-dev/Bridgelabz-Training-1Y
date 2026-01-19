import java.util.Scanner;

public class SumofTwoNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num1;
        int num2;
		int sum;
		
		System.out.println("Enter a number");
		num1=sc.nextInt();
		
		System.out.println("Enter another number");
		num2=sc.nextInt();
		
        sum = num1 + num2;

        System.out.println("Sum = " +sum);
    }
}