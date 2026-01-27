import java.util.Scanner;
public class prime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a = 0;
        if(n>=2){
            for(int i =2;i<n;i++){
                if(n%i==0){
                    a=1;
                }
            }
        if(a==1){
            System.out.println(n+" is not a prime number");
        }
        else{
            System.out.println(n+" is prime number");
        }
        }
        else{
            System.out.println("invalid number");
        }
    }
}
