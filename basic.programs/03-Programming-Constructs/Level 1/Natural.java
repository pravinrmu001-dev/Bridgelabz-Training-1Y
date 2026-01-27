import java.util.Scanner;
public class Natural {
  public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);
    System.out.println("Enter the number : ");
    int n = sc.nextInt();
    int sum = n*(n+1)/2;
    if(n>0){
        System.out.println("The sum of first "+n+" natural numbers is "+sum);
    }
    else{
        System.out.println("The number "+n+" is not a natural number");
    }
  }  
}
