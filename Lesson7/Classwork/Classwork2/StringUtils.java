package Lesson7.Classwork.Classwork2;


import java.util.Arrays;

public class StringUtils {
//    подсчитать кол-во вхождений символа c в строку s
    public static int countCharacterEntries(String s, char c) {
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == c){
                count++;
            }
        }
        return count;

    }

//    заменить все точки на смайлы, например " :) "
    public static String smile(String s) {
        return s.replace(".", " :) ");
    }

//    удалить все смайлы из строки
    public static String unsmile(String s) {
        s = s.replace(":)","");
        return s;
    }

//    строка начинается с цифры
    public static boolean startsWithDigit(String s) {
        return ('0' <= s.charAt(0) && s.charAt(0) <= '9');
    }

//    найти все индексы вхождений числа 20 в строку
    public static int indexes20(String s) {
        int count = 0;
//        char[] chars = new char[s.length()];
//        for (int i = 0; i <chars.length; i++) {
//            chars[i] = s.charAt(i);
//        }
//
//        for (int i = 0;i < s.length(); i++) {
//            if (chars[i] == '2' && chars[i + 1] == '0') {
//                count++;
//            }
//        }
        for (int i = 0; i < s.length(); i++) {
            if (s.indexOf("2",i) == i && s.indexOf("0",i) == i + 1) {
                count++;
            }
        }
        return count;
    }

//    найти самую длинную строку. Если несколько строк имеют одинаковую длину - вывести любую. Или лучше их все, но необязательно.
    public static String findLongest(String... strings) {
        int max = strings[0].length();
        String maxString = strings[0];
        for (int i = 1; i < strings.length; i++) {
            if (max < strings[i].length()) {
                max = strings[i].length();
                maxString = strings[i];
            }
        }
        return maxString;
    }

//    отсортировать в лексикографическом (алфавитном) порядке, учесть регистр
    public static String[] sort(String... strings) {
        Arrays.sort(strings);
        return strings;
    }

//    перевернуть строку
    public static String reverse(String s) {
        StringBuilder reversed = new StringBuilder(s);
        return reversed.reverse().toString();
    }
//    строка является палиндромом
    public static boolean isPalindrome(String s) {
        StringBuilder reversed = new StringBuilder(s);
        return reversed.reverse().toString().equals(s);
    }

//    СдЕлАтЬ Со сТрОкОй вОт тАкОе
    public static String wow(String s) {
        String[] arrayOfStrings = new String[s.length()];
        for (int i = 0; i < s.length(); i++) {
            arrayOfStrings[i] = s.substring(i,i+1);
        }

        for (int i = 0; i < arrayOfStrings.length; i++) {
            if (i % 2 == 0) {
                arrayOfStrings[i] = arrayOfStrings[i].toUpperCase();
            } else {
                arrayOfStrings[i] = arrayOfStrings[i].toLowerCase();
            }
        }

        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < arrayOfStrings.length; i++) {
            builder.append(arrayOfStrings[i]);
        }



        return builder.toString();
    }

//    найти самый часто встречающийся символ
    public static char findMostFrequentChar(String s) {
        char[] chars = new char[s.length()];
        for (int i = 0; i <chars.length; i++) {
            chars[i] = s.charAt(i);
        }

        int[] results = new int[chars.length];

        int count = 0;
        for (int i = 0; i < chars.length; i++) {
            count = 0;
            for (int j = 0; j < chars.length; j++) {
                if (chars[i] == chars[j]) {
                    count++;
                }
            }
            results[i] = count;
        }

        int max = results[0];
        int maxIndex = 0;
        for (int i = 1; i < results.length; i++) {
            if (max < results[i]){
                max = results[i];
                maxIndex = i;
            }
        }
        return chars[maxIndex];
    }

    //    найти первый символ, который встречается в строке один раз
    public static char findFirstNonRepeating(String s) {
        char[] chars = new char[s.length()];
        for (int i = 0; i < chars.length; i++) {
            chars[i] = s.charAt(i);
        }

        int[] results = new int[chars.length];

        int count = 0;
        for (int i = 0; i < chars.length; i++) {
            count = 0;
            for (int j = 0; j < chars.length; j++) {
                if (chars[i] == chars[j]) {
                    count++;
                }
            }
            results[i] = count;
            if (count == 1){
                break;
            }
        }

        int minIndex = 0;
        for (int i = 0; i < results.length; i++) {
            if (results[i] == 1){
                minIndex = i;
            }
        }
        return chars[minIndex];
    }
}
