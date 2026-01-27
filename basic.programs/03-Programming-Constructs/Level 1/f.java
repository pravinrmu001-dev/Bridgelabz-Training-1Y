import java.util.Scanner;
public class f {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int f = 1;
        if(n<0){
            System.out.println("factorial not valid");
        }
        else{
            for(int i =1;i<=n;i++){
                f*=i;
            }
        }
        if(n==0){
            System.out.println(0);
        }
        else
        System.out.println(f);
    }
}
