import java.util.Arrays;
import java.util.Random;
import java.util.*;

public  class Main {



    public static void main(String[] args) {

       
        String[] myArray = { "abcde", "whate", "12345", "angel" };


        System.out.println(Arrays.toString(myArray));

         Random  newRandom = new Random();

        System.out.println(myArray[newRandom.nextInt(myArray.length)]);

        String stringFromArray = myArray[newRandom.nextInt(myArray.length)];

        // Scanner myObj = new Scanner(System.in); // Create a Scanner object
        // System.out.println("Please enter 5 letter word");

        // String inputWord = myObj.nextLine(); // Read user inputds
        // // System.out.println("Username is: " + inputWord); // Output user input

        // if(inputWord.length() != 5) {
        //     System.out.println("You enter the wrong number of letter");
        //     inputWord = myObj.nextLine();
        // } else{
        //     System.out.println("Your word is : " + inputWord);
        // }


        // 

        // System.out.println(StringCompare.stringCompare(stringFromArray, inputWord));
        // StringCompare.compareString(stringFromArray, inputWord);

        // System.out.println(StringCompare.findDiffIndexes(stringFromArray, inputWord));
         
        StringCompare.hasMappingStrings("apple", "applA");

        // use Record
    }



}