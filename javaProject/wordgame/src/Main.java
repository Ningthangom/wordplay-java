import java.util.Arrays;
import java.util.Random;
import java.util.*;

public class Main {

    public static void main(String[] args) {

        // String[] myArray = { "abcde", "whate", "12345", "angel" };
        List<String> myArray = WordList.list;
        System.out.println(WordList.list);

        Random rand = new Random();

        // System.out.println(myArray[newRandom.nextInt(myArray.length)]);

        String stringFromArray = myArray.get(rand.nextInt(myArray.size()));
        // System.out.println(stringFromArray);
        String userInput = UserInput.input();
        Boolean outcome = StringCompare.hasMappingStrings(userInput, stringFromArray);

        if (outcome == true) {
            System.out.println("Congratulations!! You guessed the right word !!!! you win");
        } else {
            System.out.println("You lost!! Better luck next time ");
        }
        // use Record
    }

}