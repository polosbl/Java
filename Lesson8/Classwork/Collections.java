package Lesson8.Classwork;

import java.util.*;

public class Collections {
    public static List getColorsList() {
        List<String> colors = new ArrayList<>();
        colors.add("Red");
        colors.add("Yellow");
        colors.add("Green");
        return colors;
    }

    public static void printCollection(List<String> list) {
//        for (int i = 0; i < list.size(); i++) {
//            System.out.println(list.get(i));
//        }

        for (String s : list) {
            System.out.println(s);
        }
    }

    public static void addOrange(List<String> list) {
        list.add(1, "Orange");
    }

    public static void changeColor(List<String> list) {
        for (String s : list) {
            if (s.equals("Green")) {
                list.set(list.indexOf(s), "White");
            }
        }
    }

    public static List getReverseList(List<String> list) {
        List<String> reversedList = new ArrayList<>();

        for (int i = list.size() - 1; i >= 0; i--) {
            reversedList.add(list.get(i));
        }
        return reversedList;
    }

    public static List swapFirstAndLast(List<Integer> list) {
        List<Integer> newList = new ArrayList<>();
        newList.add(list.get(list.size() - 1));
        for (int i = 1; i < list.size() - 1; i++) {
            newList.add(i, list.get(i));
        }
        newList.add(list.size() - 1, list.get(0));
        return newList;
    }

    public static List join(List<Integer> list1,List<Integer> list2) {
        List<Integer> newList = new ArrayList<>();
        for (int i = 0; i <list1.size(); i++) {
            newList.add(list1.get(i));
        }
        for (int i = 0; i <list2.size(); i++) {
            newList.add(list2.get(i));
        }
        return newList;
    }


    public static int printUniqueCharacters(String string) {
        Set<String> uniqueChars = new HashSet<>();
        for (int i = 0; i < string.length(); i++) {
            String a = string.substring(i, i + 1);
            uniqueChars.add(a);
        }
        return uniqueChars.size();
    }

    public static Set getPalindroms(List<String> list) {
        Set<String> listOfPalindroms = new HashSet<>();
        for (String s : list){
            StringBuilder reversed = new StringBuilder(s);
            if (reversed.reverse().toString().equals(s)) {
                listOfPalindroms.add(s);
            }
        }
        return listOfPalindroms;
    }

    public static int countSharedElements(List<Integer> list1, List<Integer> list2) {
        Set<Integer> numbers = new HashSet<>();

//        for (int i = 0; i <list1.size(); i++) {
//            for (int j = 0; j < list2.size(); j++) {
//                if (list1.get(i) == list2.get(j)) {
//                    numbers.add(list1.get(i));
//                }
//            }
//        }

        for (Integer i : list1) {
            for (Integer j : list2) {
                if (i == j) {
                    numbers.add(i);
                }
            }
        }
        return numbers.size();
    }

    public static Map getRainbowColors() {
        Map<String,Integer> rainbowColors = new HashMap<>();
        rainbowColors.put("Red",1);
        rainbowColors.put("Orange",2);
        rainbowColors.put("Yellow",3);
        rainbowColors.put("Green",4);
        rainbowColors.put("Blue",5);
        rainbowColors.put("Purple",6);

        return rainbowColors;
    }

    public static void printMap(Map<String,Integer> map) {
        Set<String> setOfKeys = new HashSet<>(map.keySet());
        for (String s : setOfKeys){
            System.out.println(s + ": " + map.get(s));
        }
    }

    public static Map evenAndOdd(List<Integer> list) {
        Map<Integer,String> map = new HashMap<>();
        for (int i = 0; i < list.size();i++) {
            if (list.get(i) % 2 == 0) {
                map.put(list.get(i),"Even");
            } else {
                map.put(list.get(i),"Odd");
            }
        }
        return map;
    }

    public static Map evenAndOdd2(List<Integer> list) {
        Map<String,List<Integer>> map = new HashMap<>();
        List<Integer> odd = new ArrayList<>();
        List<Integer> even = new ArrayList<>();
        for (int i = 0; i < list.size();i++) {
            if (list.get(i) % 2 == 0) {
                even.add(list.get(i));
            } else {
                odd.add(list.get(i));
            }
        }
        map.put("Even",even);
        map.put("Odd",odd);

        return map;
    }

}
