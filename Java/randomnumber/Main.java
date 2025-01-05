import java.util.Random;

public class Main{
    public static void main(String args[]) {

        Random random = new Random();

        // int number;
        // double number
        boolean isHeads;


        // number = random.nextInt(1,7);
        // number = random.nextDouble(1,7);
        isHeads = random.nextBoolean();

        if (isHeads) {
            
            System.out.println("HEADS");
        }
        else {
            System.out.println("TAILS");
            
        }
    }
}