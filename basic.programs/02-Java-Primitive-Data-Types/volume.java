public class volume {
    public static void main(String[] args) {
        double radius = 6378;
        double volume = 4.0/3*3.1415*radius*radius*radius;
        double volmile = 1.609*volume;
        System.out.println("The Volume of earth in cubic kilometers is "+volume+" and cubic miles is "+volmile );
    }
}
