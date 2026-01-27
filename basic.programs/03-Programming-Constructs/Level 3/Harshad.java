import java.util.Scanner;
public class Harshad {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum=0;
        int temp = n;
        while(n!=0){
            sum+=n%10;
            n/=10;
        }
        if(temp%sum==0){
            System.out.println("Harshad number");
        }
        else System.out.println("not a harshad number");
    }
}
