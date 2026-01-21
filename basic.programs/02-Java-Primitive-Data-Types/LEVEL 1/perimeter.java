import java.util.Scanner;
public class perimeter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double perimeter = sc.nextInt();
        double side = perimeter/4;
        System.out.println("The length of the side is "+side+" whose perimemter is "+perimeter);
    }
}
