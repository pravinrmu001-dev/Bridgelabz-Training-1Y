import java.util.Scanner;
public class sum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double total = 0;
        double n = sc.nextDouble();
        while(n!=0){
            total+=1;
            n--;
        }
        System.out.println(total);
    }
}
