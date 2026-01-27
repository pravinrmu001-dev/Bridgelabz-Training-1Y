import java.util.Scanner;
public class Check2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double n = sc.nextDouble();
        double total = 0;
        double g=n;
        for(int i=1;i<=n;i++){
            total=total+i;
        }
        double sum = g*(g+1)/2;
        if(sum == total){
            System.out.println("both computations was correct");
        }
        else{
            System.out.println("both are not equal");
        }
    }
}
