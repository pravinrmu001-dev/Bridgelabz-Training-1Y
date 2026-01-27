import java.util.Scanner;
public class sum2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double total = 0;
        double n = sc.nextInt();
        while(true){
            if(n==0){
                break;
            }
              total+=1;
              n--;
        }
        System.out.println(total);
    }
}
