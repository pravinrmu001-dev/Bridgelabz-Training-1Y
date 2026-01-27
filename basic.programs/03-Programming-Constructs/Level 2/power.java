import java.util.Scanner;
public class power {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int power = sc.nextInt();
        int f = 1;
        for(int i =1;i<=power;i++){
            f*=n;
        }
        System.out.println(f);

    }
}
