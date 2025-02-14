package ru_aston_Gerasimovich_DS.task2;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.TreeSet;
import java.util.Collections;

public class CollectionLab {

    public static void main(String[] args) {
        // 1. Создание ArrayList с разными конструкторами
        ArrayList<Integer> arrayList1 = new ArrayList<>(); // Пустой
        ArrayList<Integer> arrayList2 = new ArrayList<>(10); // С заданной емкостью
        ArrayList<Integer> arrayList3 = new ArrayList<>(arrayList1); // Из другой коллекции
        arrayList1.add(1);
        arrayList1.add(2);

        // 2. Создание HashMap с разными конструкторами
        HashMap<String, Integer> hashMap1 = new HashMap<>(); // Пустой
        HashMap<String, Integer> hashMap2 = new HashMap<>(10); // С заданной емкостью
        HashMap<String, Integer> hashMap3 = new HashMap<>(hashMap1); // Из другой коллекции
        hashMap1.put("one", 1);
        hashMap1.put("two", 2);

        // 3. Создание TreeSet с разными конструкторами
        TreeSet<Integer> treeSet1 = new TreeSet<>(); // Пустой
        TreeSet<Integer> treeSet2 = new TreeSet<>(arrayList1); // Из другой коллекции
        TreeSet<Integer> treeSet3 = new TreeSet<>((a, b) -> b - a); // С пользовательским компаратором
        treeSet1.add(1);
        treeSet1.add(2);

        // Вызов методов для ArrayList
        System.out.println("ArrayList:");
        System.out.println("Size: " + arrayList1.size());
        System.out.println("Contains 1: " + arrayList1.contains(1));
        Collections.sort(arrayList1);
        System.out.println("Sorted: " + arrayList1);

        // Вызов методов для HashMap
        System.out.println("\nHashMap:");
        System.out.println("Size: " + hashMap1.size());
        System.out.println("Contains key 'one': " + hashMap1.containsKey("one"));
        System.out.println("Value for 'one': " + hashMap1.get("one"));

        // Вызов методов для TreeSet
        System.out.println("\nTreeSet:");
        System.out.println("Size: " + treeSet1.size());
        System.out.println("Contains 1: " + treeSet1.contains(1));
        System.out.println("First element: " + treeSet1.first());
    }
}
