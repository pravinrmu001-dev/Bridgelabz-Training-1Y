import java.util.Scanner;
public class height {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double heightincm = sc.nextDouble();
        double foot = heightincm/30.48;
        double inch = heightincm/2.54;
        System.out.println("Your Height in cm is "+heightincm+" While in feet is "+foot+" and inches is "+inch);
        
    }
}
