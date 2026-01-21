import java.util.Scanner;
public class totalprice {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Unit Price : ");
        int a = sc.nextInt();
        System.out.print("Enter quantity : ");
        int b = sc.nextInt();
        int t = a*b;
        System.out.println("The total purchase price is INR "+t+" if the quantity "+b+" and unit price is INR "+a);
        
    }
}
