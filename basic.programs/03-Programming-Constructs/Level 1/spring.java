import java.util.Scanner;
public class spring {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the month number ");
        int month = sc.nextInt();
        System.out.println("Enter the date ");
        int date = sc.nextInt();
        if(month>=3 && month<=6){
            if(month==3){
                if(date>=20 && date<=31){
                    System.out.println("Its a Spring season");
                }
                else {
                    System.out.println("Not a spring season");
                }
            }
            else if(month == 6){
                if(date>=1 && date<=20){
                    System.out.println("Its a Spring season");
                }
                else {
                    System.out.println("");
                }
            }
            else if(month == 4){
                    if(date>=1 && date<=30){
                        System.out.println("Its a Spring season");
                    }
                    else System.out.println("Not a spring season");
                }
                else{
                    System.out.println("Its a spring season");
                }

        }
    }
}
