
import java.util.HashMap;

import java.util.Set;

public class StringCompare {
    
    private static Integer limit = 0;
    String loweredCaseS1;
  

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

                  //System.out.println(StringTwomap);
                if(limit <= 5) {
                    for (Integer i = 0; i < loweredCaseS1.length(); i++) {
                        
                        Set<Integer> hash = CheckKey.getKeysByValue(StringTwomap,
                                String.valueOf(loweredCaseS1.charAt(i)));
                        // System.out.println(hash);
                        if (hash.isEmpty()) {
                            System.out.println(String.valueOf(loweredCaseS1.charAt(i)) + " is not in the word.");

                        } else {
                            Integer[] value = hash.toArray(new Integer[hash.size()]);
  
                            System.out.println(String.valueOf(loweredCaseS1.charAt(i)) + " is included in the word and is located at " +( value[0] + 1));
                            

                        }

                    }
                    loweredCaseS1 = UserInput.input().toLowerCase();
                    ++limit;
                    System.out.println("This is limit " + limit);
                    System.out.println(loweredCaseS1);

                    for (Integer i = 0; i < loweredCaseS1.length(); i++) {
                        StringOnemap.put(i, String.valueOf(loweredCaseS1.charAt(i)));
                    }

                }else {
                    System.out.println("The word was " + s2);
                    System.out.println("You have reached the limit");
                    return false;
                }

               

            }
        }
        
        return StringOnemap.equals(StringTwomap);

    }

}

// the key and the value are the same then move to the next 




