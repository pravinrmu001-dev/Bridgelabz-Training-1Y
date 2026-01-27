import java.util.Scanner;
public class Factorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int f = 1;
        if(n<0){
            System.out.println("factorial not valid");
        }
        else{
            while(n!=0){
                f*=n;
                n--;
            }
        }
        if(n==0){
            System.out.println(0);
        }
        else
        System.out.println(f);
    }
}
