import java.util.*;

public class LineComparisonuc3 {

   public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the Co-ordinates of x1 and y1 : ");

        int x1 = sc.nextInt();
        int y1 = sc.nextInt();

        System.out.println("Enter the Co-ordinates of x2 and y2 : ");

        int x2 = sc.nextInt();
        int y2 = sc.nextInt();

        double length1 = Math.sqrt((x2 - x1)^2  +  (y2 - y1)^2);

        System.out.println("Enter the Co-ordinates of x3 and y3 : ");

        int x3 = sc.nextInt();
        int y3 = sc.nextInt();

        System.out.println("Enter the Co-ordinates of x4 and y4 : ");

        int x4 = sc.nextInt();
        int y4 = sc.nextInt();

        double length2 = Math.sqrt((x4 - x3)^2  +  (y4 - y3)^2);

        System.out.println("Length of the given Line1 is : " + length1 + " units" );
        System.out.println("Length of the given Line2 is : " + length2 + " units" );

        if (length1 >= length2)
        {
           System.out.println("Length of line 1 is greater than line 2");
        }
        else if (length1 <= length2)
        {
           System.out.println("Length of line 1 is lesser than line 2");
        }
        else
        {
           System.out.println("Both lines are equal");
        }
    }

}
