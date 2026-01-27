import java.util.Scanner;
public class armstrong {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum=0;
        int temp =n;
        int g=0;
       while(n!=0){
        g++;
        n/=10;
       }
        n = temp;
        while(n!=0){
            int h =1;
            for(int j=1;j<=g;j++){
                h= h*(n%10);
            }
            sum+=h;
            n/=10;
        }
        if(temp == sum){
            System.out.println("Armstrong number");
        }
        else{
            System.out.println("Not an armstron number");
        }
    }
}
