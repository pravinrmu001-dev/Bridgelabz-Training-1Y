import java.util.Scanner;
public class quotient {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = a/b;
        int d = a%b;
        System.out.println("The Qoutient is "+c+" and Remainder is "+d+" of two number "+a+" and "+b);
    }
}
