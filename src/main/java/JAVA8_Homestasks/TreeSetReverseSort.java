package JAVA8_Homestasks;

import java.util.*;

class ReverseSortValueComparator implements Comparator<Map.Entry<Integer, String>>
{
    @Override
    public int compare(Map.Entry<Integer, String> e1, Map.Entry<Integer, String> e2) {
        return e2.getValue().compareTo(e1.getValue());
    }
}
public class TreeSetReverseSort
{
    public static void main(String[] args) {

        TreeMap<Integer, String> map = new TreeMap<>();
        map.put(1, "One");
        map.put(5, "Five");
        map.put(3, "Three");
        map.put(2, "Two");

        List<Map.Entry<Integer, String>> entryList = new ArrayList<>(map.entrySet());

        entryList.sort(new ReverseSortValueComparator());

        System.out.println("Map sorted by value without lambda :");
        for (Map.Entry<Integer, String> entry : entryList) {
            System.out.println(entry.getKey() + " = " + entry.getValue());
        }

        entryList.sort((e1, e2) -> e2.getValue().compareTo(e1.getValue()));
        System.out.println("Map sorted by value (with lambda):");
        for (Map.Entry<Integer, String> entry : entryList) {
            System.out.println(entry.getKey() + " = " + entry.getValue());
        }
    }
}
