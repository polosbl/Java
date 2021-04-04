package Lesson7.Homework;


import java.util.ArrayList;
import java.util.List;

public class StringUtils {
    public static String cutString(String s, String a, String b) {
        return s.substring(s.indexOf(a), s.indexOf(b) + 1);
    }

    public static String replace3To0(String s) {
        return s.replace(s.charAt(3), s.charAt(0));
    }

    public static boolean isPalindrome(String s) {
        StringBuilder reversed = new StringBuilder(s);
        return reversed.reverse().toString().equals(s);
    }

    public static int countWords(String s) {
        s = s.trim();
        int count = 0;
        if (s.length() != 0) {
            count++;
            for (int i = 0; i < s.length(); i++) {
                if (s.charAt(i) == ' ' && !(s.charAt(i + 1) == ' ')) {
                    count++;
                }
            }
        }

        return count;
    }

    public static boolean hasPalindrome(String s) {

        boolean hasPalindrome = false;

        List<String> words = new ArrayList<>();

        int j = 0;
        while (j < s.length()) {
            words.add(s.substring(j,s.indexOf(' ',j) + 1).trim());
            j += s.substring(j,s.indexOf(' ',j) + 1).length();
        }


        for (int i = 0; i < words.size(); i++){
            StringBuilder reversed = new StringBuilder(words.get(i));
            if (reversed.reverse().toString().equals(words.get(i))){
                hasPalindrome = true;
                break;
            }
        }
        return hasPalindrome;
    }

}
