import java.util.Scanner;
public class biggest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number ");
         int a = sc.nextInt();
         System.out.print("Enter second number ");
         int b = sc.nextInt();
         System.out.print("Enter third number ");
         int c = sc.nextInt();
         if(a>b){
            if(a>c){
                System.out.println("Is the first number largest? Yes");
            }
            else{
                System.out.println("Is the third number largest? Yes");
            }
         }
         else if(b>c){
            System.out.println("Is the second number largest? Yes");
         }
         else{
            System.out.println("Is the third number largest? Yes");
         }
    }
}
