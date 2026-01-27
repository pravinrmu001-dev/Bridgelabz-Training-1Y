import java.util.Scanner;
public class percentageandgrade {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int maths = sc.nextInt();
        int chemistry = sc.nextInt();
        int physics = sc.nextInt();
        double per = (maths+chemistry+physics)/3;
        if(per>=80){
            System.out.println("level 4");
        }
        else if(per>=70 && per<80){
            System.out.println("level 3");
        }
        else if(per>=60 && per<70){
            System.out.println("level 2");
        }
        else if(per>=50 && per<60){
            System.out.println("level 1");
        }
        else if(per>=40 && per <50){
            System.out.println("level 1-");
        }
        else{
            System.out.println("Remedial standards");
        }
    }
}
