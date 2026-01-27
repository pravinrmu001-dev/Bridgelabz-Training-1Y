import java.util.Scanner;
public class BMI {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double w = sc.nextDouble();
        double h = sc.nextDouble();
        double BMI = 10000*(w/h/h);
        if(BMI<=18.4){
            System.out.println("Underweight");
        }
        else if(BMI>=18.5 && BMI<=24.9){
            System.out.println("Normal");
        }
        else if(BMI>=25.0 && BMI<=39.9){
            System.out.println("Overweight");
        }
        else System.out.println("Obese");
    }
}
