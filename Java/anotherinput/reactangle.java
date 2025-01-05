// package Java.myareacalcalutor;
import java.util.Scanner;

public class reactangle {
    public static void main(String[] args) {

        // Calculate the area of a Rectangle
        
        double width = 0;
        double height = 0;
        double area = 0;

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the width: ");
        width = scanner.nextDouble();

        System.out.print("Enter the height: ");
        height = scanner.nextDouble();
        
        area = width + height;

        System.out.print("The area is " + area + "cm²" );
        area = scanner.nextDouble();

        scanner.close();


    }
    
}
