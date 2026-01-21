import java.util.Scanner;

public class Result {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
		for(int i=1;i<=10;i++){
		    int marks=sc.nextInt();
		
			if(marks<=50){
				System.out.println("Back aa gyi");
			}else if(marks<=60){
				System.out.println("D");
			}else if(marks<=70){
				System.out.println("C");
			}else if(marks<=80){
				System.out.println("B");
			}else if(marks<=90){
				System.out.println("A");
			}else{
				System.out.println("O");
			}	
		}
    }
}