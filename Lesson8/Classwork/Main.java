package Lesson8.Classwork;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        System.out.println(Collections.getColorsList());

        List<String> list1 = new ArrayList<>();
        list1.add("Red");
        list1.add("Yellow");
        list1.add("Green");

        Collections.printCollection(list1);

        Collections.addOrange(list1);
        System.out.println(list1);

        Collections.changeColor(list1);
        System.out.println(list1);

        System.out.println(Collections.getReverseList(list1));

        List<Integer> swap1 = new ArrayList<>();
        swap1.add(1);
        swap1.add(2);
        swap1.add(3);
        swap1.add(4);
        swap1.add(5);

        System.out.println(Collections.swapFirstAndLast(swap1));

        System.out.println(Collections.printUniqueCharacters("aabcdeffg"));

        List<String> list2 = new ArrayList<>();
        list2.add("шалаш");
        list2.add("дом");
        list2.add("lol");
        list2.add("aaa");
        list2.add("bbb");
        list2.add("aaavvvbb");

        System.out.println(Collections.getPalindroms(list2));

        List<Integer> listOfNumbers1 = new ArrayList<>();
        listOfNumbers1.add(1);
        listOfNumbers1.add(22);
        listOfNumbers1.add(33);
        listOfNumbers1.add(2);
        listOfNumbers1.add(3);
        listOfNumbers1.add(44);

        List<Integer> listOfNumbers2 = new ArrayList<>();
        listOfNumbers2.add(1);
        listOfNumbers2.add(55);
        listOfNumbers2.add(3);
        listOfNumbers2.add(25);
        listOfNumbers2.add(31);
        listOfNumbers2.add(44);
        listOfNumbers2.add(22);

        System.out.println(Collections.countSharedElements(listOfNumbers1,listOfNumbers2));

        System.out.println(Collections.join(listOfNumbers1,listOfNumbers2));

        Map<String,Integer> rainbowColors = new HashMap<>();
        rainbowColors.put("Red",1);
        rainbowColors.put("Orange",2);
        rainbowColors.put("Yellow",3);
        rainbowColors.put("Green",4);
        rainbowColors.put("Blue",5);
        rainbowColors.put("Purple",6);

        Collections.printMap(rainbowColors);

        System.out.println(Collections.evenAndOdd(listOfNumbers1));
        System.out.println(Collections.evenAndOdd2(listOfNumbers1));

        System.out.println(Collections.getCharactersFrequencies("Qqqwertyyyyt"));

    }
}
