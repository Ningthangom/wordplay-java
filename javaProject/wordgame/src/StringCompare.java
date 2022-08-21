import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class StringCompare {
    
    private static Integer MAX_CHAR = 6;

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


    public static void hasMappingStrings (String s1, String s2) {

        HashMap<Integer, String> StringOnemap = new HashMap<Integer, String>();
        HashMap<Integer, String> StringTwomap = new HashMap<Integer, String>();

        for (Integer i = 0; i < s1.length(); i++) {
            StringOnemap.put(i,String.valueOf(s1.charAt(i)));
        }

        for (Integer i = 0; i < s2.length(); i++) {
            StringTwomap.put(i, String.valueOf(s2.charAt(i)));
        }

        System.out.println("Iterating Hashmap...");
        for (Map.Entry m : StringOnemap.entrySet()) {
            System.out.println(m.getKey() + " " + m.getValue());
        }

        System.out.println("Iterating Hashmap 2...");
        for (Map.Entry m : StringTwomap.entrySet()) {
            System.out.println(m.getKey() + " " + m.getValue());
        }

        if(StringOnemap.equals(StringTwomap)){
            System.out.println("Two Strings are the same so you win");
        }else{
            System.out.println("Two Strings are not the same");
            for(Integer i = 0; i < s1.length(); i++) {
                if(StringTwomap.containsValue(String.valueOf(s1.charAt(i)))){
                    System.out.println(s1.charAt(i) + " is included in " + s2);
                    System.out.println("The key value for " + s1 + " is " + StringTwomap.equals(String.valueOf(s1.charAt(i))));
                }else{
                    System.out.println(s1.charAt(i) + " is not included " + s2);
                }
            }
        }

    }


  

}

// the key and the value are the same then move to the next 




