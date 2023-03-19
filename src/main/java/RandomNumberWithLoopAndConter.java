import java.util.Random;

public class RandomNumberWithLoopAndConter {
    public static void main(String[] args) {
//        System.out.println("Hello math");

        //Create the instance of random
        Random random=new Random();

        //initialize the counter to zero
        int counter = 0;

        //loop from 1 to 10  or loop 10 times
        for (int i = 0; i < 10; i++) {

            //generate the random number from 1 to 100
            int randomNumber = random.nextInt(100)+1;

            //Print the random number
            System.out.println("Random number "+ randomNumber);

            //increment the counter
            counter++;


        }
        //print the total random number generated
        System.out.println("print the total random number generated " + counter);
    }
}
