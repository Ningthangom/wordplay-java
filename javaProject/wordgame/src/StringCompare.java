import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class StringCompare {
    
    private static Integer MAX_CHAR = 6;
    private static Integer limit = 0;
    String loweredCaseS1;
    boolean outcome = false;

    public static int stringCompare(String str1, String str2) {

        int l1 = str1.length();
        int l2 = str2.length();
        int lmin = Math.min(l1, l2);

        for (int i = 0; i < lmin; i++) {
            int str1_ch = (int) str1.charAt(i);
            int str2_ch = (int) str2.charAt(i);

            if (str1_ch != str2_ch) {
                return str1_ch - str2_ch;
            }
        }

        // Edge case for strings like
        // String 1="Geeks" and String 2="Geeksforgeeks"
        if (l1 != l2) {
            return l1 - l2;
        }

        // If none of the above conditions is true,
        // it implies both the strings are equal
        else {
            return 0;
        }
    };


    public static void compareString (String str1, String str2)  {

        String a = str1;
        String b = str2;
        int count = 1;

        System.out.println("String from array : " + a);
        System.out.println("Input String : " + b);

        if(str2.equals(str1)){
            System.out.println( "You guess is correct! you win");
            
        } else{
           System.out.println("your words are not the same");
        }
    }

    public static List<Integer> findDiffIndexes(String s1, String s2) {
        List<Integer> indexes = new ArrayList<Integer>();
        for (int i = 0; i < s1.length() && i < s2.length(); i++) {
            if (s1.charAt(i) != s2.charAt(i)) {
                indexes.add(i);
            }
        }
        return indexes;
    }


    public static Boolean hasMappingStrings (String s1, String s2) {

        // lower casing letter
        String loweredCaseS1 = s1.toLowerCase();
        String loweredCaseS2 = s2.toLowerCase();

        HashMap<Integer, String> StringOnemap = new HashMap<Integer, String>();
        HashMap<Integer, String> StringTwomap = new HashMap<Integer, String>();

        for (Integer i = 0; i < loweredCaseS1.length(); i++) {
            StringOnemap.put(i,String.valueOf(loweredCaseS1.charAt(i)));
        }

        for (Integer i = 0; i < loweredCaseS2.length(); i++) {
            StringTwomap.put(i, String.valueOf(loweredCaseS2.charAt(i)));
        }

        while (StringOnemap.equals(StringTwomap) == false && limit <= 5){
            if (StringOnemap.equals(StringTwomap)) {
                System.out.println("Two Strings are the same so you win");
                return true;
            } else {
                System.out.println("Two Words are not the same");

                // System.out.println(StringTwomap);
                if(limit <= 4) {
                    for (Integer i = 0; i < loweredCaseS1.length(); i++) {
                        
                        Set<Integer> hash = CheckKey.getKeysByValue(StringTwomap,
                                String.valueOf(loweredCaseS1.charAt(i)));
                        // System.out.println(hash);
                        if (hash.isEmpty()) {
                            System.out.println(String.valueOf(loweredCaseS1.charAt(i)) + " is not in the word.");

                        } else {
                            System.out.println(String.valueOf(loweredCaseS1.charAt(i)) + " is included in the word. ");
                            

                        }

                    }
                    loweredCaseS1 = UserInput.input().toLowerCase();
                    ++limit;
                    System.out.println("this is limit " + limit);
                    System.out.println(loweredCaseS1);

                    for (Integer i = 0; i < loweredCaseS1.length(); i++) {
                        StringOnemap.put(i, String.valueOf(loweredCaseS1.charAt(i)));
                    }

                }

               

            }
        }
        
        return StringOnemap.equals(StringTwomap);

    }


  

}

// the key and the value are the same then move to the next 




