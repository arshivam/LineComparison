import java.util.*;

public class LineComparisonuc1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the Co-ordinates of x1 and y1 : ");

        int x1 = sc.nextInt();
        int y1 = sc.nextInt();

        System.out.println("Enter the Co-ordinates of x2 and y2 : ");

        int x2 = sc.nextInt();
        int y2 = sc.nextInt();

        double length = Math.sqrt((x2 - x1)^2  +  (y2 - y1)^2);
        System.out.println("Length of the given Line is : " + length + " units" );
    }

}
