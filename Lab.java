import java.util.Scanner;

public class Lab {
    public static void main (String[] args){
        boolean a = false;
        String b;
        String[] bAr;
        System.out.println("Enter the coordinates please:");
        Scanner input = new Scanner(System.in);
//vvodim tochki
        b = input.nextLine();
        bAr = b.split(" ");
        Point3d p1 = new Point3d(Double.parseDouble(bAr[0])), Double.parseDouble(bAr[1]), Double.parseDouble(bAr[2]);
        b = input.nextLine();
        bAr = b.split(" ");
        Point3d p2 = new Point3d(Double.parseDouble(bAr[0])), Double.parseDouble(bAr[1]), Double.parseDouble(bAr[2]);
        b = input.nextLine();
        bAr = b.split(" ");
        Point3d p3 = new Point3d(Double.parseDouble(bAr[0])), Double.parseDouble(bAr[1]), Double.parseDouble(bAr[2]);

    }

        public static double computeArea(Object ob1, Object ob2, Object ob3){
            Point3d l1 = (Point3d) ob1;
            Point3d l2 = (Point3d) ob2;
            Point3d l3 = (Point3d) ob3;
            double m1 = l1.distanceTo(l1);
            double m2 = l2.distanceTo(l2);
            double m3 = l3.distanceTo(l3);
            double per = (m1+m2+m3)/2; //полупериметр
            double ger = Math.sqrt(per*(per - m1)*(per - m2)*(per - m3)); //формула Герона
            return ger;
        }
if (p1.equeals(p2) || p1.equeals(p3) || p2.equeals(p3))

    {
        a = true;
        System.out.println("\n" +
                "Points are equal to each other");
    }
else

    {
        a = false;
    }

        if (a == false ){
    double str = (computeArea(p1, p2, p3));
    System.out.println("\n" +
            "The area of the triangle is");
}
    }

