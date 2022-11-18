import java.util.*;

public class Main {
    public static boolean isMatch(int a, int b){
        if (a==b) return true;
        return false;
    }
    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);
        int number_tried;
         int numberToBeMatched = (int)(Math.random()*100);

         do {
             System.out.println("Guess my Number between 1-100: ");
             number_tried = scn.nextInt();

             if (number_tried==numberToBeMatched){
                 System.out.println("Correct Guess");
                 break;
             }
             else if (number_tried < numberToBeMatched){
                 System.out.println("Number guessed is small");
             }
             else {
                 System.out.println("Number guessed is large");
             }
         } while(number_tried >= 0);

        System.out.println("My number was " + number_tried);
    }
}