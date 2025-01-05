import java.util.Scanner;
public class wtfMath{
    public static void main(String args[]) {
        // System.out.println(Math.PI);
        // System.out.println(Math.E);
/* 
        double result;
        
        result = Math.pow(4, 5);
        result = Math.abs(-5);
        result = Math.sqrt(7);
        result = Math.round(5.66);
        result = Math.ceil(5.01);
        result = Math.floor(5.999999999999);
        result = Math.max(5, 7);
        result = Math.min(5, 7);

        System.out.println(result);
*/      
        // Hypotenus c = Math.sqrt (a² + b²)

        Scanner scanner = new Scanner(System.in);

        double a;
        double b;
        double c;

        System.out.print("Enter the length of side A: ");
        a = scanner.nextDouble();

        System.out.print("Enter the length of side B: ");
        b = scanner.nextDouble();

        c = Math.sqrt(Math.pow(a,2) + Math.pow(b,2));

        System.out.print("\n5The Hypotenus (the side C): " + c );
        
        scanner.close();

    }
}