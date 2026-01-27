import java.util.Scanner;
public class smallestandtallest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter age of Aman ");
        int a = sc.nextInt();
         System.out.print("Enter age of Akbar ");
        int b = sc.nextInt();
         System.out.print("Enter age of Anthony ");
        int c = sc.nextInt();
        System.out.print("Enter height of Aman ");
        int d = sc.nextInt();
         System.out.print("Enter height of Akbar ");
        int e = sc.nextInt();
         System.out.print("Enter height of Anthony ");
        int f = sc.nextInt();
        if(a<b && a<c){
            System.out.println("Aman is youngest");
        }
        else if(b<a && b<c){
            System.out.println("Akbar is youngest");
        }
        else if(c<a && c<b){
            System.out.println("Anthony is youngest");
        }
          if(d>e && d>f){
            System.out.println("Aman is tallest");
        }
        else if(e>d && e>f){
            System.out.println("Akbar is tallest");
        }
        else if(f>d && f>e){
            System.out.println("Anthony is tallest");
        }
    }
}
