import java.util.Scanner;
public class dis {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int fee = sc.nextInt();
        int discountpercentage = 10;
        int discount = fee*10/100;
        int discounted =fee - discount;
        System.out.println("The discount amount is INR "+discount+" and final discounted fee is INR "+discounted);
    }
}
