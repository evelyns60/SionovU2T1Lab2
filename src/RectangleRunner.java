import java.util.Scanner;

public class RectangleRunner {
    public static void main (String[]args){
        Scanner myScanner = new Scanner(System.in);
        System.out.print("Enter rectangle 1 length: ");
        int rect1Length = myScanner.nextInt();
        System.out.print("Enter rectangle 1 width: ");
        int rect1Width = myScanner.nextInt();
        System.out.print("Enter rectangle 1 height: ");
        double rect1Height = myScanner.nextDouble();
        System.out.print("Enter rectangle 2 length: ");
        int rect2Length = myScanner.nextInt();
        System.out.print("Enter rectangle 2 width: ");
        int rect2Width = myScanner.nextInt();
        System.out.print("Enter rectangle 2 height: ");
        double rect2Height = myScanner.nextDouble();

        Rectangle rect1 = new Rectangle(rect1Length, rect1Width);
        int rect1Area = rect1.calculateArea();
        double rect1BoxVolume = rect1.calculateBoxVolume(rect1Height);

        Rectangle rect2 = new Rectangle(rect2Length, rect2Width);
        int rect2Area = rect2.calculateArea();
        double rect2BoxVolume = rect2.calculateBoxVolume(rect2Height);

        System.out.print("Rectangle 1's Area: " + rect1Area);
        System.out.println(", Box Volume: " + rect1BoxVolume);
        System.out.print("Rectangle 2's Area: " + rect2Area);
        System.out.print(", Box Volume: " + rect2BoxVolume);

    }
}