package Lesson7.Homework;

public class Main {
    public static void main(String[] args) {
        String s = "Qwertyuioprrr";
        System.out.println(StringUtils.cutString(s,"w","p"));

        System.out.println(StringUtils.replace3To0(s));

        System.out.println(StringUtils.countWords(" Посчитать  количество слов ф"));

        System.out.println(StringUtils.hasPalindrome("qw qqqw wqe qq "));

        System.out.println(StringUtils.hasPalindrome("qwerty qwerty qwerty "));


    }
}
