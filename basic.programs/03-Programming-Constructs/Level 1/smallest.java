import java.util.Scanner;
public class smallest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number ");
         int a = sc.nextInt();
         System.out.print("Enter second number ");
         int b = sc.nextInt();
         System.out.print("Enter third number ");
         int c = sc.nextInt();
         if(a<b){
            if(a<c){
                System.out.println("Is the first number smallest? Yes");

            }
            else{
                System.out.println("Is the first number smallest? NO");
            }
         }
         else{
            System.out.println("Is the first number smallest? NO");
         }
    }
}
