import java.util.Scanner;

public class Main{
    public static void main(String args[]) {
        
        // Shopping cart program

        Scanner scanner = new Scanner(System.in);
        
        String item ;
        double price ;
        int quantity;
        char currency = '$';
        double total; 


        System.out.print("What item would you like to buy: ");
        item = scanner.nextLine();
        
        System.out.print("How many would you like to buy?: ");
        quantity = scanner.nextInt();
        
        System.out.print("what is the price for each?: ");
        price = scanner.nextDouble();
       
        total = price * quantity;

        System.out.println("\nYou have bought " + quantity + " " + item + "/s");
        System.out.println("That will be: " + currency + total );
        scanner.close();
    }
}