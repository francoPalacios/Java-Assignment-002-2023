import java.util.Scanner;

public class ArchimedesPiMethod {
    public static void main(String[] args) {

        System.out.println("enter the number of sides in the polygon: "); // N side of polygon
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        System.out.println("number of sides: "+n);

        int b = 360/n;                                                     //angle B
        System.out.println("angle B equals: "+b);


        int a = b/2;                                                       //angle A which is 1/2 of angle B
        System.out.println("angle A equals: "+a);


        double s = 2*Math.sin(Math.toRadians(a));                           //S is the base of a triangle within the polygon
        System.out.println("Side S equals: "+s);


        double p = n*s;
        System.out.println("perimeter equals: "+p);
        System.out.println("");

        double pi = p/2;
        System.out.println("PI equals: ");
        System.out.println(pi);


    }
}
