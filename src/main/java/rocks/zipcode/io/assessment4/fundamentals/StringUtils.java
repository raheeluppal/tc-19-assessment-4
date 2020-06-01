package rocks.zipcode.io.assessment4.fundamentals;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

/**
 * @author leon on 09/12/2018.
 */
public class StringUtils {
    public static String capitalizeNthCharacter(String str, Integer indexToCapitalize) {
        char temp = str.charAt(indexToCapitalize);
        char replace = Character.toUpperCase(temp);

        return str.substring(0, indexToCapitalize) + replace + str.substring(indexToCapitalize + 1);
    }

    public static Boolean isCharacterAtIndex(String baseString, Character characterToCheckFor, Integer indexOfString) {
        for (int i = 0; i < baseString.length(); i++) {
            if (baseString.charAt(indexOfString) == characterToCheckFor) {
                return true;
            }
        }
        return false;

    }

    public static String[] getAllSubStrings(String string) {
        Set<String> substrings =new HashSet<>();
        for(int i =0; i< string.length();i++){
            for(int j=i+1; j<= string.length(); j++){
                substrings.add(string.substring(i,j));
            }
        }
        return substrings.toArray(new String[1]);
    }

    public static Integer getNumberOfSubStrings(String input){
        return getAllSubStrings(input).length;
    }
}
