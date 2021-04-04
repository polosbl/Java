package Lesson7.Classwork.Classwork2;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        String s = "...";
        System.out.println(StringUtils.smile(s));

        s = "Hello lol";
        System.out.println(StringUtils.countCharacterEntries(s, 'l'));

        s = "a:)b";
        System.out.println(StringUtils.unsmile(s));

        s = "1aaa";
        System.out.println(StringUtils.startsWithDigit(s));

        s = "aaa1";
        System.out.println(StringUtils.startsWithDigit(s));

        s = "202020 aaa 20";
        System.out.println("index 20: " + StringUtils.indexes20(s));

        String s1 = "111";
        String s2 = "111111111";
        String s3 = "111111222222";
        System.out.println(StringUtils.findLongest(s1,s2,s3));

        String[] sorted = StringUtils.sort("aaa","bbb","ab","AA","AB","AAa");
        System.out.println(Arrays.toString(sorted));

        System.out.println(StringUtils.reverse("abcdef"));

        System.out.println("Палидром: " + StringUtils.isPalindrome("шалаш"));
        System.out.println("Палидром: " + StringUtils.isPalindrome("шалаa"));

        System.out.println(StringUtils.wow("сделать чудо"));
//        System.out.println(s.contains("aaa"));

        System.out.println(StringUtils.findMostFrequentChar("abcdaabbabbbccccc"));

        System.out.println(StringUtils.findFirstNonRepeating("abcaqabbabbbcfcccc"));

    }
}
