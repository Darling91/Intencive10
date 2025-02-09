package ru_aston_Gerasimovich_DS.task2;

public class Algorythm2 {

    // 2) Напишите метод, который меняет местами первый и последний элемент массива.

    public static void swapFirstLast(int[] arr1) {
        if (arr1.length > 1) { // Проверяем, что массив содержит более одного элемента
            int temp = arr1[0];
            arr1[0] = arr1[arr1.length - 1];
            arr1[arr1.length - 1] = temp;
        }
    }
}
