package CollectionsHomeTasks.CollectionsDemo;

import java.util.*;

public class AllCollectionsDemo
{
    public static void main(String[] args)
    {
        // a) ArrayList
        List<String> arrayList = new ArrayList<>();
        arrayList.add("Apple");
        arrayList.add("Banana");
        arrayList.add("Orange");
        System.out.println("ArrayList: " + arrayList);
        Collections.sort(arrayList); // Sorting
        System.out.println("ArrayList after sorting: " + arrayList);
        arrayList.remove("Banana"); // Removing an element
        // Iterating through ArrayList
        System.out.println("Iterating through ArrayList:");
        for (String fruit : arrayList)
            System.out.println(fruit);


        // b) LinkedList
        List<String> linkedList = new LinkedList<>();
        linkedList.add("Dog");
        linkedList.add("Cat");
        linkedList.add("Cow");
        System.out.println("\nLinkedList before adding 'Elephant': " + linkedList);
        linkedList.addFirst("Elephant"); // Adding at the beginning
        linkedList.addLast("Lion"); // Adding at the end
        System.out.println("LinkedList after adding 'Elephant' and 'Lion': " + linkedList);
        linkedList.remove("Cat"); // Removing an element
        // Iterating through LinkedList
        System.out.println("Iterating through LinkedList:");
        for (String animal : linkedList)
            System.out.println(animal);

        // c) HashMap
        Map<Integer, String> hashMap = new HashMap<>();
        hashMap.put(1, "One");
        hashMap.put(2, "Two");
        hashMap.put(3, "Three");
        System.out.println("\nHashMap: " + hashMap);
        hashMap.remove(2); // Removing an entry
        System.out.println("HashMap after removing key 2: " + hashMap);
        hashMap.put(4, "Four");
        System.out.println("HashMap after adding key 4: " + hashMap);

        // d) LinkedHashMap
        Map<Integer, String> linkedHashMap = new LinkedHashMap<>();
        linkedHashMap.put(3, "Three");
        linkedHashMap.put(1, "One");
        linkedHashMap.put(2, "Two");
        linkedHashMap.put(4, "Four");
        System.out.println("LinkedHashMap after adding key 4: " + linkedHashMap);
        linkedHashMap.remove(1); // Removing an entry
        // System.out.println("Iterating through HashMap:");
        for (Map.Entry<Integer, String> entry : hashMap.entrySet())
                System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue());


        // e) HashSet
        Set<String> hashSet = new HashSet<>();
        hashSet.add("Red");
        hashSet.add("Green");
        hashSet.add("Blue");
        hashSet.add("Red");  // Duplicate element, won't be added
        hashSet.add("Purple"); // Adding an element
        System.out.println("HashSet: " + hashSet);
        hashSet.remove("Green"); // Removing an element
        System.out.println("Iterating through HashSet:");
        for (String color : hashSet) {
            System.out.println(color);
        }

        // f) LinkedHashSet
        Set<String> linkedHashSet = new LinkedHashSet<>();
        linkedHashSet.add("USA");
        linkedHashSet.add("UK");
        linkedHashSet.add("Canada");
        linkedHashSet.add("USA");  // Duplicate element, won't be added
        linkedHashMap.put(4, "Four");
        System.out.println("LinkedHashMap after adding key 4: " + linkedHashMap);
        linkedHashMap.remove(1); // Removing an entry
        System.out.println("Iterating through LinkedHashMap:");
        for (Map.Entry<Integer, String> entry : linkedHashMap.entrySet()) {
            System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue());
        }

        // g) TreeSet
        Set<String> treeSet = new TreeSet<>();
        treeSet.add("Pineapple");
        treeSet.add("Mango");
        treeSet.add("Apple");
        treeSet.add("Banana");
        System.out.println("TreeSet (Sorted): " + treeSet);
        treeSet.remove("Mango"); // Removing an element
        // Iterating through TreeSet
        System.out.println("Iterating through TreeSet:");
        for (String fruit : treeSet) {
            System.out.println(fruit);
        }

        // h) TreeMap
        Map<Integer, String> treeMap = new TreeMap<>();
        treeMap.put(5, "Five");
        treeMap.put(3, "Three");
        treeMap.put(4, "Four");
        treeMap.put(1, "One"); // Adding an entry
        System.out.println("TreeMap " + treeMap);
        treeMap.remove(3); // Removing an entry

        // Iterating through TreeMap
        System.out.println("Iterating through TreeMap:");
        for (Map.Entry<Integer, String> entry : treeMap.entrySet()) {
            System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue());
        }
    }
}
