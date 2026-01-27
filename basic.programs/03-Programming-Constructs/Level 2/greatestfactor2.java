import java.util.Scanner;
public class greatestfactor2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int count = n-1;
        while(count>1){
            if(n%count==0){
                System.out.println(count);
                break;
            }
            count--;
        }
    }
}
