import java.util.Scanner;
public class power2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int power = sc.nextInt();
        int f = 1;
        while(power!=0){
            f*=n;
            power--;
        }
        System.out.println(f);

    }
}

