import java.util.Scanner;

public class UserInput {
    
  public static String input () {
    
        Scanner myObj = new Scanner(System.in); // Create a Scanner object
        System.out.println("Please enter 5 letter word");

        String inputWord = myObj.nextLine(); // Read user inputds
        // System.out.println("Username is: " + inputWord); // Output user input

        if(inputWord.length() != 5) {
            System.out.println("You enter the wrong number of letter");
            inputWord = myObj.nextLine();
            return inputWord;
        } else{
            System.out.println("Your word is : " + inputWord);
        }


        return inputWord;
  }

}
