import java.util.Scanner;
public class triangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Base : ");
        int base = sc.nextInt();
         System.out.print("height :  ");
        int height = sc.nextInt();
        double area = (0.5)*base*height;
        System.out.println(area);
    }
}
