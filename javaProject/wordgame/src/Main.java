
import java.util.Random;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws FileNotFoundException{

      // scanning data from json file
        Scanner wordlist = new Scanner(new File("C:/Users/User/Desktop/nology/course/projects/wordplay-java/javaProject/wordgame/src/wordlist"));
        
        List<String> myArray = new ArrayList<>();

        while(wordlist.hasNext()){
            // System.out.println(wordlist.nextLine());
            myArray.add(wordlist.nextLine().replaceAll("[^\\w]", ""));
        }
        // myArray.removeAll(Arrays.asList("", null));
        Random rand = new Random();

        // System.out.println(myArray[newRandom.nextInt(myArray.length)]);

        String stringFromArray = myArray.get(rand.nextInt(myArray.size()));
         System.out.println(stringFromArray);
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